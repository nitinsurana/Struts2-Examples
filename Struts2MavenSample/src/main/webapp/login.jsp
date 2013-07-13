<%-- 
    Document   : login
    Created on : Jul 1, 2013, 4:51:13 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Please Login!</h1>
        <s:actionerror/>
        <!s:form action="login">
    <form action="login">
        <!s:textfield label="Email" name="uu.email"/>
        <!s:textfield label="Password" name="uu.passwd"/>
        <input type="text" name="uu.email"/>
        <input type="text" name="uu.passwd"/>
        <input type="submit" value="Submit"/>
        <!s:submit/>
        <!/s:form>
    </form>
</body>
</html>
