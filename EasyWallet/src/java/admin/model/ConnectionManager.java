/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gagan
 */
public class ConnectionManager {
    
    static Connection conn;
    static String url;

    public static Connection getConnection()
    {
        

        try{
        
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
            System.out.println(conn);
        }
        catch(Exception sql)
        {
            System.err.println(sql);
        }

        return conn;
    }
    
}
