/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.bean.Account;
import admin.bean.User;
import admin.model.Register;
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
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
    
    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
           String field_error="Fields are emplty";
           String error="Registration failed";
           String success="Registration successfull";
           Account acc=null;
           User user=null;           
           User b1=new User();
           
           String day=request.getParameter("day");
           String month=request.getParameter("month");
           String year=request.getParameter("year");
           String date=day+"/"+month+"/"+year;
           b1.setPassword(request.getParameter("pass"));
           b1.setFirstname(request.getParameter("fname"));
           b1.setLastname(request.getParameter("lname"));
           b1.setAddress(request.getParameter("address"));
           b1.setCity(request.getParameter("city"));
           b1.setCountry(request.getParameter("country"));
           b1.setDate(date);
           b1.setMobile(request.getParameter("mobile"));
           b1.setPassword(request.getParameter("password"));
           b1.setSecure1(request.getParameter("secure1"));
           b1.setAnswer1(request.getParameter("answer1"));
           b1.setSecure2(request.getParameter("secure2"));
           b1.setAnswer2(request.getParameter("answer2"));
           b1.setUser_type("user");
           b1.setEmail(request.getParameter("email"));
        
           System.out.println(b1.getCity()+b1.getCountry()+b1.getDate());
           Register reg=new Register();
           acc=reg.insertRecords(b1);
           user=reg.getAccount(acc.getAid());
           
           if(acc.isValid()==true)
           {
               HttpSession session=request.getSession(true);
               session.setAttribute("account", acc);
               session.setAttribute("user", user);
               response.sendRedirect("register_3.jsp?success"+success);
           }
           else if(acc.isValid()==false)
           {
               response.sendRedirect("register_1.jsp?error="+error);
           }
           else
           {
               response.sendRedirect("home.jsp?error="+error);
           }
    }
    
}
