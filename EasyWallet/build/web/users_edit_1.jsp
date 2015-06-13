<%@page import="admin.bean.Account"%>
<%@page import="admin.bean.User"%>
<%@page import="admin.bean.History"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />
<link rel='stylesheet' type='text/css' href='css/styles.css' />
<script src='js/jquery-1.10.2.js'></script>
<script type='text/javascript' src='js/menu_jquery.js'></script>

</head>
<body> 
    <jsp:include page="header.jsp"></jsp:include>
	
<div class="clear">&nbsp;</div>

<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat"> 
<!--  start nav-outer -->
<div class="nav-outer"> 
                <%
                    User hs=(User)session.getAttribute("user");
                    Account ac=(Account)session.getAttribute("account");
                   
       
       if(ac==null||hs==null)
        {            
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
                %>
		<!-- start nav-right -->
		<div id="nav-right">
		
			<div class="nav-divider">&nbsp;</div>
                        <div class="showhide-account"><b><%=hs.getFirstname()%><%=" "%><%=hs.getLastname()%></b></div>
			<div class="nav-divider">&nbsp;</div>
			<a href="logout.jsp" id="logout"><img src="images/shared/nav/nav_logout.gif" width="64" height="14" alt="" /></a>
			<div class="clear">&nbsp;</div>
		
			
		
		</div>
		<!-- end nav-right -->


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
		                    
		<ul class="current"><li><a ><b>Transactions</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub show">
			<ul class="sub">
                            <li><a style="width: 150px"></a></li>
				<li class="sub_show"><a href="money_in_first.jsp">Money In</a></li>
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
		<%
                   
                   if(hs.getUser_type()!=null)
                   {
                       if(hs.getUser_type().equals("admin"))
                       {
                           %>
                <div class="nav-divider">&nbsp;</div>
		
		<ul class="select"><li><a href="users.jsp"><b>Manage Users</b><!--[if IE 7]><!--></a><!--<![endif]-->
		
		</li>
		</ul>
                <%
                       }
                   }
                %>
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


<div id="page-heading"><h1>EDIT USERS</h1></div>

               <!--  start step-holder -->
		<div style="float: left;margin: 0px 0px 5px 200px;">
			<input id="name" name="name" class="text1" value="Account ID :<%=ac.getAccount_id()%> " disabled/>
                        <%
                           if(ac.getBalance().equals("0"))
                           {  System.out.println("zero");
                        %>
                         <input id="name" name="name" class="text2" value="Available Balance Rs.<%=ac.getBalance()%>" disabled/>
                         <%
                           }else{  System.out.println("else");
                         %>
                         <input id="name" name="name" class="text3" value="Available Balance Rs.<%=ac.getBalance()%>" disabled/>
                         <%}%>
		</div>
		<!--  end step-holder -->


<table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
<tr>
	<th rowspan="3" class="sized"><img src="images/shared/side_shadowleft.jpg" width="20" height="300" alt="" /></th>
	<th class="topleft"></th>
	<td id="tbl-border-top">&nbsp;</td>
	<th class="topright"></th>
	<th rowspan="3" class="sized"><img src="images/shared/side_shadowright.jpg" width="20" height="300" alt="" /></th>
</tr>
<tr>
	<td id="tbl-border-left"></td>
	<td>
	<!--  start content-table-inner -->
	<div id="content-table-inner">
	
	<table border="0" width="100%" cellpadding="0" cellspacing="0">
	<tr valign="top">
	<td>
	
           
                
               
                
                <script>
                    function disableReadOnly()
                    {
                        
                        var el = document.getElementsByClassName("inp-form");
                        
                        
                        for (var i = 0; i < el.length; i++) {
                            
	                    el[i].readOnly =false;
                        }
                        
                        var a= document.getElementById("bttn");
                        
                        a.disabled =false;
                    }
                </script>
		<!-- start id-form -->
                <form action="UpdateHistory" method="post">
		<table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                    <tr style="height:50px"></tr><tr></tr>
		<tr>
			<th valign="top">First Name:</th>
                        <td><input type="text" class="inp-form" id="element" name="fname" value="<%=hs.getFirstname()%>" readonly="true"/></td>
			<th valign="top">Last Name:</th>
                        <td><input type="text" class="inp-form" id="element" name="lname" value="<%=hs.getLastname()%>" readonly="true"/></td>
		</tr>
		<tr>
			<th valign="top">Account Id:</th>
                        <td><input type="text" class="inp-form" id="element" name="acc" value="<%=ac.getAccount_id()%>" readonly="true"/></td>
			
		</tr>         
                <tr>
			<th valign="top">Balance:</th>
                        <td><input type="text" class="inp-form" id="element" name="balance" value="<%=ac.getBalance()%>" readonly="true"/></td>
			
		</tr>
                <tr>
			<th valign="top">Email:</th>
                        <td><input type="text" class="inp-form" id="element" name="email" value="<%=hs.getEmail()%>" readonly="true"/></td>
			
		</tr>
                <tr>
			<th valign="top">Address:</th>
                        <td><input type="text" class="inp-form" id="element" name="address" value="<%=hs.getAddress()%>" readonly="true"/></td>
			
		</tr>
                <tr>
			<th valign="top">City:</th>
                        <td><input type="text" class="inp-form" id="element" name="city" value="<%=hs.getCity()%>" readonly="true"/></td>
			
		</tr>
                <tr>
			<th valign="top">Country:</th>
                        <td><input type="text" class="inp-form" id="element" name="country" value="<%=hs.getCountry()%>" readonly="true"/></td>
			
		</tr>
                <tr>
			<th valign="top">Date of Birth:</th>
                        <td><input type="text" class="inp-form" id="element" name="birth" value="<%=hs.getDate()%>" readonly="true"/></td>
			
		</tr>
                <tr>
			<th valign="top">Mobile:</th>
                        <td><input type="text" class="inp-form" id="element" name="mobile" value="<%=hs.getMobile()%>" readonly="true"/></td>
			
		</tr>
                <tr>
			<th valign="top">Security Question :</th>
                        <td><input type="text" class="inp-form" id="element" name="secure1" value="<%=hs.getSecure1()%>" readonly="true"/></td>
			<th valign="top">Answer:</th>
                        <td><input type="text" class="inp-form" id="element" name="answer1" value="<%=hs.getAnswer1()%>" readonly="true"/></td>
			
		</tr>
                
                <tr>
			<th valign="top">Security Question:</th>
                        <td><input type="text" class="inp-form" id="element" name="secure2" value="<%=hs.getSecure2()%>" readonly="true"/></td>
			<th valign="top">Answer:</th>
                        <td><input type="text" class="inp-form" id="element" name="answer2" value="<%=hs.getAnswer2()%>" readonly="true"/></td>
			
		</tr>
                        <input type="hidden" name="aid" value="<%=hs.getAid()%>"/>
                
                
		
	<tr>
		<th>&nbsp;</th>
		<td valign="top">
                    <input type="submit" value="Update" class="btn-green" id="bttn" />
                        <input type="button" value="Reset" class="btn-grey" onClick="disableReadOnly()" >
		</td>
		<td></td>
	</tr>
	</table>
        </form>
	<!-- end id-form  -->
     </div>	
	
		

	</td>
	<td>

	

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