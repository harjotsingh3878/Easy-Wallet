/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import com.sun.rmi.rmid.ExecOptionPermission;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gagan
 */
public class SettingsDao {
    
    static Connection  currenConn=ConnectionManager.getConnection();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public int changeSecure(int aid,String upass){
      int i=0;
      try
      {
        ps=currenConn.prepareStatement("update account set secure_id=? where aid=?");
        ps.setString(1, upass);
        ps.setInt(2, aid);
        i=ps.executeUpdate();
      }
      catch(Exception e)
      {
          System.out.println("Secure"+e);
      }
        
      return i;
    }
    
    public int changePass(int aid,String uname, String upass){
      int i=0;
      try
      {
        ps=currenConn.prepareStatement("update account_details set password=? where aid=?");
        ps.setString(1, upass);
        ps.setInt(2, aid);
        i=ps.executeUpdate();
      }
      catch(Exception e)
      {
          System.out.println("Pass"+e);
      }
      return i;
    }
    
    public String retrieve(int aid,String upass,String upass1){
      int i=0;
      String secure=null;
      try
      {
        ps=currenConn.prepareStatement("select * from account_details where secure=? and secure1=? and aid=?");
        ps.setString(1, upass);
        ps.setString(2, upass1);
        ps.setInt(1, aid);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            secure=rs.getString("secure_id");
        }
      }
      catch(Exception e)
      {
          System.out.println("Secure"+e);
      }
      return secure;
    }
    
    
    
}
