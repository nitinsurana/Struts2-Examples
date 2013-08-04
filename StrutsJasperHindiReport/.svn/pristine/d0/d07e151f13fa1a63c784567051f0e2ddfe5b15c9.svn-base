/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author XCoder
 */
public class NAction extends ActionSupport {

    private static JasperReport jasReport;
    private static JasperPrint jasPrint;
    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public static JasperPrint getJasPrint() {
        return jasPrint;
    }

    public static void setJasPrint(JasperPrint jasPrint) {
        NAction.jasPrint = jasPrint;
    }

    public static JasperReport getJasReport() {
        return jasReport;
    }

    public static void setJasReport(JasperReport jasReport) {
        NAction.jasReport = jasReport;
    }

    public String execute() throws FileNotFoundException, JRException, SQLException, ClassNotFoundException, IOException {
        String path = ServletActionContext.getServletContext().getRealPath("/");
        FileInputStream fis = new FileInputStream(new File(path + "newReport.jrxml"));
        jasReport = JasperCompileManager.compileReport(fis);

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgsitsdb", "root", "root");
        jasPrint = JasperFillManager.fillReport(jasReport, null, con);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        JasperExportManager.exportReportToPdfStream(jasPrint, baos);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        inputStream = bais;
        return SUCCESS;
    }
}
