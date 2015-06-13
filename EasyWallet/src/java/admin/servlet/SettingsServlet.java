/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.model.SettingsDao;
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
@WebServlet(name = "SettingsServlet", urlPatterns = {"/SettingsServlet"})
public class SettingsServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int aid=0;
        String uname=request.getParameter("uname");
        String upass=request.getParameter("upass");
        String uname1=request.getParameter("uname1");
        String upass1=request.getParameter("upass1");
        String submit=request.getParameter("action");
        if(request.getParameter("aid")!=null)
        {
            aid=Integer.parseInt(request.getParameter("aid"));
        }
         
        int i=0;
        SettingsDao sd=new SettingsDao();
        
        if(submit.equals("secure")){
            i=sd.changeSecure(aid,upass);
            if(i>0){
                response.sendRedirect("details_account.jsp");
            }
            else{
                response.sendRedirect("security.jsp");
            }
        }
        else if(submit.equals("pass")){
            i=sd.changePass(aid,uname,upass);
            if(i>0){
                response.sendRedirect("details_account.jsp");
            }
            else{
                response.sendRedirect("password.jsp");
            }
        }
        else if(submit.equals("retrieve")){
            String secure=sd.retrieve(aid,upass,upass1);
            
                response.sendRedirect("retrieve_secure_1.jsp?secure="+secure);
           
        }
    }
    
}
