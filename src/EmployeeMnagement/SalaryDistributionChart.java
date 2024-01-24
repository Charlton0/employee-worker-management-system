import EmployeeMnagement.conn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalaryDistributionChart extends JFrame {

    private final conn databaseConnection;

    public SalaryDistributionChart(String title) {
        super(title);
        databaseConnection = new conn();

        DefaultPieDataset dataset = createDataset();

        // Check if the dataset is not empty
        if (!dataset.getKeys().isEmpty()) {
            JFreeChart chart = createChart(dataset);

            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
            setContentPane(chartPanel);
        } else {
            // Handle the case where there are no salary values
            JOptionPane.showMessageDialog(this, "No salary values found.", "Empty Dataset", JOptionPane.WARNING_MESSAGE);
            dispose(); // Close the chart window
        }
    }

    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        try {
            String query = "SELECT basic_salary FROM salary";
            ResultSet resultSet = databaseConnection.s.executeQuery(query);

            // Populate the dataset
            while (resultSet.next()) {
                double basicSalary = resultSet.getDouble("basic_salary");
                dataset.setValue(String.valueOf(basicSalary), basicSalary);
            }

            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    private JFreeChart createChart(DefaultPieDataset dataset) {
        JFreeChart chart = ChartFactory.createRingChart(
                "Salary Distribution",
                dataset,
                true,
                true,
                false
        );

        RingPlot plot = (RingPlot) chart.getPlot();
        plot.setSectionDepth(0.20); // Adjust the depth of the sections

        return chart;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SalaryDistributionChart example = new SalaryDistributionChart("Salary Distribution Chart");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
