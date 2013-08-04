<%--
    Document   : nn
    Created on : 30 Oct, 2011, 1:35:53 AM
    Author     : XCoder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jquerytheme="start" jqueryui="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:url id="topgrid" action="countrygrid"/>
        <s:url id="middlegrid" action="stategrid"/>
        <s:url id="bottomgrid" action="citygrid"/>

        <sjg:grid dataType="json" gridModel="gridModel" navigator="false"
                  pager="true"
                  viewrecords="true" width="600"
                  href="%{topgrid}">

            <sjg:grid dataType="json" gridModel="gridModel" navigator="false"
                      pager="true"
                      viewrecords="true" width="500"
                      subGridUrl="%{middlegrid}">

                <sjg:grid dataType="json" gridModel="gridModel" navigator="false"
                          pager="true"
                          viewrecords="true" width="400"
                          subGridUrl="%{bottomgrid}">
                    <sjg:gridColumn name="idcity" title="City Id" key="true"/>
                    <sjg:gridColumn name="cityname" title="City Name" align="center"/>
                </sjg:grid>

                <sjg:gridColumn name="idstate" title="State Id" key="true"/>
                <sjg:gridColumn name="statename" title="State Name" align="center"/>
            </sjg:grid>

            <sjg:gridColumn name="idcountry" title="Country Id" key="true"/>
            <sjg:gridColumn name="countryname" title="Country Name" align="center"/>
        </sjg:grid>
    </body>
</html>
