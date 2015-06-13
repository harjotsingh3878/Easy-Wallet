/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import admin.bean.Account;
import admin.bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gagan
 */
public class Register {
    
    static Connection currenConn=null;
    static ResultSet rs=null;
            Statement stmt;
            
               
    public Account insertRecords(User b1)
    {
        Account acc=new Account();
        int aid=0;
        int did=0;
        String sid=null;
        acc.setValid(false);
        
          String firstname=b1.getFirstname();
          String lastname=b1.getLastname();
          String address=b1.getAddress();
          String city=b1.getCity();
          String country=b1.getCountry();
          String date=b1.getDate();
          String mobile=b1.getMobile();
          String password=b1.getPassword();
          String secure1=b1.getSecure1();
          String answer1=b1.getAnswer1();
          String secure2=b1.getSecure2();
          String answer2=b1.getAnswer2();
          String email=b1.getEmail();
          String user_type=b1.getUser_type();
          try
          {
              currenConn=ConnectionManager.getConnection();
              
              PreparedStatement p=currenConn.prepareStatement("SELECT ACCOUNT_DETAILS_SEQ.NEXTVAL FROM dual");
              ResultSet r=p.executeQuery();
              while(r.next()){
                  System.out.println("aid");
                  aid= r.getInt(1);
                  System.out.println(aid);
                  if(aid==0)
                  {
                      acc.setValid(false);
                  return acc;
                  }
              }
              
              
              PreparedStatement ps=currenConn.prepareStatement("insert into account_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
              ps.setInt(1, aid);
              ps.setString(2, firstname);
              ps.setString(3, lastname);
              ps.setString(4, address);
              ps.setString(5, city);
              ps.setString(6, country);
              ps.setString(7, mobile);
              ps.setString(8, date);
              ps.setString(9, password);
              ps.setString(10, secure1);
              ps.setString(11, answer1);
              ps.setString(12, secure2);
              ps.setString(13, answer2);
              ps.setString(14, email);
              ps.setString(15, user_type);
              ps.executeUpdate();
              System.out.println("success");
          }
          catch(Exception e)
          {
              System.out.println("insert record exception"+e);
          }
          
        String balance="0";
          String login=null;
          String cards="0";
         
        acc.setValid(false);
          try
          {
              currenConn=ConnectionManager.getConnection();
              System.out.println(email);
              
              PreparedStatement p5=currenConn.prepareStatement("select sysdate from dual");
              
              ResultSet r5=p5.executeQuery();
              if(r5.next())
              {
                  login=r5.getString(1);
              }
              
              PreparedStatement ps1=currenConn.prepareStatement("select aid from account_details where email=?");
              ps1.setString(1, email);
              ResultSet rs1=ps1.executeQuery();
              if(rs1.next())
              {
                  System.out.println("qget aid");
                  aid=rs1.getInt("aid");
                  System.out.println(aid);
              }
              
              PreparedStatement p1=currenConn.prepareStatement("SELECT ACCOUNT_SEQ.NEXTVAL FROM dual");
              ResultSet r1=p1.executeQuery();
              while(r1.next()){
                  System.out.println("did");
                  did= r1.getInt(1);
                  System.out.println(did);
              }
              
              String account_id=null;
              PreparedStatement p2=currenConn.prepareStatement("SELECT ACCOUNT_ID_SEQ.NEXTVAL FROM dual");
              ResultSet r2=p2.executeQuery();
              while(r2.next()){
                  System.out.println("account_id");
                  account_id= r2.getString(1);
                  System.out.println("asdf"+account_id);
                  
              }
              
              PreparedStatement p3=currenConn.prepareStatement("SELECT dbms_random.string('x', 8) FROM dual");
              ResultSet r3=p3.executeQuery();
              while(r3.next()){
                  
                  sid= r3.getString(1);
                  System.out.println(sid);
                  if(did==0||sid==null)
                  {
                      acc.setValid(false);
                  return acc;
                  }
              }
              
              
              
              PreparedStatement ps2=currenConn.prepareStatement("insert into account values(?,?,?,?,?,?,?,?)");
              ps2.setInt(1, did);
              ps2.setString(2, account_id);
              ps2.setString(3, sid);
              ps2.setString(4, balance);
              ps2.setString(5, login);
              ps2.setString(6, cards);
              ps2.setInt(7, aid);
              ps2.setString(8, "First Login");
              ps2.executeUpdate();
              System.out.println("account done");
              
              PreparedStatement ps3=currenConn.prepareStatement("select * from account where aid=?");
              ps3.setInt(1, aid);
              ResultSet rs3=ps3.executeQuery();
              if(rs3.next())
              {
                  acc.setAccount_id(rs3.getString("account_id"));
                  acc.setSecure_id(rs3.getString("secure_id"));
                  acc.setBalance(rs3.getString("balance"));
                  acc.setLogin(rs3.getString("last_login"));
                  acc.setCards(rs3.getString("cards"));
                  acc.setAid(rs3.getInt("aid"));
                  acc.setValid(true);
                  System.out.println("registered");
              }
              
          }
          catch(Exception e1)
          {
              System.out.println("generate account_id"+e1);
          }
          
          return acc;
          

    }
    
    public User getAccount(int aid)
    {
        User user=new User();
        
        try
        {
            currenConn=ConnectionManager.getConnection();
              
              PreparedStatement ps=currenConn.prepareStatement("SELECT * from account_details where aid=? ");
              ps.setInt(1, aid);
              ResultSet rs=ps.executeQuery();
              if(rs.next())
              {
                  user.setFirstname(rs.getString("fname"));
                  user.setLastname(rs.getString("lname"));
              }
        }
        catch(Exception e)
        {
            System.out.println("getAccount-->"+e);
        }
        return user;
    }
    
    
}
