/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.bean.Account;
import admin.bean.User;
import admin.model.Register;
import admin.model.UserDao;
import java.io.IOException;
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
@WebServlet(name = "UpdateHistory", urlPatterns = {"/UpdateHistory"})
public class UpdateHistory extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
           String field_error="Fields are emplty";
           String error="Registration failed";
           String success="Registration successfull";
           User user=null;           
           User b1=new User();
           
           b1.setAid(Integer.parseInt(request.getParameter("aid")));
           b1.setFirstname(request.getParameter("fname"));
           b1.setLastname(request.getParameter("lname"));
           b1.setAddress(request.getParameter("address"));
           b1.setCity(request.getParameter("city"));
           b1.setCountry(request.getParameter("country"));
           b1.setDate(request.getParameter("birth"));
           b1.setMobile(request.getParameter("mobile"));
           b1.setPassword(request.getParameter("password"));
           b1.setSecure1(request.getParameter("secure1"));
           b1.setAnswer1(request.getParameter("answer1"));
           b1.setSecure2(request.getParameter("secure2"));
           b1.setAnswer2(request.getParameter("answer2"));
           b1.setEmail(request.getParameter("email"));
        

           UserDao reg=new UserDao();
           int i=reg.editUser_Details(b1);
           
           if(i>0)
           {
               response.sendRedirect("users.jsp");
           }
           else
           {
               response.sendRedirect("users_edit.jsp?error="+error);
           }
    }
}
