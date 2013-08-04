<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jquerytheme="start" jqueryui="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            $.subscribe('searchgrid', function(event,data) {
                $('#myGrid').jqGrid('searchGrid', {sopt:['cn']});
            });
        </script>
    </head>
    <body>
        Perform Searching...
        <br/>
        <sjg:grid id="myGrid" caption="Grid Data" href="gridaction"
                  pager="true" navigator="true"
                  gridModel="gridModel" dataType="json"
                  navigatorAdd="false" navigatorDelete="false" navigatorEdit="false"
                  navigatorRefresh="true" navigatorSearch="true" navigatorView="true"
                  rowList="5,10,15" rowNum="5" rownumbers="true"
                  resizable="true" loadingText="Loading..." width="400"
                  >
            <sjg:gridColumn name="id" index="id" key="true" hidden="true" title="id"/>
            <sjg:gridColumn name="name" title="name" index="name" search="true" searchoptions="{sopt:['cn']}"/>
        </sjg:grid>
        <br/><br/>
        <sj:a href="#" onClickTopics="searchgrid" button="true">Search</sj:a>
    </body>
</html>
