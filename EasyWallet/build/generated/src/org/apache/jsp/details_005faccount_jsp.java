package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import admin.bean.History;
import admin.bean.User;
import admin.bean.Account;

public final class details_005faccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/screen.css\" type=\"text/css\" media=\"screen\" title=\"default\" />\n");
      out.write("<link href=\"css/tables.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- End: page-top-outer -->\n");
      out.write("\t\n");
      out.write("<div class=\"clear\">&nbsp;</div>\n");

       Account account=(Account)session.getAttribute("account");
       User user=(User)session.getAttribute("user");
       History hs=(History)request.getAttribute("history");

      out.write("\n");
      out.write("<!--  start nav-outer-repeat................................................................................................. START -->\n");
      out.write("<div class=\"nav-outer-repeat\"> \n");
      out.write("<!--  start nav-outer -->\n");
      out.write("<div class=\"nav-outer\"> \n");
      out.write("\n");
      out.write("\t\t<!-- start nav-right -->\n");
      out.write("\t\t<div id=\"nav-right\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("                        <div class=\"showhide-account\"><b>");
      out.print(user.getFirstname());
      out.print(" ");
      out.print(user.getLastname());
      out.write("</b></div>\n");
      out.write("\t\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\t\t\t<a href=\"logout.jsp\" id=\"logout\"><img src=\"images/shared/nav/nav_logout.gif\" width=\"64\" height=\"14\" alt=\"\" /></a>\n");
      out.write("\t\t\t<div class=\"clear\">&nbsp;</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end nav-right -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!--  start nav -->\n");
      out.write("\t\t<div class=\"nav\">\n");
      out.write("\t\t<div class=\"table\">\n");
      out.write("\t\t<ul class=\"select\"><li><a href=\"index.jsp\"><b>Home</b><!--[if IE 7]><!--></a>\n");
      out.write("                 \n");
      out.write("                </li>\n");
      out.write("\t\t</ul>\n");
      out.write("                <div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("                \n");
      out.write("\t\t<ul class=\"current\"><li><a ><b>Account</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("\t\t<!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\t\t<div class=\"select_sub show\">\n");
      out.write("\t\t\t<ul class=\"sub\">\n");
      out.write("\t\t\t\t<li class=\"sub_show\"><a href=\"details_account.jsp\">Account Summary</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"users_edit.jsp\">Personal Details</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"deposit_cards.jsp\">Deposit Options</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--[if lte IE 6]></td></tr></table></a><![endif]-->\n");
      out.write("\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\t\t                    \n");
      out.write("\t\t<ul class=\"select\"><li><a ><b>Transactions</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("\t\t<!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\t\t<div class=\"select_sub\">\n");
      out.write("\t\t\t<ul class=\"sub\">\n");
      out.write("                                <li><a style=\"width: 150px\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"money_in_first.jsp\">Money In</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"money_out_first.jsp\">Money Out</a></li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--[if lte IE 6]></td></tr></table></a><![endif]-->\n");
      out.write("\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"select\"><li><a href=\"history.jsp\"><b>History</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("\t\t\n");
      out.write("\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"select\"><li><a href=\"contact.jsp\"><b>Contacts</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("\t\t\n");
      out.write("\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"select\"><li><a href=\"settings.jsp\"><b>Settings</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("\t\t\n");
      out.write("\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--  start nav -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("<!--  start nav-outer -->\n");
      out.write("</div>\n");
      out.write("<!--  start nav-outer-repeat................................................... END -->\n");
      out.write(" \n");
      out.write(" <div class=\"clear\"></div>\n");
      out.write(" \n");
      out.write("<!-- start content-outer -->\n");
      out.write("<div id=\"content-outer\">\n");
      out.write("<!-- start content -->\n");
      out.write("<div id=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page-heading\"><h1>ACCOUNT SUMARY</h1></div>\n");
      out.write("\n");
      out.write("                <!--  start step-holder -->\n");
      out.write("\t\t<div style=\"float: left;margin: 0px 0px 5px 200px;\">\n");
      out.write("\t\t\t<input id=\"name\" name=\"name\" class=\"text1\" value=\"Account ID :");
      out.print(account.getAccount_id());
      out.write(" \" disabled/>\n");
      out.write("                        ");

                           if(account.getBalance().equals("0"))
                           {  System.out.println("zero");
                        
      out.write("\n");
      out.write("                         <input id=\"name\" name=\"name\" class=\"text2\" value=\"Available Balance Rs.");
      out.print(account.getBalance());
      out.write("\" disabled/>\n");
      out.write("                         ");

                           }else{  System.out.println("else");
                         
      out.write("\n");
      out.write("                         <input id=\"name\" name=\"name\" class=\"text3\" value=\"Available Balance Rs.");
      out.print(account.getBalance());
      out.write("\" disabled/>\n");
      out.write("                         ");
}
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--  end step-holder -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" id=\"content-table\">\n");
      out.write("<tr>\n");
      out.write("\t<th rowspan=\"3\" class=\"sized\"><img src=\"images/shared/side_shadowleft.jpg\" width=\"20\" height=\"300\" alt=\"\" /></th>\n");
      out.write("\t<th class=\"topleft\"></th>\n");
      out.write("\t<td id=\"tbl-border-top\">&nbsp;</td>\n");
      out.write("\t<th class=\"topright\"></th>\n");
      out.write("\t<th rowspan=\"3\" class=\"sized\"><img src=\"images/shared/side_shadowright.jpg\" width=\"20\" height=\"300\" alt=\"\" /></th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<td id=\"tbl-border-left\"></td>\n");
      out.write("\t<td>\n");
      out.write("\t<!--  start content-table-inner -->\n");
      out.write("\t<div id=\"content-table-inner\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\n");
      out.write("\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t<tr valign=\"top\">\n");
      out.write("\t<td>\n");
      out.write("            \n");
      out.write("            <div id=\"message-yellow\">\n");
      out.write("\t\t\t\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td class=\"yellow-left\">You have a new message. <a href=\"\">Go to Inbox.</a></td>\n");
      out.write("\t\t\t\t\t<td class=\"yellow-right\"><a class=\"close-yellow\"><img src=\"images/table/icon_close_yellow.gif\"   alt=\"\" /></a></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t<!--  start step-holder -->\n");
      out.write("\t\t<div id=\"step-holder\">\n");
      out.write("\t\t\t<b>Here is quick summary of your account details.</b>\n");
      out.write("                        \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--  end step-holder -->\n");
      out.write("\t        <div style=\"height:0px\"></div>\n");
      out.write("\t\t<!-- start id-form -->\n");
      out.write("                <form action=\"\" method=\"\">\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  id=\"table\">\n");
      out.write("                    \n");
      out.write("\t\t\n");
      out.write("                <tbody>\n");
      out.write("        \n");
      out.write("        <tr class=\"light\"><td width=\"223\"><div class=\"\">ACCOUNT ID</div></td><td width=\"265\"><input name=\"amount\" type=\"text\" class=\"input1\"  value=\"");
      out.print(account.getAccount_id());
      out.write("\" id=\"fname\" disabled /></td></tr>\n");
      out.write("        <tr class=\"dark\"><td><div class=\"\">SECURE ID</div></td><td><input name=\"user\" type=\"text\" class=\"input\" value=\"XXXXX\"  id=\"user\" disabled/><a href=\"#\">Retrieve</a></td></tr>\n");
      out.write("    <tr class=\"light\"><td><div class=\"\">LAST LOGIN</div></td><td><input name=\"expiry\" type=\"text\" class=\"input1\"  value=\"");
      out.print(account.getLogin());
      out.write("\"  id=\"pass\" disabled/></td></tr>\n");
      out.write("    <tr class=\"dark\"><td><div class=\"\">CARD REGISTERED</div></td><td><input name=\"password\" type=\"text\" class=\"input\" value=\"");
      out.print(account.getCards());
      out.write("\" id=\"conform\" disabled/></td></tr>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <input name=\"categoty\" type=\"hidden\" value=\"\" />\n");
      out.write("            </tbody>\n");
      out.write("              \n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t</table>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("\t<!-- end id-form  -->\n");
      out.write("\n");
      out.write("\t</td>\n");
      out.write("\t<td>\n");
      out.write("\n");
      out.write("\t<!--  start related-activities -->\n");
      out.write("\t<div id=\"related-activities\">\n");
      out.write("\t\t<img src=\"images/Master-Card-icon.png\" alt=\"\" width=\"206\" height=\"156\" longdesc=\"images/image_not_loaded.jpg\" />\n");
      out.write("        <img src=\"images/credit-card-19.png\" alt=\"\" width=\"206\" height=\"156\" longdesc=\"images/image_not_loaded.jpg\" /></div>\n");
      out.write("\t<!-- end related-activities -->\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><img src=\"images/shared/blank.gif\" width=\"695\" height=\"1\" alt=\"blank\" /></td>\n");
      out.write("<td></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write(" \n");
      out.write("<div class=\"clear\"></div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--  end content-table-inner  -->\n");
      out.write("</td>\n");
      out.write("<td id=\"tbl-border-right\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("\t<th class=\"sized bottomleft\"></th>\n");
      out.write("\t<td id=\"tbl-border-bottom\">&nbsp;</td>\n");
      out.write("\t<th class=\"sized bottomright\"></th>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"clear\">&nbsp;</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--  end content -->\n");
      out.write("<div class=\"clear\">&nbsp;</div>\n");
      out.write("</div>\n");
      out.write("<!--  end content-outer -->\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<div class=\"clear\">&nbsp;</div>\n");
      out.write("    \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}