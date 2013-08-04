
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.util.Map;
import org.apache.struts2.ServletActionContext;
import org.hibernate.cfg.Settings;
import org.hibernate.impl.SessionFactoryImpl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nitin
 */
public class JasperAction extends ActionSupport {

    private Connection connection;

    @Override
    public String execute() {
        Settings settings = ((SessionFactoryImpl) HibernateUtil.getSessionFactory()).getSettings();
        try {
            connection = settings.getConnectionProvider().getConnection();
        } catch (Exception ex) {
        }

        String reportFile = ServletActionContext.getServletContext().getRealPath("/reports/report1.jasper");

        ReportHelper.runReport("dbpaathshala", "root", "root", reportFile);


        ReportHelper.generateReport(connection, getReportParams(), "/reports/report1.jasper");
        return SUCCESS;
    }
    Map reportParams;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Map getReportParams() {
        return reportParams;
    }

    public void setReportParams(Map reportParams) {
        this.reportParams = reportParams;
    }
}
