import EmployeeMnagement.conn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AttendanceChart extends JFrame {

    private final conn databaseConnection;

    public AttendanceChart(String title) {
        super(title);
        databaseConnection = new conn();

        DefaultCategoryDataset dataset = createDataset();
        JFreeChart chart = ChartFactory.createLineChart(
                "Attendance Distribution First Half",
                "Attendance Status",
                "Count",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));
        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            String query = "SELECT first, COUNT(*) as Count FROM attendance GROUP BY first";
            ResultSet resultSet = databaseConnection.s.executeQuery(query);

            while (resultSet.next()) {
                String attendanceStatus = resultSet.getString("first");
                int count = resultSet.getInt("Count");
                dataset.addValue(count, "Attendance Count", attendanceStatus);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AttendanceChart example = new AttendanceChart("Attendance Chart");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
