<%-- 
    Document   : start
    Created on : Mar 1, 2011, 2:05:28 AM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:url id="remoteact" action="naction"/>
        <s:a href="%{remoteact}">Click On Me</s:a>
    </body>
</html>
