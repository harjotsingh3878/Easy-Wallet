<%-- 
    Document   : test2
    Created on : Sep 21, 2013, 8:54:05 PM
    Author     : gagan
--%>

<%@page import="admin.model.Dummy"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Dummy du=new Dummy();
    int status=du.insertDummy();
    
    if(status>0)
    {
        response.sendRedirect("login.jsp");
    }
    else
    {
        response.sendRedirect("test.jsp");
    }

%>