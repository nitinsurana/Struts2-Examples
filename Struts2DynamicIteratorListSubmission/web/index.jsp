<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            count=<s:property value="mylist.size()"/>
            function addonemore(){
//                alert('one more plz');
                document.getElementById('ndiv').innerHTML+="<tr> "
                    +" <td class=\"tdLabel\"><label for=\"saveaction_mylist_0__name\" class=\"label\">name:</label></td> "
                    +" <td"
                    +" ><input type=\"text\" name=\"mylist["+count+"].name\" value=\"a\" id=\"saveaction_mylist_0__name\"/></td> "
                    +" </tr> ";
                count++;
//                alert('m done adding');
            }
        </script>
    </head>
    <body>
        <s:a href="naction.action">Populate form</s:a>
        <input type="button" onclick="addonemore()" value="More Items"/>
        <s:actionerror/>
        <s:actionmessage/>
        <h1>Hello World!</h1>

        <s:form action="saveaction" method="post">
            <div id="ndiv">
                <s:iterator id="mylist" value="mylist" status="varstatus">
                    <s:textfield label="name" key="mylist[%{#varstatus.index}].name"/>
                </s:iterator>
            </div>
            <s:submit/>
        </s:form>
    </body>
</html>
