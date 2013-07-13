<%-- 
    Document   : index
    Created on : Apr 19, 2011, 12:53:32 AM
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
        <s:url id="downid" action="downloadfile"/>
        <s:a href="%{downid}">Download</s:a>
    </body>
</html>
