/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author gagan
 */
public class Dummy {
    
     static Connection  currenConn=ConnectionManager.getConnection();
     Random randomGenerator = new Random();
    
    public int insertDummy() 
    {
        String[] bank={"AXIS BANK", "HDFC BANK", "ICICI BANK","STATE BANK OF INDIA", "BANK OF INDIA", "PUNJAB NATIONAL BANK", "STATE BANK OF INDIA", "UNION BANK OF INDIA"};
        int amount=0,cvv=0,day,month,year,demo_id=0;
        int dcvv=0,dday,dmonth,dyear;
        String card=null,dcard=null,bank_id=null;
        String expiry=null,bank_name=null,dexpiry=null;
        String account_id=null,fname=null,lname=null,holder=null;
        int did=1,aid=0;
        int status=0;
        try
        {
            
            PreparedStatement p=currenConn.prepareStatement("select * from account where did=?");
                    p.setInt(1, did);
                    ResultSet r1=p.executeQuery();
                    if(r1.next())
                    {
                        aid=r1.getInt("aid");
                        System.out.println(aid);
                        
                    }
            
            PreparedStatement ps=currenConn.prepareStatement("select fname, lname from account_details where aid=?");
                    ps.setInt(1, aid);
                    ResultSet r=ps.executeQuery();
                    if(r.next())
                    {
                        fname=r.getString("fname");
                        lname=r.getString("lname");
                    }
            
            holder=fname+" "+lname;
            System.out.println(holder);
            
            Statement stmt=currenConn.createStatement();
            amount = randomGenerator.nextInt(50000-10000+1);
             
            
            int a=randomGenerator.nextInt(bank.length);
            bank_name=bank[a];
            
             int b = randomGenerator.nextInt(1000000000);
             card=String.valueOf(b);
            
            day=randomGenerator.nextInt(30-1+1)+1;
            month=randomGenerator.nextInt(12-1+1)+1;
            year=randomGenerator.nextInt(2050-2030+1)+2019;           
            expiry=day+"/"+month+"/"+year;
            
            cvv=randomGenerator.nextInt(300-200+1)+100;
            
             int c = randomGenerator.nextInt(1000000000);
             dcard=String.valueOf(c);
             
            dday=randomGenerator.nextInt(30-0+1)+1;
            dmonth=randomGenerator.nextInt(12-0+1)+1;
            dyear=randomGenerator.nextInt(2050-2030+1)+2019;
            
            dexpiry=dday+"/"+dmonth+"/"+dyear;
            
            dcvv=randomGenerator.nextInt(300-200+1)+100;
             int d = randomGenerator.nextInt(1000000000);
             bank_id=String.valueOf(d);
             
            System.out.println("qwe"+bank_name+bank_id+"es"+card+"cxz"+dcard);
            
        }
        catch(Exception e)
        {
            System.out.println("dummy-->"+e);
        }
        
        try
        {
            PreparedStatement ps2=currenConn.prepareStatement("SELECT DEMO_ID_SEQ.NEXTVAL FROM dual");
              ResultSet rs2=ps2.executeQuery();
              while(rs2.next()){
                  System.out.println("demo_id");
                  demo_id= rs2.getInt(1);
                  System.out.println("asdf"+demo_id);
                  System.out.println("qwe"+bank_name+bank_id+"es"+card+"cxz"+dcard);
              }
            
              System.out.println("qwe"+amount+dcvv+"es"+cvv+"cxz"+expiry+fname);
            PreparedStatement ps=currenConn.prepareStatement("insert into demo values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, demo_id);
            ps.setString(2, bank_name);
            ps.setString(3, bank_id);
            ps.setString(4, dcard);
            ps.setString(5, holder);
            ps.setString(6, dexpiry);
            ps.setInt(7, dcvv);
            ps.setString(8, card);
            ps.setString(9, holder);
            ps.setString(10, expiry);
            ps.setInt(11, cvv);
            ps.setInt(12, amount);
            ps.setInt(13, did);
            status=ps.executeUpdate();
            
        }
        catch(Exception e1)
        {
            System.out.println("insert dummy-->"+e1);
        }
       return status;
    }
    
}
