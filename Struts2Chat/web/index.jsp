
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Guest!</h1>
        <h2>Welcome to Online Microsoft Office help</h2>

        <s:form action="saveuser">
            <s:textfield name="uname" label="Enter ur name, please"/>
            <s:submit/>
        </s:form>

    </body>
</html>
