package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=0\" />\n");
      out.write("\t<title>EASY WALLET</title>\n");
      out.write("\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"css/images/favicon.ico\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Coda' rel='stylesheet' type='text/css' />\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Jura:400,500,600,300' rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- wrapper -->\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("\t\t<!-- header -->\n");
      out.write("\t\t<header class=\"header\">\n");
      out.write("\t\t\t<div class=\"shell\">\n");
      out.write("\t\t\t\t<div class=\"header-top\">\n");
      out.write("                                    <h1 id=\"logo\"><img src=\"css/logo.png\" height=\"57px\" width=\"57px\"></h1>\n");
      out.write("\t\t\t\t\t<nav id=\"navigation\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"nav-btn\">Home<span></span></a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                    <li style=\"margin-right: 90px ;font-size: 22px\"><a href=\"details_account.jsp\">Easy Wallet</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active home\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"details_account.jsp\">Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"money_in_first.jsp\">transactions</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"history.jsp\">History</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"settings.jsp\">Settings</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"slider\">\n");
      out.write("\t\t\t\t\t<div id=\"bg\"></div>\n");
      out.write("\t\t\t\t\t<div id=\"carousel\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h5>It all starts with a</h5>\n");
      out.write("\t\t\t\t\t\t\t<h3>Great Vision</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>This application provides facilities like cash load, sending money, buying online and make transactions more effectively, and you can send money by logging into your easy wallet account. With the help of this you can also add and manage your credit and debit cards.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"login.jsp\" class=\"green-btn\">Get Started</a>\n");
      out.write("                                                        <img class=\"img-front\" src=\"css/Money-transfer.jpg\" alt=\"dot1\" width=\"403\" height=\"336\" style=\"margin-top: 50px;margin-right: 100px\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h5>It all starts with a</h5>\n");
      out.write("\t\t\t\t\t\t\t<h3>Great Vision</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget augue quis quam dignissim consectetur ac sit amet nisl. In hac habitasse platea. Eget augue quis quam dignissi lorem lipsum adispicing dolor sit amet.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"login.jsp\" class=\"green-btn\">Get Started</a>\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-front\" src=\"css/images/front-img.png\" alt=\"dot1\" width=\"263\" height=\"436\" />\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-mid\" src=\"css/images/img-mid.png\" alt=\"dot2\" width=\"230\" height=\"363\" />\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-back\" src=\"css/images/img-back.png\" alt=\"dot3\" width=\"195\" height=\"304\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h5>It all starts with a</h5>\n");
      out.write("\t\t\t\t\t\t\t<h3>Great Vision</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget augue quis quam dignissim consectetur ac sit amet nisl. In hac habitasse platea. Eget augue quis quam dignissi lorem lipsum adispicing dolor sit amet.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"green-btn\">FREE Quote</a>\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-front\" src=\"css/images/front-img.png\" alt=\"dot1\" width=\"263\" height=\"436\" />\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-mid\" src=\"css/images/img-mid.png\" alt=\"dot2\" width=\"230\" height=\"363\" />\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-back\" src=\"css/images/img-back.png\" alt=\"dot3\" width=\"195\" height=\"304\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h5>It all starts with a</h5>\n");
      out.write("\t\t\t\t\t\t\t<h3>Great Vision</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget augue quis quam dignissim consectetur ac sit amet nisl. In hac habitasse platea. Eget augue quis quam dignissi lorem lipsum adispicing dolor sit amet.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"green-btn\">FREE Quote</a>\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-front\" src=\"css/images/front-img.png\" alt=\"dot1\" width=\"263\" height=\"436\" />\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-mid\" src=\"css/images/img-mid.png\" alt=\"dot2\" width=\"230\" height=\"363\" />\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img-back\" src=\"css/images/img-back.png\" alt=\"dot3\" width=\"195\" height=\"304\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t<!-- end of header -->\n");
      out.write("\t\t<!-- shell -->\n");
      out.write("\t\t<div class=\"shell\">\n");
      out.write("\t\t\t<!-- main -->\n");
      out.write("\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t<!-- cols -->\n");
      out.write("\t\t\t\t<section class=\"cols\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t\t<img src=\"css/images/col-img1.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"col-cnt\">\n");
      out.write("\t\t\t\t\t\t\t<h2>BRAINSTORM</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing dolor emor</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"more\">view more</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t\t<img src=\"css/images/col-img2.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"col-cnt\">\n");
      out.write("\t\t\t\t\t\t\t<h2>DESIGN</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Duis risus elit, imperdiet eget sollicitudin quis, gravida sed mi. </p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"more\">view more</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t\t<img src=\"css/images/col-img3.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"col-cnt\">\n");
      out.write("\t\t\t\t\t\t\t<h2>CODE</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Proin quis sem in mauris fringilla commodo ac a felis.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"more\">view more</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t<!-- end of cols -->\n");
      out.write("\t\t\t\t<section class=\"post\">\n");
      out.write("                                    <img src=\"css/Money-transfer1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t<div class=\"post-cnt\">\n");
      out.write("\t\t\t\t\t\t<h2>Yes, that would be the logical choice</h2>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\tOnline transaction allows users to exchange money between two parties, store money  in a safe and secure manner, in this usually money is transmitted virtually between people which are miles away from each other . Operations include sending, storing, processing, and receiving money, \t\n");
      out.write("                                                </p>\n");
      out.write("                                                <p>\n");
      out.write("                                                    Online transaction is the system which is used to establish online transactions among the users at different locations within or across the nations. This service makes transaction of money simple and efficient for users. Reduce paper trials and faster, more accurate transactions.\n");
      out.write("                                                </p>\n");
      out.write("                                                <p>\n");
      out.write("                                                    The purpose of Online Transaction is, that a user anywhere can send and receive money to anyone who is having an internet connection. It will work like actual money exchange between two people.\n");
      out.write("                                                </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- end of main -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end of shell -->\t\n");
      out.write("\t\t<!-- footer -->\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<!-- shell -->\n");
      out.write("\t\t\t<div class=\"shell\">\n");
      out.write("\t\t\t\t<!-- footer-cols -->\n");
      out.write("\t\t\t\t<div class=\"footer-cols\">\n");
      out.write("\t\t\t\t\t<div class=\"col\">\n");
      out.write("\t\t\t\t\t\t<h2>SERVICES</h2>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"money_in_first.jsp\">Deposit Money into Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"card_register.jsp\">Register Cards for Online Transactions</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"money_send.jsp\">Send Money to Registered Users </a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col\" style=\"float: right\">\n");
      out.write("\t\t\t\t\t\t<h2>CONTACT us</h2>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<p>Email: <a href=\"#\">hss2612@yahoo.com</a></p>\n");
      out.write("\t\t\t\t\t\t<p>Phone: 9780927572</p>\n");
      out.write("\t\t\t\t\t\t<p>Address: East Pixel Bld. 99, </p>\n");
      out.write("\t\t\t\t\t\t<p>Chandigarh, India</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- end of footer-cols -->\n");
      out.write("\t\t\t\t<div class=\"footer-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-nav\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"details_account.jsp\">Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"money_in_first.jsp\">transactions</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"history.jsp\">History</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"settings.jsp\">Settings</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p class=\"copy\">© Copyright &copy; 2013<span>|</span> Developed by Harjot Singh and Mayank Garg . All rights reserved. </p>\n");
      out.write("\t\t\t\t\t<div class=\"cl\">&nbsp;</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- end of shell -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- footer -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end of wrapper -->\n");
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
