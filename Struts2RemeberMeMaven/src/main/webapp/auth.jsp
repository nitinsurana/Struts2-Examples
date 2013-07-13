<%-- 
    Document   : auth
    Created on : Jan 4, 2013, 6:03:38 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Authentication Valid</h1>
        <s:property value="#session['iduser']" default="No IDUSER"/>
    </body>
</html>
