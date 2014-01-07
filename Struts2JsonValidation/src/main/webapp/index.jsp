<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <script>
            var obj = {name: 'nitin', age: ""};
            var json = JSON.stringify(obj);
            console.log(json);
            $.ajax({
                type: "POST",
                dataType: "json",
                contentType: "application/json",
                url: "post-json?struts.enableJSONValidation=true",
//                data: "{\"user\":"+JSON.stringify(obj)+",\"struts\":{\"enableJSONValidation\":true}}",
                data: "{\"user\":" + JSON.stringify(obj) + "}",
                success: function(resp) {
                    console.log(resp);
                }
            });
        </script>
    </body>
</html>
