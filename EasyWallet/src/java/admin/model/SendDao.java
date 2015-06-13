/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import admin.bean.History;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gagan
 */
public class SendDao {
   
    static Connection currenConn=ConnectionManager.getConnection();
    public int insertSend(History sd)
    {
        int i=0,rid=0,bal=0;
        
        String to=sd.getMsg_to();
        String from=sd.getMsg_from();
        String msg=sd.getMsg();
        String sid=sd.getSid();
        int did=sd.getDid();
        int tid=0;
        String dt=null;
        int amount=sd.getAmount();
        String balance=null;
        System.out.println(did);
        try
            {
                PreparedStatement p5=currenConn.prepareStatement("select * from ACCOUNT where secure_id=? ");
                p5.setString(1, sid);
                ResultSet r5=p5.executeQuery();
                if(r5.next())
                {
                    balance=r5.getString("balance");
                    bal=Integer.parseInt(balance);
                    if(bal<amount){
                        return i;
                    }
                }
                else{
                    return i;
                }
                
                
                
                PreparedStatement ps2=currenConn.prepareStatement("SELECT HISTORY_ID_SEQ.NEXTVAL FROM dual");
                ResultSet rs2=ps2.executeQuery();
                while(rs2.next()){                 
                  tid= rs2.getInt(1);   
                    System.out.println(tid);
                }
                Statement s=currenConn.createStatement();
                ResultSet r=s.executeQuery("select sysdate from dual");
                if(r.next())
                {
                   dt=r.getString(1);
                } 
            }
            catch(Exception ex)
            {
                System.out.println("sequence-->"+ex);
            }
        
        try
        {
            PreparedStatement ps=currenConn.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, tid);
                ps.setString(2, "Money Transfer");
                ps.setInt(3, amount);
                ps.setString(4, "Send");
                ps.setString(5, dt);
                ps.setString(6, null);
                ps.setString(7, null);
                ps.setString(8, null);
                ps.setString(9, null);
                ps.setInt(10, 0);
                ps.setInt(11, did);
                ps.setString(12, to);
                ps.setString(13, from);
                ps.setString(14, msg);
                ps.setInt(15, 0);
                i=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("insertSend-->"+e);
        }
        
        String b=null;
        int ba=0, aid=0;
        try
        {
            PreparedStatement p1=currenConn.prepareStatement("select * from account_details where email=?");
            p1.setString(1, to);
            ResultSet r1=p1.executeQuery();
            if(r1.next())
            {
                aid=r1.getInt("aid");
                
            }

            PreparedStatement p=currenConn.prepareStatement("select * from account where aid=?");
            p.setInt(1, aid);
            ResultSet r=p.executeQuery();
            if(r.next())
            {
                rid=r.getInt("did");
                b=r.getString("balance");
                ba=Integer.parseInt(b);
            }
            
            
                
           int amt=bal-amount;
           int amt1=ba+amount;
           
           String am=String.valueOf(amt);
           String am1=String.valueOf(amt1);
           
           PreparedStatement p6=currenConn.prepareStatement("update account set balance=? where did=?");
           p6.setString(1, am);
           p6.setInt(2, did);
           p6.executeUpdate();
           
           PreparedStatement p7=currenConn.prepareStatement("update account set balance=? where did=?");
           p7.setString(1, am1);
           p7.setInt(2, rid);
           p7.executeUpdate();
           
           PreparedStatement ps2=currenConn.prepareStatement("SELECT HISTORY_ID_SEQ.NEXTVAL FROM dual");
                ResultSet rs2=ps2.executeQuery();
                while(rs2.next()){                 
                  tid= rs2.getInt(1);   
                    System.out.println(tid);
                }
            
            PreparedStatement ps=currenConn.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, tid);
                ps.setString(2, "Money Transfer");
                ps.setInt(3, amount);
                ps.setString(4, "Recieved");
                ps.setString(5, dt);
                ps.setString(6, null);
                ps.setString(7, null);
                ps.setString(8, null);
                ps.setString(9, null);
                ps.setInt(10, 0);
                ps.setInt(11, rid);
                ps.setString(12, to);
                ps.setString(13, from);
                ps.setString(14, msg);
                ps.setInt(15, 1);
                i=ps.executeUpdate();
                
            
             PreparedStatement ps1=currenConn.prepareStatement("update account set balance=? where did=?");
                ps1.setInt(1, did);
                ps1.setInt(2, did);
        }
        catch(Exception e)
        {
            System.out.println("insertReciever-->"+e);
        }
        
        return i;
    }
    
}
