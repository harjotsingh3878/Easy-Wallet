<%@page import="java.util.ArrayList"%>
<%@page import="admin.bean.History"%>
<%@page import="admin.bean.User"%>
<%@page import="admin.bean.Account"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />
<link href="css/tables.css" rel="stylesheet" type="text/css" />

</head>
<body> 
    <jsp:include page="header.jsp"></jsp:include>

</div>
<!-- End: page-top-outer -->
	
<div class="clear">&nbsp;</div>
<%
       Account account=(Account)session.getAttribute("account");
       User user=(User)session.getAttribute("user");
       ArrayList al=(ArrayList)request.getAttribute("history");
       if(account==null||user==null)
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
                
		<ul class="current"><li><a ><b>Account</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub show">
			<ul class="sub">
				<li class="sub_show"><a href="details_account.jsp">Account Summary</a></li>
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


<div id="page-heading"><h1>ACCOUNT SUMARY</h1></div>

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
	
            <script src="js/jquery-1.10.2.js"></script>
                <script type="text/javascript">
                    $(document).ready(function(){
                         $('#message-yellow').show();
                        $('.close-yellow').click(function(){
                            $('#message-yellow').hide();
                        });
                    });
                    </script>
            
            
            <%System.out.println("assdas"+al);
                if(al!=null){
                    System.out.println("ljoi"+al.size());
                    for(int q=0;q<al.size();q++){
                        History hs=(History)al.get(q);
                    
                System.out.println("asd"+hs.getRead());
                if(hs.getRead()==1){
                    System.out.println("asdmsaldkas");
                    %>
                                 <!--  start message-yellow -->
				<div id="message-yellow">
				<table border="0" width="100%" cellpadding="0" cellspacing="0">
				<tr>
					<td class="yellow-left">You have a new message. <a href="history.jsp">Go to History.</a></td>
					<td class="yellow-right"><a class="close-yellow"><img src="images/table/icon_close_yellow.gif"   alt="" /></a></td>
				</tr>
				</table>
				</div>
				<!--  end message-yellow -->
            <%
                } }
            }%>
                                
		<!--  start step-holder -->
		<div id="step-holder">
			<b>Here is quick summary of your account details.</b>
                        
		</div>
		<!--  end step-holder -->
	        <div style="height:0px"></div>
		<!-- start id-form -->
                <form action="" method="">
		<table border="0" cellpadding="0" cellspacing="0"  id="table">
                    
		
                <tbody>
        
        <tr class="light"><td width="223"><div class="">ACCOUNT ID</div></td><td width="265"><input name="amount" type="text" class="input1"  value="<%=account.getAccount_id()%>" id="fname" disabled /></td></tr>
        <tr class="dark"><td><div class="">SECURE ID</div></td><td><input name="user" type="text" class="input" value="XXXXX"  id="user" disabled/><a href="retrieve_secure.jsp">Retrieve</a></td></tr>
    <tr class="light"><td><div class="">LAST LOGIN</div></td><td><input name="expiry" type="text" class="input1"  value="<%=account.getLogin()%>"  id="pass" disabled/></td></tr>
    <tr class="dark"><td><div class="">CARD REGISTERED</div></td><td><input name="password" type="text" class="input" value="<%=account.getCards()%>" id="conform" disabled/></td></tr>
    
   
    <input name="categoty" type="hidden" value="" />
            </tbody>
              
		
		
		
	
	</table>
            
        </form>
	<!-- end id-form  -->

	</td>
	<td>

	<!--  start related-activities -->
	<div id="related-activities">
		<img src="images/Master-Card-icon.png" alt="" width="206" height="156" longdesc="images/image_not_loaded.jpg" />
        <img src="images/credit-card-19.png" alt="" width="206" height="156" longdesc="images/image_not_loaded.jpg" /></div>
	<!-- end related-activities -->

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