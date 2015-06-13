/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import admin.bean.Account;
import admin.bean.History;
import admin.bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class UserDao {
    
    static Connection currenConn=ConnectionManager.getConnection();
    
    public ArrayList getUser(int pid,int nid,int did)
    {
        int mid=pid+nid;
        ArrayList al=new ArrayList();
        int size=0;
        
        try
        {
            PreparedStatement p=currenConn.prepareStatement("select * from account_details");
                ResultSet r=p.executeQuery();
                while(r.next())
                {
                    size++;
                }
            
            
            System.out.println(size);
            PreparedStatement ps=currenConn.prepareStatement("select * from account_details where rownum<? minus select * from account_details where rownum<?");
            ps.setInt(1, mid);
            ps.setInt(2, pid);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                
                    User hs=new User();
                    hs.setAid(rs.getInt("aid"));
                    hs.setFirstname(rs.getString("fname"));
                    hs.setLastname(rs.getString("lname"));
                    hs.setAddress(rs.getString("address"));
                    hs.setCity(rs.getString("city"));
                    hs.setCountry(rs.getString("country"));
                    hs.setDate(rs.getString("dte"));
                    hs.setMobile(rs.getString("mobile"));
                    hs.setPassword(rs.getString("password"));
                    hs.setSecure1(rs.getString("secure1"));
                    hs.setAnswer1(rs.getString("answer1"));
                    hs.setSecure2(rs.getString("secure2"));
                    hs.setAnswer2(rs.getString("answer2"));
                    hs.setEmail(rs.getString("email"));
                    hs.setUser_type(rs.getString("user_type"));
                    hs.setCount(size);

                al.add(hs);
            }
        }
        catch(Exception e)
        {
            System.out.println("getUser-->"+e);
        }
        return al;
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
    
    public User getAcc_Details(int aid)
    {
        User hs=new User();
        
        try
        {
            currenConn=ConnectionManager.getConnection();
              
              PreparedStatement ps=currenConn.prepareStatement("SELECT * from account_details where aid=? ");
              ps.setInt(1, aid);
              ResultSet rs=ps.executeQuery();
              if(rs.next())
              {
                    hs.setAid(rs.getInt("aid"));
                    hs.setFirstname(rs.getString("fname"));
                    hs.setLastname(rs.getString("lname"));
                    hs.setAddress(rs.getString("address"));
                    hs.setCity(rs.getString("city"));
                    hs.setCountry(rs.getString("country"));
                    hs.setDate(rs.getString("dte"));
                    hs.setMobile(rs.getString("mobile"));
                    hs.setPassword(rs.getString("password"));
                    hs.setSecure1(rs.getString("secure1"));
                    hs.setAnswer1(rs.getString("answer1"));
                    hs.setSecure2(rs.getString("secure2"));
                    hs.setAnswer2(rs.getString("answer2"));
                    hs.setEmail(rs.getString("email"));
                    hs.setUser_type(rs.getString("user_type"));
                    hs.setValid(true);
              }
        }
        catch(Exception e)
        {
            System.out.println("getAcc_Details-->"+e);
        }
        return hs;
    }
    
    public int editUser_Details(User b1)
    {
        int i=0;
        int aid=b1.getAid();
        String firstname=b1.getFirstname();
          String lastname=b1.getLastname();
          String address=b1.getAddress();
          String city=b1.getCity();
          String country=b1.getCountry();
          String date=b1.getDate();
          String mobile=b1.getMobile();
          String secure1=b1.getSecure1();
          String answer1=b1.getAnswer1();
          String secure2=b1.getSecure2();
          String answer2=b1.getAnswer2();
          String email=b1.getEmail();
        try
        {
            PreparedStatement ps=currenConn.prepareStatement("update account_details set fname=?, lname=?, address=?, city=?, country=?, dte=?, mobile=?, secure1=?, answer1=?, secure2=?, answer2=?, email=? where aid=?");
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, address);
            ps.setString(4, city);
            ps.setString(5, country);
            ps.setString(6, date);
            ps.setString(7, mobile);
            ps.setString(8, secure1);
            ps.setString(9, answer1);
            ps.setString(10, secure2);
            ps.setString(11, answer2);
            ps.setString(12, email);
            ps.setInt(13, aid);
            i=ps.executeUpdate();
           
        }
        catch(Exception e)
        {
            System.out.println("editHistory-->"+e);
        }
        return i;
    }
    
   
    public int deleteUser(int aid)
    {
        int status=0;
        try
        {
            PreparedStatement ps=currenConn.prepareStatement("delete from account_details where aid=?");
            ps.setInt(1, aid);
            status=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("deleteUser-->"+e);
        }
        return status;
    }
    
    public User getEmail(String search)
    {
        
        User hs=new User();
        
        try
        {
            currenConn=ConnectionManager.getConnection();
              
              PreparedStatement ps=currenConn.prepareStatement("SELECT * from account_details where email=? ");
              ps.setString(1, search);
              ResultSet rs=ps.executeQuery();
              if(rs.next())
              {
                    hs.setAid(rs.getInt("aid"));
                    hs.setFirstname(rs.getString("fname"));
                    hs.setLastname(rs.getString("lname"));
                    hs.setAddress(rs.getString("address"));
                    hs.setCity(rs.getString("city"));
                    hs.setCountry(rs.getString("country"));
                    hs.setDate(rs.getString("dte"));
                    hs.setMobile(rs.getString("mobile"));
                    hs.setPassword(rs.getString("password"));
                    hs.setSecure1(rs.getString("secure1"));
                    hs.setAnswer1(rs.getString("answer1"));
                    hs.setSecure2(rs.getString("secure2"));
                    hs.setAnswer2(rs.getString("answer2"));
                    hs.setEmail(rs.getString("email"));
                    hs.setUser_type(rs.getString("user_type"));
                    hs.setValid(true);
              }
        }
        catch(Exception e)
        {
            System.out.println("getEmail-->"+e);
        }
        return hs;
    }
    
    
    
    
}
