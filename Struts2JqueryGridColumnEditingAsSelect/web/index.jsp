<%--
    Document   : index
    Created on : 15 Nov, 2011, 11:45:45 PM
    Author     : XCoder
--%>

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
        <s:url id="remoteurl" action="gridaction"/>
        <s:url id="editurl" action="editaction"/>

        <sjg:grid id="sjgrid" dataType="json" href="%{remoteurl}" caption="Grid Model"
                  gridModel="gridModel" editurl="%{editurl}"
                  pager="true"
                  navigator="true"
                  >
            <sjg:gridColumn name="iduser" title="iduser" key="true" hidden="true"/>
            <sjg:gridColumn name="uname" title="Username" editable="true" align="center"
                            editrules="{required:true}"
                            />
            <sjg:gridColumn name="passwd" title="Password" editable="true" align="center"
                            editrules="{required:true}"
                            />
            <sjg:gridColumn name="country" title="Country" editable="true" align="center"
                            edittype="select"
                            editoptions="{value:'in:india;us:usa;pk:pakistan'}"
                            />
            <sjg:gridColumn name="contact" title="Contact No" editable="true" align="center"
                            editrules="{required:true,number:true,integer:true}"
                            />
        </sjg:grid>
    </body>
</html>
