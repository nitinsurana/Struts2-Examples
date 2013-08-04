<%-- 
    Document   : customer
    Created on : Apr 2, 2013, 4:59:10 PM
    Author     : Nitin
--%>

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
        <s:form action="addCustomerAction" >
            <s:textfield name="name" label="Name" value="" />
            <s:textarea name="address" label="Address" value="" cols="50" rows="5" />
            <s:submit />
        </s:form>

        <h2>All Customers</h2>

        <s:if test="customerList!=null && customerList.size()> 0">
            <table border="1px" cellpadding="8px">
                <tr>
                    <th>Customer Id</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Created Date</th>
                </tr>
                <s:iterator value="customerList" status="userStatus">
                    <tr>
                        <td><s:property value="idcustomer" /></td>
                        <td><s:property value="name" /></td>
                        <td><s:property value="address" /></td>
                        <td><s:date name="createdDate" format="dd/MM/yyyy" /></td>
                    </tr>
                </s:iterator>
            </table>
        </s:if>
        <br/>
        <br/>
    </body>
</html>
