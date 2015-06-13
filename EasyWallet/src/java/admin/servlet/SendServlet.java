/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.bean.History;
import admin.model.SendDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gagan
 */
@WebServlet(name = "SendServlet", urlPatterns = {"/SendServlet"})
public class SendServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        History sd=new History();
        sd.setAmount(Integer.parseInt(request.getParameter("amount")));
        sd.setMsg_to(request.getParameter("msg_to"));
        sd.setMsg_from(request.getParameter("msg_from"));
        sd.setMsg(request.getParameter("msg"));
        sd.setDid(Integer.parseInt(request.getParameter("did")));
        sd.setSid(request.getParameter("sid"));
        SendDao dao=new SendDao();
        System.out.println(request.getParameter("did"));
        int i=dao.insertSend(sd);
        System.out.println(i);
        if(i>0)
        {
            response.sendRedirect("money_out_first.jsp");
        }
        else
        {
            response.sendRedirect("money_out_send.jsp");
        }
    }
    
}
