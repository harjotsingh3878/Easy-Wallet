<%@page import="admin.bean.User"%>
<%@page import="admin.bean.Account"%>
<%@page import="admin.bean.Cards"%>
<%@page import="java.util.ArrayList"%>
<%@page import="admin.model.CardDao"%>
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

                            <ul class="select"><li><a ><b>Transactions</b><!--[if IE 7]><!--></a><!--<![endif]-->
                                    <!--[if lte IE 6]><table><tr><td><![endif]-->
                                    <div class="select_sub">
                                        <ul class="sub">
                                            <li><a style="width: 150px"></a></li>
                                            <li ><a href="money_in_first.jsp">Money In</a></li>
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

                            <ul class="current"><li ><a href="settings.jsp"><b>Settings</b><!--[if IE 7]><!--></a><!--<![endif]-->

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


                    <div id="page-heading"><h1>SETTINGS</h1></div>

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
                                                                without registered cards.
                                                                <ul class="greyarrow">
                                                                    <li><a href="money_in.jsp">Click here to visit</a></li> 

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

                                                    <div id='cssmenu'>
                                                        <ul>

                                                            <li class='has-sub'><a href='#'><span>Change Password</span></a>
                                                                <ul>   
                                                                    <li>
                                                                        <span>If  you want to change your password you can continue</span>
                                                                        <!-- start id-form -->
                                                                        <form action="password.jsp" method="">
                                                                            <table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                                                                                <tr style="height:25px"></tr><tr></tr>

                                                                                <tr>
                                                                                    <th>&nbsp;</th>
                                                                                    <td valign="top">
                                                                                        <input type="submit" value="Continue" class="btn-green" />

                                                                                    </td>
                                                                                    <td></td>
                                                                                </tr>
                                                                            </table>
                                                                        </form>
                                                                        <!-- end id-form  -->

                                                                    </li>

                                                                </ul>
                                                            </li>


                                                           <li class='has-sub'><a href='#'><span>Change Security ID</span></a>
                                                                <ul>   
                                                                    <li>
                                                                        <span>If  you want to change your security ID you can continue</span>
                                                                        <!-- start id-form -->
                                                                        <form action="security.jsp" method="">
                                                                            <table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                                                                                <tr style="height:25px"></tr><tr></tr>

                                                                                <tr>
                                                                                    <th>&nbsp;</th>
                                                                                    <td valign="top">
                                                                                        <input type="submit" value="Continue" class="btn-green" />

                                                                                    </td>
                                                                                    <td></td>
                                                                                </tr>
                                                                            </table>
                                                                        </form>
                                                                        <!-- end id-form  -->

                                                                    </li>

                                                                </ul>
                                                            </li>
                                                            
                                                        </ul>
                                                    </div>
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