<!DOCTYPE html PUBLIC 
    "-//W3C//DTD XHTML 1.1 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <body>
        <s:actionmessage />
        <s:actionerror />
        <table>
            <tr>
                <th>ID</th>
                <th>Client</th>
                <th>Amount</th>
                <th>Actions</th>
            </tr>
            <s:iterator value="lst">
                <tr>
                    <td>${id}</td>
                    <td><s:property value="clientName"/></td>
                    <td>${amount}</td>
                    <td>
<!--                        <a href="orders/${idorder}">View</a> |-->
                        <a href="order/${idorder}/edit">Edit</a> |
                        <a href="order/${idorder}/del">Delete</a>
                    </td>
                </tr>
            </s:iterator>
        </table>
        <a href="order/new">Create a new order</a>
    </body>
</html>
