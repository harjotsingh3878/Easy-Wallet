<%@page import="admin.bean.User"%>
<%@page import="admin.bean.Account"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Internet Dreams</title>
<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />
<link rel='stylesheet' type='text/css' href='css/styles.css' />
<link rel='stylesheet' type='text/css' href='css/tables.css' />

</head>
<body> 
    <jsp:include page="header.jsp"></jsp:include>
	
<div class="clear">&nbsp;</div>
<%
      Account account=(Account)session.getAttribute("account");
       User user=(User)session.getAttribute("user");
       
       if(account==null)
        {            
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
%> 
<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat"> 
<!--  start nav-outer -->
<div class="nav-outer"> 

		<!-- start nav-right -->
		<div id="nav-right">
		
			<div class="nav-divider">&nbsp;</div>
                        <div class="showhide-account"><b><%=user.getFirstname()%><%=" "%><%=user.getLastname()%></b></div>
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
                    System.out.println(user.getUser_type());
                   if(user.getUser_type()!=null)
                   {
                       if(user.getUser_type().equals("admin"))
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


<div id="page-heading"><h1>SEND MONEY</h1></div>
               <!--  start step-holder -->
		<div style="float: left;margin: 0px 0px 5px 200px;">
			<input id="name" name="name" class="text1" value="Account ID :<%=account.getAccount_id()%> " disabled/>
                        <%
                           if(account.getBalance().equals("0"))
                           {  System.out.println("zero");
                        %>
                         <input id="name" name="name" class="text2" value="Available Balance Rs.<%=account.getBalance()%>" disabled/>
                         <%
                           }else{  System.out.println("else");
                         %>
                         <input id="name" name="name" class="text3" value="Available Balance Rs.<%=account.getBalance()%>" disabled/>
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

            <!--  start related-activities -->
	<div id="related-activities1">
		
		<!--  start related-act-top -->
		<div id="related-act-top1">
		<img src="images/forms/header_related_act.gif" width="271" height="43" alt="" />
		</div>
		<!-- end related-act-top -->
		
		<!--  start related-act-bottom -->
		<div id="related-act-bottom1">
		
			<!--  start related-act-inner -->
			<div id="related-act-inner1">
			
				<div class="left"><img src="images/forms/icon_minus.gif" width="21" height="21" alt="" /></div>
				<div class="right">
					<h5>Send Money</h5>
                                        You can send money to anyone having 
                                        account at this website.
					<ul class="greyarrow">
						<li><a href="">Click here to visit</a></li> 
						
					</ul>
				</div>
				
				<div class="clear"></div>
				<div class="lines-dotted-short"></div>
				<div class="left"><img src="images/forms/icon_minus.gif" width="21" height="21" alt="" /></div>
				<div class="right">
					<h5>Withdraw Money</h5>
                                        You can withdraw money to any bank.					
					<ul class="greyarrow">
						<li><a href="">Click here to visit</a></li> 
						
					</ul>
                                        You can withdraw money to any credit card.
					
					<ul class="greyarrow">
						<li><a href="">Click here to visit</a></li> 
						
					</ul>
				</div>
				
				<div class="clear"></div>
				
				
				
				
			</div>
			<!-- end related-act-inner -->
			<div class="clear"></div>
		
		</div>
		<!-- end related-act-bottom -->
	
	</div>
	<!-- end related-activities -->
        <div style="float: left;margin-left: 150px">
            
            <!--  start step-holder -->
		<div id="step-holder">
			<div class="step-no-off">1</div>
			<div class="step-light-left">Details</div>
			<div class="step-light-right">&nbsp;</div>
			<div class="step-no">2</div>
                        <div class="step-dark-left">Verification</div>
			<div class="step-dark-right">&nbsp;</div>
			<div class="step-no-off">3</div>
			<div class="step-light-left">Confirmation</div>
			<div class="step-light-round">&nbsp;</div>
			<div class="clear"></div>
		</div>
		<!--  end step-holder -->
            
                 <div style="height:50px"></div>
            <!-- start id-form -->
                <h2>The transaction was processed successfully.</h2></br></br>
                
                
                <div style="height: 30px"></div>
               
                <form action="" method="">
                  <table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                    
                    <tbody>
                      
                      <tr>
                        <td><select name="select"  class="styledselect_form_1" onchange="location=this.options[this.selectedIndex].value;">
                          <option value="">Select an option..</option>
                          <option value="money_in_first.jsp">Money In</option>
                          <option value="details_account.jsp">Account Summary</option>
                          <option value="history.jsp">History</option>
                        </select></td>
                        <td></td>
                      </tr>
                  </table>
                  <input type="submit" value="" class="form-submit" />
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