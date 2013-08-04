
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <sj:head jqueryui="true"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <script type="text/javascript">
        var searchoper,searchstring,searchfield;

        $.subscribe('reloadgrid',function(event,data){
            searchfield=document.getElementById('searchfield').value;
            searchstring=document.getElementById('name').value;
            searchoper=document.getElementById('searchoper').value;
            jQuery("#sjgrid").jqGrid('setGridParam',{url:"gridaction.action?searchOper="+searchoper+"&searchString="+searchstring+"&searchField="+searchfield,page:1}).trigger("reloadGrid");
        });
    </script>
</head>
<body>
    <h1>Hello World!</h1>
    <div align="center" style="border: blue">
        <p>Custom Search Example</p>
        <s:select list="#{'name':'name'}" id="searchfield" label="Field" headerKey="-1" headerValue="-select-"/>
        <s:select list="#{'cn':'contains'}" id="searchoper"/>
        <s:textfield id="name" label="Search For"/>
        <sj:submit onClickTopics="reloadgrid" value="Search"/>
    </div>
    <br/><br/>

    <s:url id="remoteurl" action="gridaction"/>
<sjg:grid id="sjgrid" caption="Table" gridModel="gridModel" dataType="json"
          href="%{remoteurl}" pager="true" navigator="true"
          rowList="5,10,15,20" rowNum="5" rownumbers="true" viewrecords="true"
          resizable="true" width="800"
          >
    <sjg:gridColumn name="name" index="name" title="Name" search="true" searchoptions="{sopt:['cn']}" align="center"/>
</sjg:grid>
</body>
</html>
