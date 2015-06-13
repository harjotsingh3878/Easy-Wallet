/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.bean.Account;
import admin.bean.User;
import admin.model.UserDao;
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
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String opt=request.getParameter("opt");
        String search=request.getParameter("search");
        int aid=0;
        if(request.getParameter("aid")!=null){
            aid=Integer.parseInt(request.getParameter("aid"));
        }
        System.out.println(aid);
        UserDao ud=new UserDao();
        if(opt.equals("edit"))
        {           
            Account ac=ud.getAccount(aid);
            User us=ud.getAcc_Details(aid);
            System.out.println(us.isValid());
            if(us.isValid()==true)
            {
                request.setAttribute("account", ac);
                request.setAttribute("user", us);
                RequestDispatcher rd=request.getRequestDispatcher("users_edit_1.jsp");
                rd.forward(request, response);
            }
            else
            {
                response.sendRedirect("users.jsp");
            }
        }
        else if(opt.equals("delete"))
        {
            int status=ud.deleteUser(aid);
            if(status>0)
            {
                response.sendRedirect("history.jsp");
            }
            else
            {
                response.sendRedirect("history.jsp");
            }
        }
        
        else if(opt.equals("email"))
        {
             User us=ud.getEmail(search);
             Account ac=ud.getAccount(us.getAid());

            if(us.isValid()==true)
            {
                request.setAttribute("account", ac);
                request.setAttribute("user", us);
                RequestDispatcher rd=request.getRequestDispatcher("users_edit.jsp");
                rd.forward(request, response);
            }
            else
            {
                response.sendRedirect("users.jsp");
            }
        }
        
        
    }
    
}
