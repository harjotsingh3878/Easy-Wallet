/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import admin.bean.Account;
import admin.bean.History;
import java.sql.Connection;
import java.sql.ResultSet;
import admin.bean.User;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author gagan
 */
public class Login {
    
    static Connection currenConn=ConnectionManager.getConnection();
     

    public User login(String name,String pass)
    {
         User user=new User(); 
         boolean flag=false;
         boolean more=false;

        try{
              PreparedStatement ps=currenConn.prepareStatement("SELECT * from account where account_id=? ");
              ps.setString(1, name);
              ResultSet rs=ps.executeQuery();
              if(rs.next())
              {
                 flag=true; 
              }
         }
        catch(Exception e)
        {
            System.out.println("acc_id-->"+e);
        }
              
              if(!flag)
              {
                  try {
                         PreparedStatement ps=currenConn.prepareStatement("SELECT * from account_details where email=? and password=? ");
                         ps.setString(1, name);
                         ps.setString(2, pass);
                         ResultSet rs=ps.executeQuery();
                         if(rs.next())
                         {
                             more=true;
                         }
                          if(!more)
                         {
                              user.setValid(false);
                         }
                         else
                         {
                              String firstName = rs.getString("fname");
                              String lastName = rs.getString("lname");
                              String category= rs.getString("user_type");
                                                
                              user.setFirstname(firstName);
                              user.setLastname(lastName);
                              user.setUser_type(category);
                              user.setAid(rs.getInt("aid"));
                              user.setEmail(rs.getString("email"));
                              user.setAddress(rs.getString("address"));
                              user.setCity(rs.getString("city"));
                              user.setCountry(rs.getString("country"));
                              user.setDate(rs.getString("dte"));
                              user.setMobile(rs.getString("mobile"));
                              user.setSecure1(rs.getString("secure1"));
                              user.setSecure2(rs.getString("secure2"));
                              user.setAnswer1(rs.getString("answer1"));
                              user.setAnswer2(rs.getString("answer2"));
                              user.setValid(true);
                         }
                  }
                  catch(Exception e)
                  {
                      System.out.println("email error-->"+e);
                  }
              }
              else
              {
                  try {
                         PreparedStatement ps=currenConn.prepareStatement("SELECT * from account_details where  password=? ");
                         ps.setString(1, pass);
                         ResultSet rs=ps.executeQuery();
                         if(rs.next())
                         {
                             more=true;
                         } 
                         if(!more)
                         {
                              user.setValid(false);
                         }
                         else
                         {
                              String firstName = rs.getString("fname");
                              String lastName = rs.getString("lname");
                              String category= rs.getString("user_type");
                              
                              user.setSecure1(rs.getString("secure1"));
                              user.setSecure2(rs.getString("secure2"));
                
                              user.setUser_type(category);
                              user.setFirstname(firstName);
                              user.setLastname(lastName);
                              user.setAid(rs.getInt("aid"));
                              user.setValid(true);
                         }                   
                         
                  }
                  catch(Exception e)
                  {
                      System.out.println("account_id error-->"+e);
                  }
              }
              if(user.isValid())
              {
                  try
                  {
                      String dt=null,time=null;
                      Statement s=currenConn.createStatement();
                      ResultSet r=s.executeQuery("select sysdate from dual");
                      if(r.next())
                      {
                          dt=r.getString(1);
                      }                    
                /*      Statement s1=currenConn.createStatement();
                      ResultSet r1=s1.executeQuery("SELECT TO_CHAR (SYSDATE, 'hh:mi:ss') FROM DUAL");
                      if(r1.next())
                      {
                          time=r1.getString(1);
                      }                     
                      String dtime=dt+time;*/
                      PreparedStatement ps1=currenConn.prepareStatement("update account set login=? where aid=?");
                      ps1.setString(1, dt);
                      ps1.setInt(2, user.getAid());
                      ps1.executeUpdate();
                      
                  }
                  catch(Exception e1)
                  {
                      System.out.println("update login-->"+e1);
                  }
              }
           
        return user;
    }
    
    public Account getAccount(int aid)
    {
        Account acc=new Account();
        
        try
        {
            currenConn=ConnectionManager.getConnection();
              
              PreparedStatement ps=currenConn.prepareStatement("SELECT * from account where aid=? ");
              ps.setInt(1, aid);
              ResultSet rs=ps.executeQuery();
              if(rs.next())
              {
                  acc.setDid(rs.getInt("did"));
                  acc.setAccount_id(rs.getString("account_id"));
                  acc.setSecure_id(rs.getString("secure_id"));
                  acc.setBalance(rs.getString("balance"));
                  acc.setLogin(rs.getString("last_login"));
                  acc.setCards(rs.getString("cards"));
                  acc.setAid(rs.getInt("aid"));
                  
                  acc.setValid(true);
              }
        }
        catch(Exception e)
        {
            System.out.println("getAccount-->"+e);
        }
        return acc;
    }
    
    public ArrayList getHistory(int aid)
    {
        ArrayList al=new ArrayList();
        
        
        try
        {
            currenConn=ConnectionManager.getConnection();
              
              PreparedStatement ps=currenConn.prepareStatement("SELECT * from history where aid=? ");
              ps.setInt(1, aid);
              ResultSet rs=ps.executeQuery();
              if(rs.next())
              {
                  History hs=new History();
                hs.setTid(rs.getInt("tid"));
                hs.setType(rs.getString("transaction_type"));
                hs.setAmount(rs.getInt("amount"));
                hs.setStatus(rs.getString("status"));
                hs.setDte(rs.getString("dte"));
                hs.setCard(rs.getInt("card"));
                hs.setHolder(rs.getString("holder"));
                hs.setBank(rs.getString("bank"));
                hs.setExpiry(rs.getString("expiry"));
                hs.setAid(rs.getInt("aid"));
                hs.setMsg_to(rs.getString("send_to"));
                hs.setMsg_from(rs.getString("send_from"));
                hs.setMsg(rs.getString("message"));
                hs.setRead(rs.getInt("read"));
                al.add(hs);
              }
        }
        catch(Exception e)
        {
            System.out.println("getHistory-->"+e);
        }
        return al;
    }
    
}
