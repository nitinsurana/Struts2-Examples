<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>

<head>
    <!sj:head jqueryui="true"/>
<script type="text/javascript">
    $.subscribe('ajaxerrordialog',function(event,data){
        document.getElementById('errormsg').innerHTML="Error Here";
    });
    $.subscribe('ajaxcompletedialog',function(event,data){
        alert('Form Successfully Submitted');        
        $("#favdialog").dialog('close');
    });
</script>
</head>

<s:form action="ajaxformsubmit" method="post" id="idformdialog">
    <p id="errormsg" style="color: red"></p>
    <s:textfield name="name" label="Name"/>
    <sj:submit onSuccessTopics="ajaxcompletedialog" value="Form Submit" targets="one" onErrorTopics="ajaxerrordialog"/>
    <div id="one"></div>
</s:form>