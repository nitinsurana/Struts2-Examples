<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <s:head/>
        <sj:head jquerytheme="start" jqueryui="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            $.subscribe('subform', function(event,data) {
                if(document.getElementById("name").value==null ||  document.getElementById("name").value=="")
                {
                    alert('m in');
                    event.originalEvent.options.submit = false;
                }
                else{
                    alert('m submitting');
                }
            });
        </script>
    </head>
    <body>
        <s:form action="naction" id="nform" name="nform">
            <s:textfield name="name" id="name" label="Enter ur name"/>
            <sj:submit onBeforeTopics="subform" button="true" targets="ndiv"/>
        </s:form>


        <br/>External Submit i.e. submit button out of form<br/>
        <sj:submit onBeforeTopics="subform" button="true" formIds="nform" targets="ndiv"/>

        <div id="ndiv"></div>
    </body>
</html>
