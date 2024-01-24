package EmployeeMnagement;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenderChartGUI extends JFrame {

    private final conn databaseConnection;

    public GenderChartGUI(String title) {
        super(title);
        databaseConnection = new conn();

        DefaultPieDataset dataset = createDataset();
        JFreeChart chart = ChartFactory.createPieChart(
                "Gender Distribution",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
        setContentPane(chartPanel);
    }

    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        try {
            String query = "SELECT Gender, COUNT(*) as Count FROM employee GROUP BY Gender";
            ResultSet resultSet = databaseConnection.s.executeQuery(query);

            while (resultSet.next()) {
                String gender = resultSet.getString("Gender");
                int count = resultSet.getInt("Count");
                dataset.setValue(gender, count);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GenderChartGUI example = new GenderChartGUI("Gender Chart Example");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
