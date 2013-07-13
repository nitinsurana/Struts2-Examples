
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <!sj:head jqueryui="true"/>
    <script type="text/javascript" src="ckeditor/ckeditor.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <script type="text/javascript" src="scripts/shCore.js"></script>
    <script type="text/javascript" src="scripts/shBrushJava.js"></script>
    <script type="text/javascript" src="scripts/shBrushSql.js"></script>
    <link type="text/css" rel="stylesheet" href="styles/shCoreDefault.css"/>
    <script type="text/javascript">SyntaxHighlighter.all();</script>
    <style type="text/css">
        body{ font: 82.5% "Trebuchet MS", sans-serif; margin: 50px;}
    </style>
</head>
<body>
    <div style="width: 80%;padding-left: 10%" align="center">
        <h1>Hello World!</h1>

        <s:property value="echo" escape="false" escapeJavaScript="false"/>

        <s:form action="saveform" method="post">
            <textarea id="echo" name="echo" rows="5" cols="20"></textarea>
            <script type="text/javascript">
                CKEDITOR.replace( 'echo');

                //                CKEDITOR.replace( 'editor1',
                //                {
                //                    toolbar : 'Basic',
                //                    uiColor : '#9AB8F3'
                //                });

            </script>
            <s:submit/>
        </s:form>
    </div>
</body>
</html>
