<html>
    <head>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    </head>
    <body>
        <script>
            var data = '{"id":"1","name":"nitin"}';
            $.ajax({
                url: "http://localhost:8084/Struts2Junit4/save",
                data: data, //returns all cells' data
                dataType: 'json',
                contentType: 'application/json',
                type: 'POST',
                success: function(res) {
                    console.log(res);
                }
            });
        </script>
    </body>
</html>