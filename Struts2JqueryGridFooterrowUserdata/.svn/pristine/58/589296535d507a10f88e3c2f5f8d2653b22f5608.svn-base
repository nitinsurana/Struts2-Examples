<%-- 
    Document   : index
    Created on : 30 Oct, 2011, 2:05:53 AM
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
        <s:url id="remoteurl" action="gridfillaction"/>

        <sjg:grid id="sjgrid" dataType="json" href="%{remoteurl}"
                  navigator="true" viewrecords="true"
                  pager="true"
                  gridModel="gridModel"
                  width="600"
                  footerrow="true"
                  userDataOnFooter="true"
                  >
            <sjg:gridColumn name="name" title="Name"  align="center"    width="400"     />
            <sjg:gridColumn name="id" formatter="integer" title="ID" key="true" align="center"/>
        </sjg:grid>
    </body>
</html>
