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
			<div class="step-no">1</div>
			<div class="step-dark-left">Get Started</div>
			<div class="step-dark-right">&nbsp;</div>
			<div class="step-no-off">2</div>
			<div class="step-light-left">Details</div>
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
                        $('.error').hide();
                        $('#1').hide();
                        $('#2').hide();
                        $('#3').hide();
                        $('#4').hide();
                        $(".btn-grey").click(function(){
                            window.location.href="home.jsp";
                            return false;
                        });
                    });
                    function validateform()
                    {
                        var x=document.forms["myform"]["email"].value.trim();
                        var y=document.forms["myform"]["cemail"].value.trim();
                        if(x==null||x==''||y==null||y=='')
                            {+
                                 $('.error').show();
                                 alert("hljsa"+x);
                                 return false;
                            }
                        if(x!=y)
                            {
                                $('#3').show();
                                $('#4').show();
                                $('#cemail').addClass('inp-form-error');
                                return false;
                            }
                       var atpos=x.indexOf("@");
                       var dotpos=x.lastIndexOf(".");
                       if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
                            {
                                 $('#1').show();
                                 $('#2').show();
                                 $('#email').addClass('inp-form-error');
                                 return false;
                            }
                       

                    }
                    function conform()
                    {
                        var x=document.forms["myform"]["email"].value;
                        var y=document.forms["myform"]["cemail"].value;
                        if(x!=y)
                            {
                                $('#3').show();
                                $('#4').show();
                                $('#cemail').addClass('inp-form-error');
                                
                                
                            }
                       else
                           {
                               $('#3').hide();
                               $('#4').hide();
                               $('#cemail').removeClass('inp-form-error');
                           }
                    }
                </script>
                
                    <div style="margin-top: 50px">
                    Paying with Easy Wallet is fast and easy.
                    The step is signing up for your account,</br> which only takes few minutes and second step
                    is depositing money into it. </br>Then you are all set to make transactions with service.
                        </div>
		<!-- start id-form -->
                <form action="register_2.jsp" method="get" id="myform" onsubmit="return validateform()">
		<table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                    
                    <tr style="height:50px"></tr>
                    <tr>
                        <div class="error">All fields are required.</div>
                    </tr>
		<tr>
			<th valign="top">Email ID:</th>
                        <td><input type="text" class="inp-form" id="email" name="email"/></td> 
                        <td>
                        <div class="error-left" id="1"></div>
                        <div class="error-inner" id="2">Not a valid e-mail address</div>
                        </td>
			<td></td>
		</tr>
		<tr>
			<th valign="top">Conform Email ID:</th>
                        <td><input type="text" class="inp-form" id="cemail" name="cemail" onkeyup="conform()"/></td>
			
			<td>
                            <div class="error-left" id="3"></div>
                            <div class="error-inner" id="4">Does not match with Email.</div>
			</td>
		</tr>
		
	<tr>
		<th>&nbsp;</th>
		<td valign="top">
			<input type="submit" value="Continue" class="btn-green" />
                        <input type="button" value="Cancel" class="btn-grey" onclick="location.href='history.jsp'"/>
		</td>
		<td></td>
	</tr>
	</table>
        </form>
	<!-- end id-form  -->

	</td>
	<td>

	<!--  start related-activities -->
	<div id="related-activities">
		
		<img src="images/wallet.png" alt="" width="256" height="256" longdesc="images/image_not_loaded.jpg" /></div>
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