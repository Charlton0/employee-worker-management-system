import EmployeeMnagement.conn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgesChart extends JFrame {

    private final conn databaseConnection;

    public AgesChart(String title) {
        super(title);
        databaseConnection = new conn();

        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            String query = "SELECT age, COUNT(*) as Count FROM employee GROUP BY age";
            ResultSet resultSet = databaseConnection.s.executeQuery(query);

            while (resultSet.next()) {
                int age = resultSet.getInt("age");
                int count = resultSet.getInt("Count");
                dataset.addValue(count, "Employee Count", String.valueOf(age));
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Age Distribution",
                "Age",
                "Employee Count",
                dataset
        );

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        BarRenderer renderer = new BarRenderer();

        // Customize colors
        renderer.setSeriesPaint(0, new Color(79, 129, 189)); // Bar color
        plot.setBackgroundPaint(new Color(240, 240, 240));   // Background color

        plot.setRenderer(renderer);

        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setTickUnit(new NumberTickUnit(1)); // Adjust the tick unit as needed

        return chart;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AgesChart example = new AgesChart("Age Distribution Chart");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
