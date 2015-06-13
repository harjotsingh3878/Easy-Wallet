/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.servlet;

import admin.bean.Cards;
import admin.model.CardDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author harjot
 */
@WebServlet(name = "CardServlet", urlPatterns = {"/CardServlet"})
public class CardServlet extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        CardDao cd=new CardDao();
        if(request.getParameter("cid")!=null){
            int cid=Integer.parseInt(request.getParameter("cid"));
            int a=cd.removeCards(cid);
            if(a<0)
            {
                response.sendRedirect("money_in_first.jsp");
            }
            else
            {
                response.sendRedirect("money_in_first.jsp");
            }
        }
        Cards card=new Cards();
        card.setType(request.getParameter("type"));
        card.setNumber(request.getParameter("card"));    
        card.setCvv(Integer.parseInt(request.getParameter("cvv")));
        card.setHolder(request.getParameter("holder"));
        card.setExpiry(request.getParameter("expiry"));
        card.setSid(request.getParameter("sid"));
        card.setDid(Integer.parseInt(request.getParameter("did")));
        
        int i=cd.registerCard(card);
        if(i>0){
            response.sendRedirect("money_in_first.jsp");
        }
        else{
            response.sendRedirect("card_register.jsp");
        }
    }
    
}
