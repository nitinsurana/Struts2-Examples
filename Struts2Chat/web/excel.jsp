<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:iterator value="%{#session['messagesExcel']}">
<s:property value="%{#session['user']}"/>: <s:property value="you"/>
Bot: <s:property value="bot"/>
</s:iterator>