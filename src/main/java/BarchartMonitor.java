import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class BarchartMonitor extends ApplicationFrame {

    public BarchartMonitor(String applicationTitle, String chartTitle, Double A, Double B, Double C, Double D) {
        super(applicationTitle);
        JFreeChart barchart = ChartFactory.createBarchart(
                chartTitle,
                "Category",
                "Score",
                createDataset(A, B, C, D),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barchart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    public BarchartMonitor(String title) {
        super(title);
    }

    private CategoryDataset createDataset(Double A, Double B, Double C, Double D) {
        final String RegionA = "A";
        final String RegionB = "B";
        final String RegionC = "C";
        final String RegionD = "D";
        final String simple = "Simple";
        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.addValue(A, RegionA, simple);

        dataset.addValue(B, RegionB, simple);

        dataset.addValue(C, RegionC, simple);

        dataset.addValue(D, RegionD, simple);

        return dataset;
    }

}