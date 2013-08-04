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
        <s:a href="myaction" >myaction heere</s:a>
        <br/><br/><br/><br/>
        Perform Searching...
        <br/>
        <s:url id="remoteurl" action="gridaction">
            <s:param name="loadonce" value="%{true}" />
        </s:url>
        <sjg:grid id="myGrid"
                  caption="Grid Data"
                  href="%{remoteurl}"
                  loadonce="true"
                  gridModel="gridModel"
                  rowNum="-1"
                  hidegrid="true"
                  scroll="true"
                  >
            <sjg:gridColumn name="id" index="id" key="true" hidden="true" title="id"/>
            <sjg:gridColumn name="name" title="name" index="name" search="true" searchoptions="{sopt:['cn']}"/>
        </sjg:grid>
        <br/><br/>
        <sj:a href="#" onClickTopics="searchgrid" button="true">Search</sj:a>
    </body>
</html>
