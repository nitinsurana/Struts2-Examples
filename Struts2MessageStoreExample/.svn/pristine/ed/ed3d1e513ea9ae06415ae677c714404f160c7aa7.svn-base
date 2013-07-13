<!DOCTYPE html PUBLIC 
    "-//W3C//DTD XHTML 1.1 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <title>Order <s:property value="idorder" /></title>
    </head>
    <body>
        <s:url id="saveurl" value="/order/save"/>
        <s:form method="post" action="%{saveurl}">
            <table>
                <s:hidden name="order.idorder"/>
                <s:textfield name="order.idorder" label="ID" disabled="true"/>
                <s:textfield name="order.clientName" label="Client"/>
                <s:textfield name="order.amount" label="Amount" />
                <tr>
                    <td colspan="2">
                        <s:submit />
                    </td>
            </table>
        </s:form>
        <a href="<%=request.getContextPath()%>/orders">Back to Orders</a>
    </body>
</html>
