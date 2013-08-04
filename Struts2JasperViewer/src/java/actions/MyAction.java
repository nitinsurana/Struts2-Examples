package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporterParameter;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Harsh
 */
public class MyAction extends ActionSupport {

    static JasperReport jasReport; //holds compiled jrxml file
    static JasperPrint jasPrint;   //contains report after result filling process

    @Override
    public String execute() {
        return SUCCESS;
    }

    public static void main(String[] args) throws JRException {
        jasReport = JasperCompileManager.compileReport("d:/report1.jrxml");
        jasReport.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        Connection con = ConFactory.getConnection();
        System.out.println(con);

        //filling the report with data from dataSource
        jasPrint = JasperFillManager.fillReport(jasReport, null, con);
        JRHtmlExporter exporter = new JRHtmlExporter();

	int pageIndex = 0;
	int lastPageIndex = 0;
	if (jasPrint.getPages() != null)
	{
		lastPageIndex = jasPrint.getPages().size() - 1;
	}

	StringBuffer sbuffer = new StringBuffer();

	exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasPrint);
	exporter.setParameter(JRExporterParameter.OUTPUT_STRING_BUFFER, sbuffer);
//	exporter.setParameter(JRHtmlExporterParameter.IMAGES_URI, "../servlets/image?image=");
//	exporter.setParameter(JRExporterParameter.PAGE_INDEX, Integer.valueOf(pageIndex));
	exporter.setParameter(JRHtmlExporterParameter.HTML_HEADER, "");
	exporter.setParameter(JRHtmlExporterParameter.BETWEEN_PAGES_HTML, "");
	exporter.setParameter(JRHtmlExporterParameter.HTML_FOOTER, "");

	exporter.exportReport();

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//
////        JasperExportManager.exportReportToPdfFile(jasPrint, "f:/nn.pdf");
//        JasperExportManager.exportReportToPdfStream(jasPrint, baos);
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        inputStream = bais;
    }
}
