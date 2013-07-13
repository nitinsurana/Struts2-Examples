<%-- 
    Document   : home
    Created on : Jan 4, 2013, 5:57:32 PM
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
        <h1>Home!</h1>
        <s:if test="#session['iduser']==null">
            <s:property value="#session['iduser']"/>
        </s:if>
        <s:a action="gotoauth">Visit Auth Page</s:a>
        <br/>
        <s:a action="logoutaction">LogOut</s:a>
    </body>
</html>