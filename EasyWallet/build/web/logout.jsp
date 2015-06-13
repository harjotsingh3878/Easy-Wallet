<%-- 
    Document   : logout
    Created on : Sep 18, 2013, 6:33:35 PM
    Author     : gagan
--%>

<%@page import="admin.bean.User"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="admin.bean.Account"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="admin.model.ConnectionManager"%>
<%@page import="java.sql.Connection"%>
<%
     Connection currenConn=ConnectionManager.getConnection();
     User user=(User)session.getAttribute("user");
     Account acc=(Account)session.getAttribute("account");
     String login=null;
    try
    {
        PreparedStatement ps1=currenConn.prepareStatement("select login from account where aid=?");
        ps1.setInt(1, user.getAid());
        ResultSet r=ps1.executeQuery();
                      while(r.next())
                      {
                          login=r.getString(1);
                      } 
        
         PreparedStatement ps2=currenConn.prepareStatement("update account set last_login=? where aid=?");
                      ps2.setString(1, login);
                      ps2.setInt(2, user.getAid());
                      ps2.executeUpdate();
    }
    catch(Exception e)
    {
        System.out.println("login-->"+e);
    }
    
   session.removeAttribute("user");
   session.removeAttribute("account");
   session.invalidate();
 
  // response.sendRedirect("home.jsp");
%>
<script>

        window.location.replace("index.jsp",'window', 'toolbar=1,location=1,directories,status=1,member=1,scrollbar=1,resizable=1');
        self.close();

</script>
