<%-- 
    Document   : index
    Created on : Jan 11, 2012, 6:52:00 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <s:head/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <s:form action="saveaction" validate="true">
            <s:textfield name="name" label="Name"/>
            <s:submit/>
        </s:form>
    </body>
</html>
