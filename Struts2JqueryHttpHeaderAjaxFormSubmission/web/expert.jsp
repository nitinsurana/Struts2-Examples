<%--
    Document   : advanced
    Created on : 24 Jun, 2011, 12:37:34 PM
    Author     : Harsh
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
        <script type="text/javascript">
            //            $.subscribe('opendialog',function(event,data){
            $(document).ready(function(){
                $("a.clickable").click(function(event){
                    document.myform.name.value=$(this).attr('title');


                    //                    alert($(this).text());
                    //                    alert($(this).attr('id'));
                    //                    alert($(this).attr('title'));
                    $("#favdialog").dialog('open');
                });
            });
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <sj:a  id="xxid" onClickTopics="" cssClass="clickable" href="#" value="x" title="title">Add Favourites</sj:a>

        <s:form id="myform" method="post" name="myform">
            <s:textfield name="name" value="nitasd" id="name"/>
        </s:form>

        <s:url id="getform" action="getexpertajaxformaction"/>
        <sj:dialog autoOpen="false" closeOnEscape="true" loadingText="Loading..."
                   id="favdialog" href="%{getform}" formIds="myform" targets="divOne">
            <div id="divOne"></div>
        </sj:dialog>

        <ul id="ulhere">
            <li>hey m an li</li>
        </ul>
    </body>
</html>
