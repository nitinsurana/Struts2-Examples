
import com.opensymphony.xwork2.ActionSupport;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nitin
 */
public class MyAction extends ActionSupport {

    private JFreeChart chart;

    public String execute() throws Exception {
        System.out.println("Chart Creation");
        
        // chart creation logic...
//        XYSeries dataSeries = new XYSeries(new Integer(1)); // pass a key for this serie
//        for (int i = 0; i <= 100; i++) {
//            dataSeries.add(i, i * 1.05);
//        }
//        XYSeriesCollection xyDataset = new XYSeriesCollection(dataSeries);
//
//        ValueAxis xAxis = new NumberAxis("Raw Marks");
//        ValueAxis yAxis = new NumberAxis("Moderated Marks");
//
//        // set my chart variable
//        chart =
//                new JFreeChart("Moderation Function", JFreeChart.DEFAULT_TITLE_FONT,
//                new XYPlot(xyDataset, xAxis, yAxis, new StandardXYItemRenderer(StandardXYItemRenderer.LINES)),
//                false);
//        chart.setBackgroundPaint(java.awt.Color.white);

        //Pie Chart Example
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("JavaWorld", new Integer(75));
        pieDataset.setValue("Other", new Integer(25));

        chart = ChartFactory.createPieChart("Sample Pie Chart", pieDataset, true, true, true);
        return SUCCESS;
    }

    // this method will get called if we specify <param name="value">chart</param>
    public JFreeChart getChart() {
        return chart;
    }
}
