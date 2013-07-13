<%-- 
    Document   : index
    Created on : 23 Oct, 2011, 6:56:17 PM
    Author     : XCoder
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
        <s:actionerror/>
        <s:actionmessage/>

        <s:form action="saveaction">
            <s:token/>
            <s:textfield name="name" label="Enter ur name"/>
            <s:submit/>
        </s:form>
    </body>
</html>
