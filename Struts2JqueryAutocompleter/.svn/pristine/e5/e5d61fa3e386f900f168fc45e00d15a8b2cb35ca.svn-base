
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jquerytheme="start" jqueryui="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is prefilled by the action</p>
        <sj:autocompleter name="myautocmp1" list="mylist" label="From (A-F)"/>
        <br/>

        <s:url id="ajaxurl" action="ajaxfill"/>
        <s:form id="ajaxform" method="post" action="ajaxfill">
            <sj:autocompleter name="myautocmp2" formIds="ajaxform" list="ajaxlist" label="From (A-F)" href="%{ajaxurl}" deferredLoading="true" size="5"/>
        </s:form>
        <br/>


        <s:iterator value="mylist">
            <s:property />
        </s:iterator>
    </body>
</html>
