import EmployeeMnagement.conn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalaryChart extends JFrame {

    private final conn databaseConnection;

    public SalaryChart(String title) {
        super(title);
        databaseConnection = new conn();

        DefaultCategoryDataset dataset = createDataset();

        // Check if the dataset is not empty
        if (!dataset.getColumnKeys().isEmpty()) {
            JFreeChart chart = ChartFactory.createBarChart(
                    "Salary Distribution By Number",
                    "Salary",
                    "Frequency",
                    dataset
            );

            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
            setContentPane(chartPanel);
        } else {
            // Handle the case where there are no salary values
            JOptionPane.showMessageDialog(this, "No salary values found.", "Empty Dataset", JOptionPane.WARNING_MESSAGE);
            dispose(); // Close the chart window
        }
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            String query = "SELECT basic_salary FROM salary";
            ResultSet resultSet = databaseConnection.s.executeQuery(query);

            // Populate the dataset
            while (resultSet.next()) {
                double basicSalary = resultSet.getDouble("basic_salary");
                dataset.addValue(1, "Salary Distribution", String.valueOf(basicSalary)); // Each salary is counted once
            }

            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SalaryChart example = new SalaryChart("Salary Chart");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
