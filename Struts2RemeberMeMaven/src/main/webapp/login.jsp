<%-- 
    Document   : x
    Created on : Jan 4, 2013, 5:47:37 PM
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
        <h1>Hello World!</h1>
        <s:actionerror/>
        <s:actionmessage/>

        <s:property value="#session['iduser']" default="Not Logged In"/>

        <s:form action="loginaction" method="post">
            <s:textfield name="email" label="Email"/>
            <s:textfield name="passwd" label="Password"/>
            <s:submit/>
        </s:form>
    </body>
</html>
