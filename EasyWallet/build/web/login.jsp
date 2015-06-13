<%@page import="admin.bean.Account"%>
<%@page import="admin.bean.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />

</head>
<body> 
    <jsp:include page="header.jsp"></jsp:include>
<%
       Account account=(Account)session.getAttribute("account");
       User user=(User)session.getAttribute("user");
       
       if(account!=null||user!=null)
        {            
            RequestDispatcher rd=request.getRequestDispatcher("details_account.jsp");
            rd.forward(request, response);
        }
%>	
<div class="clear">&nbsp;</div>
 
<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat"> 
<!--  start nav-outer -->
<div class="nav-outer"> 

		


		<!--  start nav -->
		<div class="nav">
		<div class="table">
		<ul class="select"><li><a href="index.jsp"><b>Home</b><!--[if IE 7]><!--></a>
                 
                </li>
		</ul>
                <div class="nav-divider">&nbsp;</div>
                
		<ul class="select"><li><a ><b>Account</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub">
			<ul class="sub">
                                            <li><a href="details_account.jsp">Account Summary</a></li>
                                            <li><a href="users_edit.jsp">Personal Details</a></li>
                                        </ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		                    
		<ul class="select"><li><a ><b>Transactions</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub">
			<ul class="sub">
                                <li><a style="width: 150px"></a></li>
				<li><a href="money_in_first.jsp">Money In</a></li>
				<li><a href="money_out_first.jsp">Money Out</a></li>
				
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
		<ul class="select"><li><a href="history.jsp"><b>History</b><!--[if IE 7]><!--></a><!--<![endif]-->
		
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
		<ul class="select"><li><a href="contact.jsp"><b>Contacts</b><!--[if IE 7]><!--></a><!--<![endif]-->
		
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
		<ul class="select"><li><a href="settings.jsp"><b>Settings</b><!--[if IE 7]><!--></a><!--<![endif]-->
		
		</li>
		</ul>
		
		<div class="clear"></div>
		</div>
		<div class="clear"></div>
		</div>
		<!--  start nav -->

</div>
<div class="clear"></div>
<!--  start nav-outer -->
</div>
<!--  start nav-outer-repeat................................................... END -->
 
 <div class="clear"></div>
 
<!-- start content-outer -->
<div id="content-outer">
<!-- start content -->
<div id="content">


<div id="page-heading"><h1>LOGIN</h1></div>


<table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
<tr>
	<th rowspan="3" class="sized"><img src="images/shared/side_shadowleft.jpg" width="20" height="300" alt="" /></th>
	<th class="topleft"></th>
	<td id="tbl-border-top">&nbsp;</td>
	<th class="topright"></th>
	<th rowspan="3" class="sized"><img src="images/shared/side_shadowright.jpg" width="20" height="300" alt="" /></th>
</tr>
<tr>
    
                <script src="js/jquery-1.10.2.js"></script>
                <script type="text/javascript">
                    $(document).ready(function(){
                        $("#forgotbox").hide();   
                        $("#forgot").click(function(){
                            $("#forgotbox").show();
                            $("#loginbox").hide();
                        });
                        $("#back").click(function(){
                            $("#forgotbox").hide();
                            $("#loginbox").show();
                        });
                    });
                    
                 </script>
	<td id="tbl-border-left"></td>
	<td>
	<!--  start content-table-inner -->
	<div id="content-table-inner">
	
	<table border="0" width="100%" cellpadding="0" cellspacing="0">
	<tr valign="top">
	<td>
	
            <div style="float: right;margin-right: 300px;margin-top: 10px;font-size: 14px">
            <b>Not a user,<a href="register_1.jsp">Register here</a></b>
        </div>
	<!--  start loginbox ................................................................................. -->
	<div id="loginbox">

	 <%
            String error="";
            if(request.getParameter("error")!=null){
            error=request.getParameter("error");
            %>

                        <div class="error"><%=error%></div>
                        <div style="height:50px"></div>
                   
            <%
        }
        else{
            
            }%>
           
            
	<!--  start login-inner -->
	<div id="login-inner">
            <form action="LoginServlet" method="post">
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th>Email or Account ID</th>
			<td><input type="text"  class="login-inp" name="uname"/></td>
		</tr>
		<tr>
			<th>Password</th>
                        <td><input type="password" value="************"  onfocus="this.value=''" class="login-inp" name="upass"/></td>
		</tr>
		<tr>
			<th></th>
                        <td valign="top"><a   id="forgot">Forgot Password?</a></td>
		</tr>
		<tr>
			<th></th>
                        <td><input type="submit" class="submit-login"  /></td>
                        
		</tr>
		</table>
            </form>
            
	</div>
 	<!--  end login-inner -->
	<div class="clear"></div>
        
        
	
</div>
 <!--  end loginbox -->
 
	<!--  start forgotbox ................................................................................... -->
	<div id="forgotbox">
		<div id="forgotbox-text">Please send us your email and we'll reset your password.</div>
		<!--  start forgot-inner -->
		<div id="forgot-inner">
		<table border="0" cellpadding="0" cellspacing="0">
                    <form action="ForgotServlet">
		<tr>
			<th>Email address:</th>
                        <td><input type="text" value=""  name="eml" class="login-inp" /></td>
		</tr>
                <tr>
			<th></th>
                        <td valign="top"><a  id="back">Back to login</a> </td>
		</tr>
		<tr>
			<th></th>
			<td><input type="button" class="submit-login"  /></td>
		</tr>
                    </form>
		</table>
		</div>
		<!--  end forgot-inner -->
		<div class="clear"></div>
		
	</div>
	<!--  end forgotbox -->


      	

</td>
</tr>
<tr>
<td><img src="images/shared/blank.gif" width="695" height="1" alt="blank" /></td>
<td></td>
</tr>
</table>
 
<div class="clear"></div>
 

</div>
<!--  end content-table-inner  -->
</td>
<td id="tbl-border-right"></td>
</tr>
<tr>
	<th class="sized bottomleft"></th>
	<td id="tbl-border-bottom">&nbsp;</td>
	<th class="sized bottomright"></th>
</tr>
</table>









 





<div class="clear">&nbsp;</div>

</div>
<!--  end content -->
<div class="clear">&nbsp;</div>
</div>
<!--  end content-outer -->

 

<div class="clear">&nbsp;</div>
    
<jsp:include page="footer.jsp"></jsp:include>
 
</body>
</html>