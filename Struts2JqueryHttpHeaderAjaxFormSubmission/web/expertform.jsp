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
//        alert('status: ' + event.originalEvent.status + '\n\nresponseText: \n' + event.originalEvent.request.responseText);
//        alert(event.originalEvent.request.status+"  "+event.originalEvent.statusText);
//        alert(event.originalEvent.request.getResponseHeader('param'));
        document.getElementById('ulhere').innerHTML+=('<li>'+event.originalEvent.request.responseText+'</li>');
        $("#favdialog").dialog('close');
    });
</script>
</head>

<s:form action="expertajaxformsubmit" method="post" id="idformdialog">
    <p id="errormsg" style="color: red"></p>
    <s:textfield name="name" label="Name"/>
    <sj:submit onSuccessTopics="ajaxcompletedialog" value="Form Submit" targets="one" onErrorTopics="ajaxerrordialog"/>
    <div id="one"></div>
</s:form>