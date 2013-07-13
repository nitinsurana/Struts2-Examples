<%-- 
    Document   : xz
    Created on : Apr 7, 2013, 2:45:06 AM
    Author     : Nitin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<h1>Errors & Messages</h1>
<s:actionmessage/>
<s:actionerror/>
<s:property value="exception"/>
<s:property value="exceptionStack"/>
