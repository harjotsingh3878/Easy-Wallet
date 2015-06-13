<%@page import="admin.bean.User"%>
<%@page import="admin.bean.Account"%>
<%@page import="admin.bean.History"%>
<%@page import="java.util.ArrayList"%>
<%@page import="admin.model.HistoryDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" title="default" />
<link href="css/tables.css" rel="stylesheet" type="text/css" />

</head>
<body> 
    <jsp:include page="header.jsp"></jsp:include>
 <%
      Account account=(Account)session.getAttribute("account");
       User user=(User)session.getAttribute("user");
       
       if(account==null)
        {            
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
%>	
<div class="clear">&nbsp;</div>
 
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
		
			<!--  start account-content -->	
			<div class="account-content">
			<div class="account-drop-inner">
				<a href="" id="acc-settings">Settings</a>
				<div class="clear">&nbsp;</div>
				<div class="acc-line">&nbsp;</div>
				<a href="" id="acc-details">Personal details </a>
				<div class="clear">&nbsp;</div>
				<div class="acc-line">&nbsp;</div>
				<a href="" id="acc-project">Project details</a>
				<div class="clear">&nbsp;</div>
				<div class="acc-line">&nbsp;</div>
				<a href="" id="acc-inbox">Inbox</a>
				<div class="clear">&nbsp;</div>
				<div class="acc-line">&nbsp;</div>
				<a href="" id="acc-stats">Statistics</a> 
			</div>
			</div>
			<!--  end account-content -->
		
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


<div id="page-heading"><h1>TRANSACTION HISTORY</h1></div>


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
                    <form action="history_search.jsp" method="post">
			<table border="0" cellpadding="0" cellspacing="0">
		<tr>
                    <td><input type="text" value="Search" name="search" onblur="if (this.value=='') { this.value='Search'; }" onfocus="if (this.value=='Search') { this.value=''; }" class="top-search-inp" /></td>
		<td>
		 
                    <select  class="styledselect" name="opt">
			
			<option value="type">Transaction Type</option>
			<option value="credit">Credit/Debit</option>
			<option value="status">Status</option>
			
		</select> 
		 
		</td>
		<td>
		<input type="image" src="images/shared/top_search_btn.gif"  />
		</td>
		</tr>
		</table>
                    </form>
		</div>  
                <!--  end step-holder -->
                <%
                    int q=0;
                    int x=1,y=1;
                    String pid=request.getParameter("pid") ;
                    String nid=request.getParameter("nid") ;
                    if(pid==null)
                        {
                    }
                    else{
                    x=Integer.parseInt(pid);
                    }
                    if(nid==null)
                        {
                    }
                    else{
                    y=Integer.parseInt(nid);
                    }


                    %>
                 <script language="JavaScript" type="text/javascript">
                    function checkAll()
                    {
                        var a=document.getElementById("chkMain");
                        var b=document.getElementsByName("chk");
                        
                        if(a.checked==true)
                            {                             
                                for(i=0;i<b.length;i++)
                                    {
                                        b[i].checked=true;
                                    }
                            }                      
                        else
                            {
                                for(var i=0;i<b.length;i++)
                                    {
                                        b[i].checked=false;
                                    }
                            }
                    }
                </script> 
                
		
	        <div style="height:20px"></div>
		<!--  start product-table ..................................................................................... -->
				<form id="mainform" action="">
				<table border="0" width="100%" cellpadding="0" cellspacing="0" id="product-table">
				<tr>
                                    <th class="table-header-check" ><input id="chkMain" type="checkbox" onClick="checkAll()"/></th>
					<th class="table-header-repeat line-left minwidth-1"><a href="">Transaction Type</a>	</th>
					<th class="table-header-repeat line-left minwidth-1"><a href="">Credit/Debit(in Rs.)</a></th>
					<th class="table-header-repeat line-left"><a href="">Status</a></th>
					<th class="table-header-repeat line-left"><a href="">Date</a></th>					
					<th class="table-header-options line-left"><a href="">Options</a></th>
				</tr>
				
                                    
                                <%
                                    int did=account.getDid();
                                    HistoryDao hd=new HistoryDao();
                                    ArrayList al=hd.getHistory(x,y,did); %>
                   
                                    
                                    
                                <%    for(int a=0;a<al.size();a++)
                                    {     %>
                   
               
                                
				<tr class="alternate-row">
                                    
                                 <%   History hs=(History)al.get(a);  
                                       request.setAttribute("history", hs);
                                       q=hs.getCount();
                                       
                                 %>
                                 <form action="HistoryServlet">
                                 <td><input name="chk"  type="checkbox"/></td>
					<td><%=hs.getType()%></td>
					<td><%=hs.getAmount()%></td>
					<td><a><%=hs.getStatus()%></a></td>
					<td><%=hs.getDte()%></td>				
					<td class="options-width">
                                            <%if(hs.getMsg_to()!=null)
                                            {%>
                                        <a href="HistoryServlet?tid=<%=hs.getTid()%>&name=view1" title="Edit" class="icon-1 info-tooltip"></a>
					
                                          <%  }
                                            else{    
                                           %>
                                          <a href="HistoryServlet?tid=<%=hs.getTid()%>&name=view" title="Edit" class="icon-1 info-tooltip"></a>
                                        <% }
                                            
                                            %>
                                        
					<a href="HistoryServlet?tid=<%=hs.getTid()%>&name=delete" title="Delete" class="icon-2 info-tooltip"></a>                                    
					
					</td>
                                 </form>
				</tr>
                                    <%}%>    
				
                                    
				
				
				</table>
				<!--  end product-table................................... --> 
				</form>
                
                <script src="js/jquery-1.10.2.js"></script>
                <script type="text/javascript">
                    $(document).ready(function(){
                        $('#actions-box-slider').hide();
                       
                        
                        $('.action-slider').click(function(){
                            $('#actions-box-slider').toggle();
                            
                            
                        });
                    });
                 </script>
			<!--  start actions-box ............................................... -->
			<div id="actions-box">
				<a class="action-slider"></a>
				<div id="actions-box-slider">
					
					<a href="" class="action-delete">Delete</a>
				</div>
				<div class="clear"></div>
			</div>
			<!-- end actions-box........... -->
                
                
                                <!--  start paging..................................................... -->
			<table border="0" cellpadding="0" cellspacing="0" id="paging-table">
			<tr>
			<td>
                            <%
                                if(x==1)
                                {
                                    
                                }
                                else
                                {%>
                                    
                            
				<a href="history.jsp?pid=1&nid=<%=y%>" class="page-far-left"></a>
				<a href="history.jsp?pid=<%=x-y%>&nid=<%=y%>" class="page-left"></a>
                                
                                 <%   }
                            %>
				<div id="page-info">Page <strong><%=x%></strong> / <%=x+y-1%></div>
                                
                             <%
                                 if((x+y-1)>=q){
                                     
                                 }
                                 else{
                             %>
				<a href="history.jsp?pid=<%=x+y%>&nid=<%=y%>" class="page-right"></a>
				<a href="history.jsp?pid=1&nid=<%=y%>" class="page-far-right"></a>
                                <%   }
                            %>
			</td>
			<td>
                        <select  class="styledselect_pages" onchange="location=this.options[this.selectedIndex].value;">
				<option value="">Number of rows</option>
                                <option value="history.jsp?nid=1">1</option>
				<option value="history.jsp?nid=2">2</option>
				<option value="history.jsp?nid=3">3</option>
			</select>
			</td>
			</tr>
			</table>
			<!--  end paging................ -->
			
			<div class="clear"></div>

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