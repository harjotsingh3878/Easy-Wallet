<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />


</head>
<body> 
    <jsp:include page="header.jsp"></jsp:include>
	
<div class="clear">&nbsp;</div>
 
<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat"> 
<!--  start nav-outer -->
<div class="nav-outer"> 

		<!-- start nav-right -->
		<div id="nav-right">
		
			<div class="nav-divider">&nbsp;</div>
			<div class="showhide-account"><b>Admin</b></div>
			<div class="nav-divider">&nbsp;</div>
			<a href="" id="logout"><img src="images/shared/nav/nav_logout.gif" width="64" height="14" alt="" /></a>
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
				<li class="sub_show"><a href="details_account.jsp">Account Summary</a></li>
				<li><a href="details_personal.jsp">Personal Details</a></li>
				<li><a href="deposit_cards.jsp">Deposit Options</a></li>
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


<div id="page-heading"><h1>REGISTRATION</h1></div>


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
	
	
		<!--  start step-holder -->
		<div id="step-holder">
			<div class="step-no-off">1</div>
			<div class="step-light-left">Get Started</div>
			<div class="step-light-right">&nbsp;</div>
			<div class="step-no">2</div>
			<div class="step-dark-left">Details</div>
			<div class="step-dark-right">&nbsp;</div>
			<div class="step-no-off">3</div>
			<div class="step-light-left">Confirmation</div>
			<div class="step-light-round">&nbsp;</div>
			<div class="clear"></div>
		</div>
		<!--  end step-holder -->
	        <script src="js/jquery-1.10.2.js"></script>
                <script type="text/javascript">
                    $(document).ready(function(){
                        $('.error').hide();
                        $('#3').hide();
                        $('#4').hide();
                        
                    });
                    function validateform()
                    {
                        var a=document.forms["myform"]["fname"].value.trim();
                        var b=document.forms["myform"]["lname"].value.trim();
                        var c=document.forms["myform"]["add"].value.trim();
                        var d=document.forms["myform"]["city"].value.trim();
                        var d=document.forms["myform"]["country"].value.trim();
                        var f=document.forms["myform"]["day"].value.trim();
                        var g=document.forms["myform"]["month"].value.trim();
                        var h=document.forms["myform"]["year"].value.trim();
                        var i=document.forms["myform"]["password"].value.trim();
                        var j=document.forms["myform"]["conform"].value.trim();
                        var k=document.forms["myform"]["secure1"].value.trim();
                        var l=document.forms["myform"]["ans1"].value.trim();
                        var m=document.forms["myform"]["secure2"].value.trim();
                        var n=document.forms["myform"]["ans2"].value.trim();
                       
                        if(a==null||a==''||b==''||c==''||d==''||f==''||g==''||h==''||i==''||j==''||k==''||l==''||m==''||n=='')
                            {
                                 $('.error').show();
 
                                 return false;
                            }
                        else if(i!=j)
                            {
                                $('#3').show();
                                $('#4').show();
                                $('#conform').addClass('inp-form-error');
                                return false;
                            }
                       

                    }
                    function conform()
                    {
                        alert("hi");
                        var x=document.forms["myform"]["fname"].value;
                        var y=document.forms["myform"]["lname"].value;
                        alert(x+y);
                        if(x!=y)
                            {
                                $('#3').show();
                                $('#4').show();
                                $('#conform').addClass('inp-form-error');
                                
                                
                            }
                       else
                           {
                               $('#3').hide();
                               $('#4').hide();
                               $('#conform').removeClass('inp-form-error');
                           }
                    }
                </script>
                
                <%
                
                    String email=request.getParameter("email");
                %>
		<!-- start id-form -->
                <form id="myform" action="RegisterServlet" onsubmit="return validateform()" method="post">
		<table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                    <tr style="height: 30px"></tr>
                    <tr>
                        <div class="error">All fields are required.</div>
                    </tr>
		<tr>
                    <input type="hidden" value="<%=email%>" name="email"/>
			<th valign="top">First Name:</th>
                        <td><input type="text" class="inp-form" name="fname" id="fname"/></td>
                        <th valign="top">Last name:</th>
                        <td style="margin-right: 10px"><input type="text" class="inp-form" name="lname" id="lname" onkeyup="conform()"/></td>
			<td></td>
		</tr>
		<tr>
			<th valign="top">Street Address:</th>
			<td><input type="text" class="inp-form" name="address" id="add"/></td>
			<td>			
			</td>
		</tr>
		<tr>
		<th valign="top">City:</th>
			<td><input type="text" class="inp-form" name="city" id="city"/></td>
			<td></td>
		</tr>
		<tr>
		
		</tr> 
		<tr>
			<th valign="top">Country:</th>
                        <td><input type="text" class="inp-form" value="India"  name="country" id="country" readonly="true"/></td>
			<td></td>
		</tr>
                <tr>
			<th valign="top">Mobile:</th>
                        <td><input type="text" class="inp-form" name="mobile" id="mobile"/></td>
			<td></td>
		</tr>
		<tr>
		<th valign="top">Date of Birth:</th>
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
						<option value="2005">2005</option>
						<option value="2006">2006</option>
						<option value="2007">2007</option>
						<option value="2008">2008</option>
						<option value="2009">2009</option>
						<option value="2010">2010</option>
					</select>
					
				</td>
				
			</tr>
			</table>
		
		</td>
		<td></td>
	</tr>
        <tr>
			<th valign="top"> Create Password:</th>
			<td><input type="password" class="inp-form" name="password" id="password"/></td>
                        <th valign="top">Conform Password:</th>
                        <td><input type="password" class="inp-form" name="conform" id="conform" onkeyup="conform()"/></td>
                        <td>
                            <div class="error-left" id="3"></div>
                            <div class="error-inner" id="4">Does not match with Password.</div>
			</td>
			<td></td>
	</tr>
        <tr>            
	<th valign="top">Security Question:</th>
		<td>	
		<select  class="styledselect_form_1" name="secure1" id="secure1">
                        <option value="">Select a question</option>
			<option value="What is your favourite game">What is your favourite game</option>
			<option value="What is the name of your high school">What is the name of your high school</option>
			<option value="What is the name of your pet">What is the name of your pet</option>
			<option value="What is your favourite color">What is your favourite color</option>			
		</select>
		</td>
                <th valign="top"> Answer:</th>
		<td><input type="text" class="inp-form" name="answer1" id="ans1"/></td>
		<td></td>
        </tr>
        <tr>            
	<th valign="top">Security Question:</th>
		<td>	
		<select  class="styledselect_form_1" name="secure2" id="secure2">
                        <option value="">Select a question</option>
			<option value="What is your favourite game">What is your favourite game</option>
			<option value="What is the name of your high school">What is the name of your high school</option>
			<option value="What is the name of your pet">What is the name of your pet</option>
			<option value="What is your favourite color">What is your favourite color</option>
		</select>
		</td>
                <th valign="top"> Answer:</th>
	        <td><input type="text" class="inp-form" name="answer2" id="ans2"/></td>
		<td></td>
        </tr>
                    <tr style="height: 30px"></tr>
	<tr>
		<th>&nbsp;</th>
		<td valign="top">
			<input type="submit" value="Submit" class="btn-green" />
                        <input type="reset" value="Back" class="btn-grey" onclick="history.go(-1)" />
		</td>
		<td></td>
	</tr>
	</table>
        </form>
	<!-- end id-form  -->

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
    
<!-- start footer -->         
<div id="footer">
	<!--  start footer-left -->
	<div id="footer-left">
	Admin Skin &copy; Copyright Internet Dreams Ltd. <a href="">www.netdreams.co.uk</a>. All rights reserved.</div>
	<!--  end footer-left -->
	<div class="clear">&nbsp;</div>
</div>
<!-- end footer -->
 
</body>
</html>