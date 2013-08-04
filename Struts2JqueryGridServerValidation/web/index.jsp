<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="start"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function isError(text){
                if(text.indexOf('errorhere')>=0){
                    return [false,text];
                }
                return [true,''];
            }
        </script>
    </head>
    <body>
        NOTE : Validation Check - Duplicate username not allowed.
        <br/>
        Try adding a new user with same username.
        <br/><br/>
        <s:url id="remoteurl" action="gridaction"/>
        <s:url id="editurl" action="editaction"/>

        <sjg:grid id="sjgrid"
                  dataType="json" gridModel="gridModel" href="%{remoteurl}"
                  pager="true" navigator="true" editurl="%{editurl}"
                  navigatorAdd="true" navigatorDelete="false" navigatorEdit="false" navigatorSearch="false"
                  navigatorAddOptions="{
                  reloadAfterSubmit:true,
                  afterSubmit:function(response,postdata){
                  return isError(response.responseText);
                  }
                  }"
                  >
            <sjg:gridColumn name="iduser" title="iduser" key="true" hidden="true"/>
            <sjg:gridColumn name="uname" title="Username" editable="true" align="center"/>
            <sjg:gridColumn name="passwd" title="Password" editable="true" align="center"/>
        </sjg:grid>
    </body>
</html>
