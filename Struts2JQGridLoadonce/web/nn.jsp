
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="start"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sj:accordion id="acc" autoHeight="false"  collapsible="true">
            <sj:accordionItem id="accitem1" label="Hey u" title="iti">
                m heree
            </sj:accordionItem>
        </sj:accordion>
        <select name="theme" id="selected_theme" onchange="changeTheme(this.value);">
            <option value=""></option>

            <option value="hot-sneaks">The hot-sneaks Theme</option>
            <option value="redmond">The redmond Theme</option>
            <option value="humanity">The humanity Theme</option>
            <option value="swanky-purse">The swanky-purse Theme</option>
            <option value="blitzer">The blitzer Theme</option>
            <option value="eggplant">The eggplant Theme</option>

            <option value="smoothness">The smoothness Theme</option>
            <option value="excite-bike">The excite-bike Theme</option>
            <option value="pepper-grinder">The pepper-grinder Theme</option>
            <option value="sunny">The sunny Theme</option>
            <option value="ui-lightness">The lightness Theme</option>
            <option value="cupertino">The cupertino Theme</option>

            <option value="flick">The flick Theme</option>
            <option value="mint-choc">The mint-choc Theme</option>
            <option value="trontastic">The trontastic Theme</option>
            <option value="showcase" selected="selected">The custom Showcase Theme</option>
            <option value="overcast">The overcast Theme</option>
            <option value="dark-hive">The dark-hive Theme</option>

            <option value="vader">The vader Theme</option>
            <option value="black-tie">The black-tie Theme</option>
            <option value="start">The start Theme</option>
            <option value="south-street">The south-street Theme</option>
            <option value="dot-luv">The dot-luv Theme</option>
            <option value="le-frog">The le-frog Theme</option>

            <option value="ui-darkness">The darkness Theme</option>


        </select>
    </body>
</html>
