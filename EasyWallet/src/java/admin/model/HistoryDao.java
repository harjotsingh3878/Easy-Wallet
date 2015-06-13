/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import admin.bean.History;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class HistoryDao {
    
    static Connection currenConn=ConnectionManager.getConnection();
    
    public ArrayList getHistory(int pid,int nid, int aid)
    {
        int mid=pid+nid;
        ArrayList al=new ArrayList();
        int size=0;
        
        try
        {
            PreparedStatement p=currenConn.prepareStatement("select * from history where aid=?");
            p.setInt(1, aid);
                ResultSet r=p.executeQuery();
                while(r.next())
                {
                    size++;
                }
            
            PreparedStatement ps=currenConn.prepareStatement("select * from history where rownum<? and aid=? minus select * from history where rownum<? and aid=?");
            ps.setInt(1, mid);
            ps.setInt(2, aid);
            ps.setInt(3, pid);
            ps.setInt(4, aid);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
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
                hs.setCount(size);
                
                al.add(hs);
            }
        }
        catch(Exception e)
        {
            System.out.println("getHistory-->"+e);
        }
        return al;
    }
    
    public History editHistory(int tid)
    {
        History hs=new History();
        try
        {
            PreparedStatement ps=currenConn.prepareStatement("select * from history where tid=?");
            ps.setInt(1, tid);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                
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
                int rd=rs.getInt("read");
                hs.setRead(rd);
                if(rd==1){
                    
                      ps=currenConn.prepareStatement("update history set read=? where tid=?");
                      ps.setInt(1, 2);
                      ps.setInt(2, tid);
                      ps.executeUpdate();
                }
                hs.setValid(true);
            }
        }
        catch(Exception e)
        {
            System.out.println("editHistory-->"+e);
        }
        return hs;
    }
    
    public History editSend(int tid)
    {
        History hs=new History();
        try
        {
            PreparedStatement ps=currenConn.prepareStatement("select * from history where tid=?");
            ps.setInt(1, tid);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                
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
                hs.setValid(true);
                
                
               PreparedStatement ps1=currenConn.prepareStatement("update history set read=? where tid=?");
               ps1.setInt(1, 0);
               ps1.setInt(2, tid);
               ps1.executeUpdate();
            }
        }
        catch(Exception e)
        {
            System.out.println("editHistory-->"+e);
        }
        return hs;
    }
    
    public int deleteHistory(int tid)
    {
        int status=0;
        try
        {
            PreparedStatement ps=currenConn.prepareStatement("delete from history where tid=?");
            ps.setInt(1, tid);
            status=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println("deleteHistory-->"+e);
        }
        return status;
    }
    
    public ArrayList getType(String search,int pid,int nid)
    {
        int aid=1;
        int mid=pid+nid;
        ArrayList al=new ArrayList();
        int size=0;
        try
        {
                PreparedStatement p=currenConn.prepareStatement("select * from history where transaction_type=?");
                p.setString(1, search);
                ResultSet r=p.executeQuery();
                while(r.next())
                {
                    size++;
                }
            System.out.println(search+size);
            PreparedStatement ps=currenConn.prepareStatement("select * from history where rownum<? and transaction_type=? minus select * from history where rownum<? and transaction_type=?");
            ps.setInt(1, mid);
            ps.setString(2, search);
            ps.setInt(3, pid);
            ps.setString(4, search);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
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
                hs.setCount(size);
                al.add(hs);
            }
        }
        catch(Exception e)
        {
            System.out.println("getType-->"+e);
        }
        return al;
    }
    
    public ArrayList getStatus(String search,int pid,int nid)
    {
        int aid=1;
        int mid=pid+nid;
        ArrayList al=new ArrayList();
        int size=0;
        
        try
        {
                PreparedStatement p=currenConn.prepareStatement("select * from history where status=?");
                p.setString(1, search);
                ResultSet r=p.executeQuery();
                while(r.next())
                {
                    size++;
                }
            
            PreparedStatement ps=currenConn.prepareStatement("select * from history where rownum<? and status=? minus select * from history where rownum<? and status=?");
            ps.setInt(1, mid);
            ps.setString(2, search);
            ps.setInt(3, pid);
            ps.setString(4, search);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
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
                hs.setCount(size);
                al.add(hs);
            }
        }
        catch(Exception e)
        {
            System.out.println("getStatus-->"+e);
        }
        return al;
    }
    
    public ArrayList getCredit(String search,int pid,int nid)
    {
        int aid=1;
        int mid=pid+nid;
        ArrayList al=new ArrayList();
        int size=0;
        try
        {
                PreparedStatement p=currenConn.prepareStatement("select * from history where card=?");
                p.setString(1, search);
                ResultSet r=p.executeQuery();
                while(r.next())
                {
                    size++;
                }
            
            PreparedStatement ps=currenConn.prepareStatement("select * from history where rownum<? and card=? minus select * from history where rownum<? and card=?");
            ps.setInt(1, mid);
            ps.setString(2, search);
            ps.setInt(3, pid);
            ps.setString(4, search);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
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
                hs.setCount(size);
                al.add(hs);
            }
        }
        catch(Exception e)
        {
            System.out.println("getCredit-->"+e);
        }
        return al;
    }
}
