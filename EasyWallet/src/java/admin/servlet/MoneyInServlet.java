/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.servlet;

import admin.bean.MoneyIn;
import admin.model.MoneyInDao;
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
@WebServlet(name = "MoneyInServlet", urlPatterns = {"/MoneyInServlet"})
public class MoneyInServlet extends HttpServlet{
   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        MoneyInDao mid=new MoneyInDao();
        if(request.getParameter("from_card")!=null){
           String amt=request.getParameter("amount");
           String select=request.getParameter("select");
           String secure=request.getParameter("secure");
           int did=Integer.parseInt(request.getParameter("did"));
            System.out.println(amt+select+secure+did);
           int i=mid.cardMoney(amt,select, secure, did);
           if(i>0)
           {
               response.sendRedirect("money_in_first.jsp");
           }
           else
           {
               response.sendRedirect("money_out_first.jsp");
           }
        }
        
        MoneyIn min=new MoneyIn();
        if(request.getParameter("credit")!=null)
        {
 
        min.setCredit(request.getParameter("credit"));
        min.setAmount(Integer.parseInt(request.getParameter("amount")));    
        min.setSecure_id(request.getParameter("sid"));
      //  min.setDid(Integer.parseInt(request.getParameter("did")));
        if(min.getCredit().equals("credit"))
        {       
            System.out.println(min.getCredit()+min.getAmount()+min.getSecure_id());
        min.setCard_no(request.getParameter("cards"));
        min.setHolder(request.getParameter("hname"));
        min.setExpiry(request.getParameter("expiry"));
        min.setCvv(Integer.parseInt(request.getParameter("cvv")));     
        }
        else if(min.getCredit().equals("debit"))
        {
        min.setBank(request.getParameter("bank"));
        min.setCard_no(request.getParameter("cards"));
        min.setHolder(request.getParameter("hname"));
        min.setExpiry(request.getParameter("expiry"));
        min.setCvv(Integer.parseInt(request.getParameter("cvv")));
        }
        else if(min.getCredit().equals("net"))
        {
        min.setBank(request.getParameter("bank"));
        min.setTrans_id(request.getParameter("tran"));
        }
        
        int status=mid.getMoney(min);
        if(status>0)
        {
            response.sendRedirect("money_in_3.jsp");
        }
        else
        {
            response.sendRedirect("money_in.jsp");
        }
        }
        
    }
    
}
