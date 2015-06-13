/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import admin.bean.MoneyIn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author gagan
 */

public class MoneyInDao {
    
    static Connection  currenConn=ConnectionManager.getConnection();
    
    public int getMoney(MoneyIn min)
    {
        int status=0;
        int tid=0;
        String credit=min.getCredit();
        int amount=min.getAmount();
        String bank=min.getBank();
        String card=min.getCard_no();
        String holder=min.getHolder();
        String expiry=min.getExpiry();
        int cvv=min.getCvv();
        String tran=min.getTrans_id();
        String sid=min.getSecure_id();
        int did=min.getDid();
        String dt=null;
        int balance=0,total=0;
        did=1;
            try
            {
                PreparedStatement p5=currenConn.prepareStatement("select * from ACCOUNT where secure_id=? ");
                p5.setString(1, sid);
                ResultSet r5=p5.executeQuery();
                if(!r5.next())
                {
                    return status;
                }
                PreparedStatement ps2=currenConn.prepareStatement("SELECT HISTORY_ID_SEQ.NEXTVAL FROM dual");
                ResultSet rs2=ps2.executeQuery();
                while(rs2.next()){                 
                  tid= rs2.getInt(1);                 
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
        
        if(credit.equals("credit"))
        {
            System.out.println(tid+card+holder+expiry+cvv+amount);              
            try
            {
                PreparedStatement p=currenConn.prepareStatement("select * from demo where credit_no=? and credit_name=? and credit_dte=? and credit_cvv=? and balance>? ");
                p.setString(1, card);
                p.setString(2, holder);
                p.setString(3, expiry);
                p.setInt(4, cvv);
                p.setInt(5, amount);
                ResultSet r=p.executeQuery();
                if(r.next())
                {
                    System.out.println("entered");
                PreparedStatement ps=currenConn.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, tid);
                ps.setString(2, "Credit Card");
                ps.setInt(3, amount);
                ps.setString(4, "Deposit");
                ps.setString(5, dt);
                ps.setString(6, card);
                ps.setString(7, holder);
                ps.setString(8, bank);
                ps.setString(9, expiry);
                ps.setInt(10, cvv);
                ps.setInt(11, did);
                ps.setString(12, null);
                ps.setString(13, null);
                ps.setString(14, null);
                ps.setInt(15, 0);
                ps.executeUpdate();
                }
                else
                {
                    return status;
                }
            }
            catch(Exception e)
            {
                System.out.println("credit-->"+e);
                return status;
            }
        }
        else if(credit.equals("debit"))
        {
            try
            {
                PreparedStatement p=currenConn.prepareStatement("select * from demo where bank=? and debit_no=? and debit_name=? and debit_dte=? and debit_cvv=? and balance>? ");
                p.setString(1, bank);
                p.setString(2, card);
                p.setString(3, holder);
                p.setString(4, expiry);
                p.setInt(5, cvv);
                p.setInt(6, amount);
                ResultSet r=p.executeQuery();
                if(r.next())
                {
                PreparedStatement ps=currenConn.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, tid);
                ps.setString(2, "Debit Card");
                ps.setInt(3, amount);
                ps.setString(4, "Deposit");
                ps.setString(5, dt);
                ps.setString(6, card);
                ps.setString(7, holder);
                ps.setString(8, bank);
                ps.setString(9, expiry);
                ps.setInt(10, cvv);
                ps.setInt(11, did);
                ps.setString(12, null);
                ps.setString(13, null);
                ps.setString(14, null);
                ps.setInt(15, 0);
                ps.executeUpdate();
                }
                else
                {
                    return status;
                }
            }
            catch(Exception e)
            {
                System.out.println("debit-->"+e);
                return status;
            }
        }
        
        else if(credit.equals("net"))
        {
            try
            {
                PreparedStatement p=currenConn.prepareStatement("select * from demo where bank=? and bank_id=? and balance>? ");
                p.setString(1, bank);
                p.setString(2, tran);
                p.setInt(3, amount);
                ResultSet r=p.executeQuery();
                if(r.next())
                {
                PreparedStatement ps=currenConn.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, tid);
                ps.setString(2, "Net Banking");
                ps.setInt(3, amount);
                ps.setString(4, "Deposit");
                ps.setString(5, dt);
                ps.setString(6, card);
                ps.setString(7, holder);
                ps.setString(8, bank);
                ps.setString(9, expiry);
                ps.setInt(10, cvv);
                ps.setInt(11, did);
                ps.setString(12, null);
                ps.setString(13, null);
                ps.setString(14, null);
                ps.setInt(15, 0);
                ps.executeUpdate();
                }
                else
                {
                    return status;
                }
            }
            
            catch(Exception e)
            {
                System.out.println("net banking-->"+e);
                return status;
            }
        }
        else
        {
            try
            {
              
                PreparedStatement ps=currenConn.prepareStatement("insert into history values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1, tid);
                ps.setString(2, credit);
                ps.setInt(3, amount);
                ps.setString(4, "Deposit");
                ps.setString(5, dt);
                ps.setString(6, card);
                ps.setString(7, holder);
                ps.setString(8, bank);
                ps.setString(9, expiry);
                ps.setInt(10, cvv);
                ps.setInt(11, did);
                ps.setString(12, null);
                ps.setString(13, null);
                ps.setString(14, null);
                ps.setInt(15, 0);
                ps.executeUpdate();
                
            }
            
            catch(Exception e)
            {
                System.out.println("deposit viaCards-->"+e);
                return status;
            }
        }
        try
        {
            PreparedStatement ps1=currenConn.prepareStatement("select * from account where did=?");
            ps1.setInt(1, did);
            ResultSet rs=ps1.executeQuery();
            if(rs.next())
            {
                balance=rs.getInt("balance");
            }
            total=balance+amount;
            System.out.println(total+"asd"+balance);
            PreparedStatement ps2=currenConn.prepareStatement("update account set balance=? where did=?");
            ps2.setInt(1, total);
            ps2.setInt(2, did);
            status=ps2.executeUpdate();
            currenConn.commit();
        }
        catch(Exception ex)
        {
            System.out.println("update amount-->"+ex);
        }
        return status;
    }
    
    public int cardMoney(String amt, String select, String secure, int did)
    {
        int i=0;
        MoneyIn mi=new MoneyIn();
        
        try
        {
            PreparedStatement ps=currenConn.prepareStatement("select * from cards where card_type=?");
            ps.setString(1, select);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                mi.setCard_no(rs.getString("card_no"));
                mi.setAmount(Integer.parseInt(amt));
                mi.setCvv(rs.getInt("cvv"));
                mi.setDid(did);
                mi.setSecure_id(secure);
                mi.setHolder(rs.getString("holder"));
                mi.setExpiry(rs.getString("expiry"));
                mi.setCredit(select);
            }
            MoneyInDao md=new MoneyInDao();
            i=md.getMoney(mi);
        }
        catch(Exception e)
        {
            System.out.println("cardMoney-->"+e);
        }
        
        
        return i;
    }
    
}
