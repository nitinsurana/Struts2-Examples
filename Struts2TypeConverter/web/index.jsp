<%-- 
    Document   : index
    Created on : Jun 9, 2011, 3:08:48 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jqueryui="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <s:url id="nid" action="showaction"/>
        <s:a href="%{nid}">Fill Form</s:a>
        <br/><br/>

        <s:form action="saveaction" method="post">
            <s:textfield key="mymodel.name" label="Name"/>
            <sj:datepicker label="DOB" name="mymodel.dob" changeMonth="true" changeYear="true" displayFormat="dd.mm.yy"/>
            <s:submit/>
        </s:form>
    </body>
</html>
