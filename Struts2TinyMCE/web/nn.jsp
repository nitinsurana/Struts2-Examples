
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <sj:head/>
    <title>Full featured example using jQuery plugin</title>

    <!-- Load jQuery -->
    <!--        <script type="text/javascript" src="http://www.google.com/jsapi"></script>
            <script type="text/javascript">
                google.load("jquery", "1");
            </script>-->

    <!-- Load TinyMCE -->
    <script type="text/javascript" src="jscripts/tiny_mce/jquery.tinymce.js"></script>
    <script type="text/javascript">
        $().ready(function() {
            $('textarea.tinymce').tinymce({
                // Location of TinyMCE script
                script_url : 'jscripts/tiny_mce/tiny_mce.js',

                // General options
                theme : "advanced",
                plugins : "autolink,lists,pagebreak,style,layer,save,advhr,advimage,advlink,emotions,iespell,inlinepopups,insertdatetime,preview,media,searchreplace,print,contextmenu,paste,directionality,fullscreen,noneditable,visualchars,nonbreaking,xhtmlxtras,template,advlist",

                // Theme options
                theme_advanced_buttons1 : "bold,italic,underline,strikethrough,|,justifyleft,justifycenter,justifyright,justifyfull,styleselect,formatselect,fontselect,fontsizeselect",
                theme_advanced_buttons2 : "cut,copy,paste,pastetext,pasteword,|,search,replace,|,bullist,numlist,|,outdent,indent,blockquote,|,undo,redo,|,link,unlink,help,code,|,insertdate,inserttime,preview,|,forecolor,backcolor",
                theme_advanced_toolbar_location : "top",
                theme_advanced_toolbar_align : "left",
                theme_advanced_statusbar_location : "bottom",
                theme_advanced_resizing : true,

                // Example content CSS (should be your site CSS)
                content_css : "css/content.css",

                // Drop lists for link/image/media/template dialogs
                template_external_list_url : "lists/template_list.js",
                external_link_list_url : "lists/link_list.js",
                external_image_list_url : "lists/image_list.js",
                media_external_list_url : "lists/media_list.js",

                // Replace values for the template plugin
                template_replace_values : {
                    username : "Some User",
                    staffid : "991234"
                }
            });
        });
    </script>
    <!-- /TinyMCE -->
</head>
<body>
    <h1>Hello World!</h1>
    <s:property value="elm1" escape="false" />
    <s:textarea id="nn" name="nn" rows="15" cols="80" style="width: 80%" cssClass="tinymce"/>
</body>
</html>
