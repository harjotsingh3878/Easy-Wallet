/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.bean.Account;
import admin.bean.History;
import admin.bean.User;
import admin.model.Login;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gagan
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet{
    
     public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
           User user=null;
            Account acc=null;
            History hs=null;
            String error="Login failed";
           String name=request.getParameter("uname");
           String pass=request.getParameter("upass");
           
           Login ld=new Login();
           user=ld.login(name,pass);
           acc=ld.getAccount(user.getAid());
            ArrayList al=ld.getHistory(acc.getDid());
            System.out.println(al+"ertt");
           String category=user.getUser_type();
           if(user.isValid())
           {
               if("admin".equals(category))
            {
                HttpSession session=request.getSession(true);
                session.setAttribute("account", acc);
                session.setAttribute("user", user);
                request.setAttribute("history", al);
                RequestDispatcher rd=request.getRequestDispatcher("details_account.jsp");
                rd.forward(request, response);
            }
            else if("user".equals(category))
            {
                System.out.println(user+""+acc);
                HttpSession session=request.getSession(true);
                session.setAttribute("account", acc);
                session.setAttribute("user", user);
                request.setAttribute("history", al);
                RequestDispatcher rd=request.getRequestDispatcher("details_account.jsp");
                rd.forward(request, response);
            }
                
           }
           else
           {
               request.setAttribute("success", false);
               request.setAttribute("action", category);
               RequestDispatcher rd=request.getRequestDispatcher("login.jsp?error="+error);
               rd.forward( request, response ) ;
           }

        }
        catch(Throwable exception)
        {
            System.out.println(exception);
        }
        
    }
    
}
