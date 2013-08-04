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
        <s:head/>
        <script type="text/javascript">
            $.subscribe('ajaxcompletedialog',function(event,data){
                alert('Form Successfully Submitted');
                $("#favdialog").dialog('close');
            });
            $.subscribe('ajaxerrordialog',function(event,data){
                $("#favdialog").dialog('close');
//                alert('Some Error in form submission');
//                $("#errormsg").innerHTML="Error in form submission";
                document.getElementById('errormsg').innerHTML="Error Here";
                $("#favdialog").dialog('open');
            });

            $.subscribe('ajaxcomplete',function(event,data){
                alert('Form Successfully Submitted');
            });
            $.subscribe('ajaxerror',function(event,data){
                alert('Some Error in form submission');
            });
            $.subscribe('opendialog',function(event,data){
                $("#favdialog").dialog('open');
            });
        </script>
    </head>
    <body>
        <s:a href="advanced.jsp">Advanced AJAX with dialog</s:a>
        <h1>Hello World!</h1>

        <sj:a onClickTopics="opendialog" id="adsf">Add Favourites</sj:a>
        <br/><br/>

        <sj:dialog autoOpen="false" closeOnEscape="true"
                   id="favdialog">
            <p id="errormsg" style="color: red"></p>
            <s:form action="ajaxformsubmit" method="post" id="idformdialog">
                <s:textfield name="name" label="Name"/>
                <sj:submit onSuccessTopics="ajaxcompletedialog" value="Form Submit" targets="one" onErrorTopics="ajaxerrordialog"/>
            </s:form>
        </sj:dialog>

        <s:form action="ajaxformsubmit" method="post" id="formid">
            <s:textfield name="name" label="Name"/>
            <sj:submit onSuccessTopics="ajaxcomplete" value="Inside Form Submit" targets="one" onErrorTopics="ajaxerror"/>
        </s:form>
        <div id="one"></div>
        <sj:submit onSuccessTopics="ajaxcomplete" formIds="formid" value="Outside Form Submit" targets="one" onErrorTopics="ajaxerror"/>
    </body>
</html>
