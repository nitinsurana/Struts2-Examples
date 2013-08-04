<%-- 
    Document   : index
    Created on : 25 Oct, 2011, 6:05:37 PM
    Author     : XCoder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
        <s:form action="savemainform" id="mainform">
            <s:url id="countrylist" action="lstcountryaction"/>
            <sj:select list="lstcountry" listKey="idcountry" listValue="countryname" label="Country" href="%{countrylist}"
                       name="idcountry" onChangeTopics="reloadstatelist,reloadcitylist" onCompleteTopics="reloadstatelist,reloadcitylist" />

            <s:url id="statelist" action="lststateaction"/>
            <sj:select list="lststate" listKey="idstate" listValue="statename" label="State" href="%{statelist}" formIds="mainform"
                       name="idstate" reloadTopics="reloadstatelist" deferredLoading="true" onChangeTopics="reloadcitylist" onCompleteTopics="reloadcitylist"/>

            <s:url id="citylist" action="lstcityaction"/>
            <sj:select list="lstcity" listKey="idcity" listValue="cityname" label="City" href="%{citylist}" formIds="mainform"
                       name="idcity" reloadTopics="reloadcitylist" deferredLoading="true"/>
            <s:submit/>
        </s:form>
    </body>
</html>
