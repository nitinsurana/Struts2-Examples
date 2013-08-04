<%-- 
    Document   : index
    Created on : 28 Aug, 2011, 4:56:41 PM
    Author     : XCoder
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:url id="report" action="reportaction"/>
        <s:a href="%{report}">Get Report</s:a>
    </body>
</html>
