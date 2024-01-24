import EmployeeMnagement.conn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeChart extends JFrame {

    private final conn databaseConnection;

    public EmployeeChart(String title) {
        super(title);
        databaseConnection = new conn();

        DefaultPieDataset dataset = createDataset();
        JFreeChart chart = ChartFactory.createPieChart(
                "Employee Distribution by Post",
                dataset,
                true,  // Include legend
                true,
                false  // Do not include tooltips
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
        setContentPane(chartPanel);
    }

    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        try {
            String query = "SELECT post, COUNT(*) as Count FROM employee GROUP BY post";
            ResultSet resultSet = databaseConnection.s.executeQuery(query);

            while (resultSet.next()) {
                String post = resultSet.getString("post");
                int count = resultSet.getInt("Count");
                dataset.setValue(post, count);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmployeeChart example = new EmployeeChart("Employee Chart");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
