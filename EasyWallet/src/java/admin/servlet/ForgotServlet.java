/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.model.Mailer;
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
@WebServlet(name = "ForgotServlet", urlPatterns = {"/ForgotServlet"})
public class ForgotServlet extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	String to=request.getParameter("eml");

                int i=Mailer.send(to);
                if(i>0){
                    response.sendRedirect("index.jsp");
                }
                else{
                    response.sendRedirect("login.jsp");
                }
   }
}
