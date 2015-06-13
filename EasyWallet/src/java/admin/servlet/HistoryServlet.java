/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.bean.History;
import admin.model.HistoryDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gagan
 */
@WebServlet(name = "HistoryServlet", urlPatterns = {"/HistoryServlet"})
public class HistoryServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String name=request.getParameter("name");
        int tid=Integer.parseInt(request.getParameter("tid"));
        System.out.println(name+tid);
        HistoryDao hd=new HistoryDao();
        if(name.equals("view"))
        {           
            History hs=hd.editHistory(tid);
            if(hs.isValid()==true)
            {
                request.setAttribute("history", hs);
                RequestDispatcher rd=request.getRequestDispatcher("history_edit.jsp");
                rd.forward(request, response);
            }
            else
            {
                response.sendRedirect("history.jsp");
            }
        }
        else if(name.equals("view1"))
        {           
            History hs=hd.editSend(tid);
            if(hs.isValid()==true)
            {
                request.setAttribute("history", hs);
                RequestDispatcher rd=request.getRequestDispatcher("history_send_edit.jsp");
                rd.forward(request, response);
            }
            else
            {
                response.sendRedirect("history.jsp");
            }
        }
        else if(name.equals("delete"))
        {
            int status=hd.deleteHistory(tid);
            if(status>0)
            {
                response.sendRedirect("history.jsp");
            }
            else
            {
                response.sendRedirect("history.jsp");
            }
        }
        
        else
        {
            
        }
    }
    
}
