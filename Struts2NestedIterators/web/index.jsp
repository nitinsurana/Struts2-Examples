<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="saveaction" >
            <s:iterator value="lstBean" id="lstBean" status="outerStat">
                <s:textfield value="%{name}" name="lstBean[%{#outerStat.index}].name"/>
                <s:textfield value="%{amt}" name="lstBean[%{#outerStat.index}].amt"/>
                <s:textfield value="%{id}" name="lstBean[%{#outerStat.index}].id"/>
                <s:iterator value="%{lstString}" status="myStat">
                    <s:textfield name="lstBean[%{#outerStat.index}].lstString[%{#myStat.index}]"/>
                </s:iterator> 
            </s:iterator>
            <s:submit value="Click me to submit lstBean"/>
        </s:form>
    </body>
    <!--        <h1>Hello World</h1>
    <s:form action="saveaction" >
        <s:push value="nbean">
            <s:textfield id="nbean.Inst1" label="Inst1" key="nbean.Inst1"/>
            <s:textfield id="nbean.Inst2" label="Inst2" key="nbean.Inst2"/>
            <s:textfield id="nbean.Inst3" label="Inst3" key="nbean.Inst3"/>
            <s:textfield id="nbean.Inst4" label="Inst4" key="nbean.Inst4"/>
            <s:textfield id="nbean.Inst5" label="Inst5" key="nbean.Inst5"/>
        </s:push>
        <s:submit value="Click me to submit nbean"/>
    </s:form>

    <s:iterator value="lstString">
        <s:property/>
    </s:iterator>
</body>-->
</html>
