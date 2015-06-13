package admin.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
    
      static Connection currenConn=ConnectionManager.getConnection();
    
    public static int send(String to){
        
        int i=0;
        String subject="";String msg="";
        
        try {
                         PreparedStatement ps=currenConn.prepareStatement("SELECT * from account_details where email=?");
                         ps.setString(1, to);
                        
                         ResultSet rs=ps.executeQuery();
                         if(rs.next())
                         {
                             msg=rs.getString("password");
                         }
        }
        catch(Exception e){
            System.out.println("mail-->"+e);
        }

        final String user="harjotsingh538@gmail.com";//change accordingly
        final String pass="xxxxx";

        //1st step) Get the session object	
        Properties props = new Properties();
        props.put("mail.smtp.host", "mail.google.com");//change accordingly
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props,
         new javax.mail.Authenticator() {
          protected PasswordAuthentication getPasswordAuthentication() {
           return new PasswordAuthentication(user,pass);
           }
        });
        //2nd step)compose message
        try {
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(user));
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
         message.setSubject(subject);
         message.setText(msg);

         //3rd step)send message
         Transport.send(message);
         
         i=1;
         

         } catch (MessagingException e) {
                throw new RuntimeException(e);
         }
        return i;
    }
}
