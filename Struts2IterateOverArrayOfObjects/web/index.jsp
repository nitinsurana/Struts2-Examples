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
        <h1>Hello World</h1>
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

        <s:form action="saveaction" >
            <s:push value="lstString">
                <s:textfield />
            </s:push>
            <s:submit value="Click me to submit lstString"/>
        </s:form>

        <s:form action="saveaction" theme="css_xhtml">
            <s:select id="idgender" name="idgender" list="#{'01':'male' ,'02':'female'}" label="Select gender"/>

            <!s:textfield id="idgener" name="idgender" label="Gender "/>
        <!s:push  value="lstNBean"  >
        <s:iterator value="lstNBean" id="lstNBean" status="lstStatus">
            <!s:textfield id="twtFeedAccts[%{#twtAcct.index}].signature"
                name="twtFeedAccts[%{#twtAcct.index}].signature"
                value="%{twtFeedAccts[#twtAcct.index].signature}" size="40"/>
            <s:hidden id="lstNBean[%{#lstStatus.index}].idFeeHead" key="lstNBean[%{#lstStatus.index}].idFeeHead" value="%{idFeeHead}"/>
            <s:label  value="%{lstNBean[#lstStatus.index].feeHeadName}"/>
            <s:select id="lstNBean[%{#lstStatus.index}].strBasis" key="lstNBean[%{#lstStatus.index}].strBasis" list="#{'01':'housewife' ,'02':'business'}" label="Discount Basis"/>
            <s:textfield key="lstNBean[%{#lstStatus.index}].doubBasis" value="%{doubBasis}" label="Amount/Percent "/>
            <br><br>
        </s:iterator>
        <!/s:push>
        <s:submit value="Click me"/>
    </s:form>

    <s:iterator value="lstString">
        <s:property/>
    </s:iterator>
</body>
</html>
