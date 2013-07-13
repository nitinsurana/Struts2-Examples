
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <sj:head jquerytheme="start" jqueryui="true"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            $.subscribe('clean',function(event,data){
                //                alert('on clean');
                document.getElementById("msgword").value="";
                document.getElementById("msgexcel").value="";
                document.getElementById("msgpowerpoint").value="";
            });
        </script>
    </head>
    <body>
        <div align="center">
            <s:url id="updatePic" action="updatepic"/>
            <img src="images/indicator.gif" id="indicator" style="display: none"/>

            <sj:tabbedpanel id="tabid">
                <sj:tab id="tone" target="tab1" label="Word"/>
                <div id="tab1">
                    <sj:textarea id="mydivWord"  readonly="true" rows="20" cols="60" indicator="indicator" cssStyle="border-width: thick;"></sj:textarea>
                    <sj:div reloadTopics="reloadWordPic" href="%{updatePic}" deferredLoading="false" cssStyle="float:right;" indicator="indicator">
                    </sj:div>
                    <br/>
                    <s:form action="sendmessageword"  theme="css_xhtml" focusElement="msg">
                        <s:textfield name="msg" label="Query" rows="5" cols="20" id="msgword" labelposition="left"/>
                        <br/>
                        <sj:submit targets="mydivWord" button="true" onCompleteTopics="reloadWordPic,clean" indicator="indicator"/>
                    </s:form>
                </div>


                <sj:tab id="tone" target="tab2" label="Excel"/>
                <div id="tab2">
                    <sj:textarea id="mydivExcel"  readonly="true" rows="20" cols="60" indicator="indicator"  cssStyle="border-width: thick;"></sj:textarea>
                    <sj:div reloadTopics="reloadExcelPic" href="%{updatePic}" deferredLoading="false" cssStyle="float:right;" indicator="indicator">
                    </sj:div>
                    <br/>
                    <s:form action="sendmessageexcel"  theme="css_xhtml" focusElement="msg">
                        <s:textfield name="msg" label="Query" rows="5" cols="20" id="msgexcel" labelposition="left"/>
                        <br/>
                        <sj:submit targets="mydivExcel" button="true" onCompleteTopics="reloadExcelPic,clean" indicator="indicator"/>
                    </s:form>
                </div>
                    

                <sj:tab id="tone" target="tab3" label="Powerpoint"/>
                <div id="tab3">
                    <sj:textarea id="mydivPowerpoint"  readonly="true" rows="20" cols="60" indicator="indicator" cssStyle="border-width: thick;"></sj:textarea>
                    <sj:div reloadTopics="reloadPowerpointPic" href="%{updatePic}" deferredLoading="false" cssStyle="float:right;" indicator="indicator">
                    </sj:div>
                    <br/>
                    <s:form action="sendmessagepowerpoint"  theme="css_xhtml" focusElement="msg">
                        <s:textfield name="msg" label="Query" rows="5" cols="20" id="msgpowerpoint" labelposition="left"/>
                        <br/>
                        <sj:submit targets="mydivPowerpoint" button="true" onCompleteTopics="reloadPowerpointPic,clean" indicator="indicator"/>
                    </s:form>
                </div>
            </sj:tabbedpanel>


        </div>
    </body>
</html>
