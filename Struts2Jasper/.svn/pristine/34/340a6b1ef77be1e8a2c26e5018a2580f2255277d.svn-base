/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author ICT
 */
public class ReportHelper {

    public static Connection connectDB(String databaseName, String userName, String password) {
        Connection jdbcConnection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            jdbcConnection = DriverManager.getConnection(databaseName, userName, password);
        } catch (Exception ex) {
            String connectMsg = "Could not connect to the database: " + ex.getMessage() + " " + ex.getLocalizedMessage();
            System.out.println(connectMsg);
        }
        return jdbcConnection;
    }

    public static void runReport(String databaseName, String userName, String password, String reportFile) {
        File f=new File(reportFile);
        System.out.println("Run Report file exists : "+f.exists());
        try {
            JasperDesign jasperDesign = JRXmlLoader.load(reportFile);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            Connection jdbcConnection = connectDB(databaseName, userName, password);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jdbcConnection);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception ex) {
            String connectMsg = "Could not create the report " + ex.getMessage() + " " + ex.getLocalizedMessage();
            System.out.println(connectMsg);
        }
    }

    public static void runReport(String databaseName, String userName, String password, String reportFile, Map args) {
        
        try {
            JasperDesign jasperDesign = JRXmlLoader.load(reportFile);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            Connection jdbcConnection = connectDB(databaseName, userName, password);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, args, jdbcConnection);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception ex) {
            String connectMsg = "Could not create the report " + ex.getMessage() + " " + ex.getLocalizedMessage();
            System.out.println(connectMsg);
        }
    }

    public static void generateReport(Connection connection, Map parameters, String file) {
        HttpServletResponse response = ServletActionContext.getResponse();
        ServletOutputStream servletOutputStream = null;
        try {
            servletOutputStream = response.getOutputStream();
        } catch (Exception ex) {
        }

        String reportFile = ServletActionContext.getServletContext().getRealPath(file);
        System.out.println("reportFile : " + reportFile);
//        String reportFile = "/C:/Program Files (x86)/Parallels/Plesk/Additional/Tomcat/work/PSA/ictsoft.in/Arogya/WEB-INF/classes" + file;

        JasperPrint jasperPrint;
        File f = new File(reportFile);
        System.out.println("File exists : " + f.exists());

        try {

            //File reportFile = new File("/home/ict/NetBeansProjects/Development2011/Jan/Arogya_1/web/reports/memberreport.jasper");

            jasperPrint = JasperFillManager.fillReport(reportFile, parameters, connection);

            JasperExportManager.exportReportToPdfFile(jasperPrint, "destfile.pdf");
            response.setContentType("application/pdf");
            JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);

            servletOutputStream.flush();
            //servletOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//close the connection.
        }
    }
}
