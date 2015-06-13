package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/screen.css\" type=\"text/css\" media=\"screen\" title=\"default\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
      out.write("<div class=\"clear\">&nbsp;</div>\n");
      out.write(" \n");
      out.write("<!--  start nav-outer-repeat................................................................................................. START -->\n");
      out.write("<div class=\"nav-outer-repeat\"> \n");
      out.write("<!--  start nav-outer -->\n");
      out.write("<div class=\"nav-outer\"> \n");
      out.write("\n");
      out.write("\t\t<!-- start nav-right -->\n");
      out.write("\t\t<div id=\"nav-right\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\t\t\t<div class=\"showhide-account\"><b>Admin</b></div>\n");
      out.write("\t\t\t<div class=\"nav-divider\">&nbsp;</div>\n");
      out.write("\t\t\t<a href=\"\" id=\"logout\"><img src=\"images/shared/nav/nav_logout.gif\" width=\"64\" height=\"14\" alt=\"\" /></a>\n");
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
      out.write("\t\t<ul class=\"select\"><li><a ><b>Account</b><!--[if IE 7]><!--></a><!--<![endif]-->\n");
      out.write("\t\t<!--[if lte IE 6]><table><tr><td><![endif]-->\n");
      out.write("\t\t<div class=\"select_sub\">\n");
      out.write("\t\t\t<ul class=\"sub\">\n");
      out.write("\t\t\t\t<li class=\"sub_show\"><a href=\"details_account.jsp\">Account Summary</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"details_personal.jsp\">Personal Details</a></li>\n");
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
      out.write("<div id=\"page-heading\"><h1>LOGIN</h1></div>\n");
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
      out.write("    \n");
      out.write("                <script src=\"js/jquery-1.10.2.js\"></script>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    $(document).ready(function(){\n");
      out.write("                        $(\"#forgotbox\").hide();   \n");
      out.write("                        $(\"#forgot\").click(function(){\n");
      out.write("                            $(\"#forgotbox\").show();\n");
      out.write("                            $(\"#loginbox\").hide();\n");
      out.write("                        });\n");
      out.write("                        $(\"#back\").click(function(){\n");
      out.write("                            $(\"#forgotbox\").hide();\n");
      out.write("                            $(\"#loginbox\").show();\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                    \n");
      out.write("                 </script>\n");
      out.write("\t<td id=\"tbl-border-left\"></td>\n");
      out.write("\t<td>\n");
      out.write("\t<!--  start content-table-inner -->\n");
      out.write("\t<div id=\"content-table-inner\">\n");
      out.write("\t\n");
      out.write("\t<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t<tr valign=\"top\">\n");
      out.write("\t<td>\n");
      out.write("\t\n");
      out.write("            <div style=\"float: right;margin-right: 300px;margin-top: 10px;font-size: 14px\">\n");
      out.write("            <b>Not a user,<a href=\"register_1.jsp\">Register here</a></b>\n");
      out.write("        </div>\n");
      out.write("\t<!--  start loginbox ................................................................................. -->\n");
      out.write("\t<div id=\"loginbox\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!--  start login-inner -->\n");
      out.write("\t<div id=\"login-inner\">\n");
      out.write("            <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>Email or Account ID</th>\n");
      out.write("\t\t\t<td><input type=\"text\"  class=\"login-inp\" name=\"uname\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>Password</th>\n");
      out.write("                        <td><input type=\"password\" value=\"************\"  onfocus=\"this.value=''\" class=\"login-inp\" name=\"upass\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th></th>\n");
      out.write("                        <td valign=\"top\"><a   id=\"forgot\">Forgot Password?</a></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th></th>\n");
      out.write("                        <td><input type=\"submit\" class=\"submit-login\"  /></td>\n");
      out.write("                        \n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("\t</div>\n");
      out.write(" \t<!--  end login-inner -->\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write(" <!--  end loginbox -->\n");
      out.write(" \n");
      out.write("\t<!--  start forgotbox ................................................................................... -->\n");
      out.write("\t<div id=\"forgotbox\">\n");
      out.write("\t\t<div id=\"forgotbox-text\">Please send us your email and we'll reset your password.</div>\n");
      out.write("\t\t<!--  start forgot-inner -->\n");
      out.write("\t\t<div id=\"forgot-inner\">\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>Email address:</th>\n");
      out.write("\t\t\t<td><input type=\"text\" value=\"\"   class=\"login-inp\" /></td>\n");
      out.write("\t\t</tr>\n");
      out.write("                <tr>\n");
      out.write("\t\t\t<th></th>\n");
      out.write("                        <td valign=\"top\"><a  id=\"back\">Back to login</a> </td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th></th>\n");
      out.write("\t\t\t<td><input type=\"button\" class=\"submit-login\"  /></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--  end forgot-inner -->\n");
      out.write("\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<!--  end forgotbox -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      \t\n");
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