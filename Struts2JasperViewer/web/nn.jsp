<%-- 
    Document   : nn
    Created on : 28 Jun, 2011, 5:02:33 PM
    Author     : Harsh
--%>

<%@page import="net.sf.jasperreports.engine.export.JRHtmlExporterParameter"%>
<%@page import="net.sf.jasperreports.engine.JRExporterParameter"%>
<%@page import="net.sf.jasperreports.engine.export.JRHtmlExporter"%>
<%@page import="net.sf.jasperreports.engine.JasperFillManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="actions.ConFactory"%>
<%@page import="net.sf.jasperreports.engine.type.WhenNoDataTypeEnum"%>
<%@page import="net.sf.jasperreports.engine.JasperPrint"%>
<%@page import="net.sf.jasperreports.engine.JasperReport"%>
<%@page import="net.sf.jasperreports.engine.JasperCompileManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
                    JasperReport jasReport = JasperCompileManager.compileReport("d:/report1.jrxml");
                    jasReport.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    Connection con = ConFactory.getConnection();
                    System.out.println(con);

                    //filling the report with data from dataSource
                    JasperPrint jasPrint = JasperFillManager.fillReport(jasReport, null, con);
                    JRHtmlExporter exporter = new JRHtmlExporter();

                    int pageIndex = 0;
                    int lastPageIndex = 0;
                    if (jasPrint.getPages() != null) {
                        lastPageIndex = jasPrint.getPages().size() - 1;
                    }

                    StringBuffer sbuffer = new StringBuffer();

                    exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasPrint);
                    exporter.setParameter(JRExporterParameter.OUTPUT_STRING_BUFFER, sbuffer);
//	exporter.setParameter(JRHtmlExporterParameter.IMAGES_URI, "../servlets/image?image=");
                    exporter.setParameter(JRExporterParameter.PAGE_INDEX, Integer.valueOf(pageIndex));
                    exporter.setParameter(JRHtmlExporterParameter.HTML_HEADER, "");
                    exporter.setParameter(JRHtmlExporterParameter.BETWEEN_PAGES_HTML, "");
                    exporter.setParameter(JRHtmlExporterParameter.HTML_FOOTER, "");

                    exporter.exportReport();
        %>
    </body>
</html>
