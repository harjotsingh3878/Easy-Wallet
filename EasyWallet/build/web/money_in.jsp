<%@page import="admin.bean.User"%>
<%@page import="admin.bean.Account"%>
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


<div id="page-heading"><h1>MONEY IN</h1></div>

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
		
		</div>
		<!-- end related-act-top -->
		
		<!--  start related-act-bottom -->
		<div id="related-act-bottom1">
		
			<!--  start related-act-inner -->
			<div id="related-act-inner1">
			
				<div class="left"><img src="images/forms/icon_minus.gif" width="21" height="21" alt="" /></div>
				<div class="right">
					<h5>Deposit Money</h5>
                                        You can deposit money into account
                                        using credit cards.
					<ul class="greyarrow">
						<li><a href="money_in.jsp">Click here to visit</a></li> 
						
					</ul>
                                        
					</ul>
				</div>
				
				<div class="clear"></div>
				<div class="lines-dotted-short"></div>
				<div class="left"><img src="images/forms/icon_minus.gif" width="21" height="21" alt="" /></div>
				<div class="right">
					<h5>Register Cards</h5>
                                        You can register cards in the account.					
					<ul class="greyarrow">
						<li><a href="card_register.jsp">Click here to visit</a></li> 
						
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
     <div style="float: left;margin-left: 100px">       
            
	<!--  start step-holder -->
		<div id="step-holder">
			<div class="step-no">1</div>
			<div class="step-dark-left">Details</div>
			<div class="step-dark-right">&nbsp;</div>
			<div class="step-no-off">2</div>
			<div class="step-light-left">Verification</div>
			<div class="step-light-right">&nbsp;</div>
			<div class="step-no-off">3</div>
			<div class="step-light-left">Confirmation</div>
			<div class="step-light-round">&nbsp;</div>
			<div class="clear"></div>
		</div>
		<!--  end step-holder -->
	        <script src="js/jquery-1.10.2.js"></script>
                <script type="text/javascript">
                    $(document).ready(function(){
                        $('.debit').hide();
                        $('#bank').hide();
                        $('#tran').hide();
                        $('input[type="radio"]').click(function(){
                             if ($('#dcard').is(':checked'))
                             {
                                $('#bank').show();
                                
                             }
                           if ($('#card').is(':checked'))
                             {
                                $('#bank').hide();
                                $('#tran').hide();
                                $('#expiry').show();
                                $('#hname').show();
                                $('#cvc').show();
                                $('#card_no').show();
                             }
                           if ($('#net').is(':checked'))
                             {
                                $('#expiry').hide();
                                $('#cvc').hide();
                                $('#hname').hide();
                                $('#card_no').hide();                              
                                $('#tran').show();
                                $('#bank').show();
                             }
                        });
                    });
                </script>
		<!-- start id-form -->
                <form action="money_in_edit.jsp" method="post">
		<table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                    <tr style="height:50px"></tr><tr></tr>
		<tr>
			<th valign="top"></th>
                        <td><input type="radio" name="credit" value="credit" class="fancy-radio" id="card" checked>Credit Card</input>
                            <input type="radio" name="credit" value="debit" class="fancy-radio" id="dcard">Debit Card</input>
                            <input type="radio" name="credit" value="net" id="net">Net Banking</input>
                        </td>
			<td></td>
		</tr>
                    <tr style="height: 10px"></tr>
                <tr>
			<th valign="top">Amount:</th>
			<td><input type="text" class="inp-form" name="amount"/></td>
			<td></td>
		</tr>
                </table>
                    <table border="0" cellpadding="0" cellspacing="0"  id="id-form" class="credit">
                        
                <tr id="bank">
                    <th valign="top">Select Your Bank</th>
			<td><select name="bank"  class="styledselect_form_1">
                          <option value="">Select an option..</option>
                          <option value="AXIS BANK">AXIS BANK</option>
                          <option value="ICICI BANK">ICICI BANK</option>
                          <option value="HDFC BANK">HDFC BANK</option>
                          <option value="STATE BANK OF INDIA">STATE BANK OF INDIA</option>
                          <option value="BANK OF INDIA">BANK OF INDIA</option>
                          <option value="PUNJAB NATIONAL BANK">PUNJAB NATIONAL BANK</option>
                          <option value="STATE BANK OF INDIA">STATE BANK OF INDIA</option>
                          <option value="UNION BANK OF INDIA">UNION BANK OF INDIA</option>
                        </select></td>
                        <td></td>
		</tr>
                
                <tr id="card_no">
			<th valign="top">Card Number:</th>
                        <td><input type="text" class="inp-form"  name="cards"/></td>
			<td></td>
		</tr>
                <tr id="hname">
			<th valign="top">Card Holder Name:</th>
                        <td><input type="text" class="inp-form"  name="hname"/></td>
			<td></td>
		</tr>
                <tr id="expiry">
			<th valign="top">Expiration Date:</th>
			<td class="noheight">
		
			<table border="0" cellpadding="0" cellspacing="0">
			<tr  valign="top">
				<td>
				
				
                                    <select id="d" class="styledselect-day" name="day">
					<option value="">dd</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="23">23</option>
					<option value="24">24</option>
					<option value="25">25</option>
					<option value="26">26</option>
					<option value="27">27</option>
					<option value="28">28</option>
					<option value="29">29</option>
					<option value="30">30</option>
					<option value="31">31</option>
				</select>
				</td>
				<td>
                                    <select id="m" class="styledselect-month" name="month">
						<option value="">mmm</option>
						<option value="1">Jan</option>
						<option value="2">Feb</option>
						<option value="3">Mar</option>
						<option value="4">Apr</option>
						<option value="5">May</option>
						<option value="6">Jun</option>
						<option value="7">Jul</option>
						<option value="8">Aug</option>
						<option value="9">Sep</option>
						<option value="10">Oct</option>
						<option value="11">Nov</option>
						<option value="12">Dec</option>
					</select>
				</td>
				<td>
                                    <select  id="y"  class="styledselect-year" name="year">
						<option value="">yyyy</option>
						<option value="2013">2013</option>
						<option value="2014">2014</option>
						<option value="2015">2015</option>
						<option value="2016">2016</option>
						<option value="2017">2017</option>
						<option value="2018">2018</option>
                                                <option value="2019">2019</option>
                                                <option value="2020">2020</option>
                                                <option value="2021">2021</option>
                                                <option value="2022">2022</option>
                                                <option value="2023">2023</option>
                                                <option value="2024">2024</option>
                                                <option value="2025">2025</option>
                                                <option value="2026">2026</option>
                                                <option value="2027">2027</option>
                                                <option value="2028">2028</option>
                                                <option value="2029">2029</option>
                                                <option value="2030">2030</option>
                                                <option value="2031">2031</option>				
                                    </select>
					
				</td>
				
			</tr>
			</table>
                        
		
		</td>
		<td></td>
		</tr>
                <tr id="cvc">
			<th valign="top">CVV Code:</th>
                        <td><input type="text" class="inp-form1" name="cvv"/>(3-digit number)</td>
			<td></td>
		</tr>
                <tr id="tran">
			<th valign="top">Trsanction ID:</th>
                        <td><input type="password" class="inp-form" name="tran"/></td>
			<td></td>
		</tr>
                <tr>
			<th valign="top">Security Number:</th>
                        <td><input type="password" class="inp-form" name="sid"/></td>
			<td></td>
		</tr>
		
	<tr>
		<th>&nbsp;</th>
		<td valign="top">
			<input type="submit" value="Continue" class="btn-green" />
			<input type="button" value="Reset" class="btn-grey"  />
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