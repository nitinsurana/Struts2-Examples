
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jquerytheme="start" jqueryui="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <s:url id="remoteurl" action="keywordgridaction"/>
    <sjg:grid
        reloadTopics="refreshgrid" width="800"
        id="gridtable"
        caption="Bank Table"
        dataType="json"
        href="%{remoteurl}"
        pager="true"
        gridModel="gridModel"
        rowList="5,10,15,20"
        rowNum="5"
        rownumbers="true"
        onSelectRowTopics="rowselect"
        navigator="true"
        navigatorSearch="true"
        navigatorSearchOptions="{sopt:['cn']}"
        navigatorRefresh="true"
        navigatorAdd="false"
        navigatorEdit="false"
        navigatorView="true"
        navigatorDelete="false"
        draggable="true"
        resizable="true"
        >
        <sjg:gridColumn name="idkeyword" index="idkeyword" title="ID" formatter="integer"  key="true" hidden="true"/>
        <sjg:gridColumn name="valuedata" index="valuedata" title="Value" sortable="true" search="true"
                        width="300"
                        align="center"/>
    </sjg:grid>
</body>
</html>
