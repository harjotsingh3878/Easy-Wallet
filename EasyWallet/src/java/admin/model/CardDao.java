/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package admin.model;

import admin.bean.Cards;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author harjot
 */
public class CardDao {
    
    static Connection  currenConn=ConnectionManager.getConnection();
    
   public int registerCard(Cards card)
   {
       int i=0;
       String type=card.getType();
       String num=card.getNumber();
       String holder=card.getHolder();
       String expiry=card.getExpiry();
       int cvv=card.getCvv();
       String sid=card.getSid();
       int did=card.getDid();
       int cid=0;
       String balance=null;
       
       try
            {
                PreparedStatement p5=currenConn.prepareStatement("select * from ACCOUNT where secure_id=? ");
                p5.setString(1, sid);
                ResultSet r5=p5.executeQuery();
                if(!r5.next())
                {
                    return i;
                }
                PreparedStatement ps2=currenConn.prepareStatement("SELECT CARD_SEQ.NEXTVAL FROM dual");
                ResultSet rs2=ps2.executeQuery();
                while(rs2.next()){                 
                  cid= rs2.getInt(1);                 
                }
                PreparedStatement ps3=currenConn.prepareStatement("SELECT balance FROM demo where did=?");
                ps3.setInt(1, did);
                ResultSet rs3=ps3.executeQuery();
                while(rs3.next()){                 
                  balance= rs3.getString(1);                 
                }
                 
            }
            catch(SQLException ex)
            {
                System.out.println("card_sequence-->"+ex);
            }
       
       try
       {
           PreparedStatement ps=currenConn.prepareStatement("insert into cards values(?,?,?,?,?,?,?,?)");
                ps.setInt(1, cid);
                ps.setString(2, type);
                ps.setString(3, num);
                ps.setString(4, holder);
                ps.setString(5, expiry);
                ps.setInt(6, cvv);
                ps.setInt(7, did);
                ps.setString(8, balance);
                i=ps.executeUpdate();
            
                String cards=null;
                int c=0;
           PreparedStatement ps2=currenConn.prepareStatement("select * from account where did=?");
                ps2.setInt(1, did);
                ResultSet rs2=ps2.executeQuery();
               if(rs2.next()){
                   cards=rs2.getString("cards");
               }
               c=Integer.parseInt(cards);
               c=c+1;
               String s=String.valueOf(c);

           PreparedStatement ps1=currenConn.prepareStatement("update account set cards=? where did=?");
                ps1.setString(1, s);
                ps1.setInt(2, did);
                ps1.executeUpdate();
       }
       catch(SQLException e)
       {
           System.out.println("card_insert-->"+e);
       }
       return i;
   }
   
   public ArrayList getCards(int did)
   {
       ArrayList al=new ArrayList();
       
       
       try
       {
          PreparedStatement ps=currenConn.prepareStatement("select * from cards where did=?");
          ps.setInt(1, did);
          ResultSet rs=ps.executeQuery();
          while(rs.next())
          {
              Cards card=new Cards();
              card.getCid();
              card.setType(rs.getString("card_type"));
              card.setNumber(rs.getString("card_no"));
              card.setHolder(rs.getString("holder"));
              card.setExpiry(rs.getString("expiry"));
              card.setCvv(rs.getInt("cvv"));
              card.setDid(did);
              al.add(card);
          }
       }
       catch(Exception e)
       {
           System.out.println("getCards-->"+e);
       }
       return al;
   }
    
   public int removeCards(int cid)
   {
       int i=0;
       
       try
       {
           PreparedStatement ps=currenConn.prepareStatement("delete from cards where cid=?");
           ps.setInt(1, cid);
           ps.executeUpdate();
       }
       catch(Exception e)
       {
           System.out.println("removeCsrds-->"+e);
       }
       return i;
   }
}
