<%-- 
    Document   : index
    Created on : May 17, 2011, 6:14:18 PM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sj:head jquerytheme="start" jqueryui="true"/>
    </head>
    <body>
        <h1>Hello World</h1>
        <br><br>

        <s:url id="remoteurl" action="gridaction"/>
        <sjg:grid
            id="gridtable"
            caption="Caste Table"
            href="%{remoteurl}"
            pager="true"
            gridModel="gridModel"
            rowList="5,10,15,20"
            rowNum="5"
            navigator="true"
            >
            <sjg:gridColumn name="id" index="id" title="ID" formatter="integer"  key="true" hidden="true"/>
            <sjg:gridColumn name="name" index="name" title="Caste" sortable="true" search="true"
                            width="600"
                            align="center"/>
        </sjg:grid>
    </body>
</html>
