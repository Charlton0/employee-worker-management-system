import EmployeeMnagement.conn;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SecurityQuestionChart extends JFrame {

    private final conn databaseConnection;

    public SecurityQuestionChart(String title) {
        super(title);
        databaseConnection = new conn();

        DefaultCategoryDataset dataset = createDataset();
        JFreeChart chart = ChartFactory.createBarChart(
                "Security Question Distribution",
                "Security Question",
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
            String query = "SELECT sec_q, COUNT(*) as Count FROM account GROUP BY sec_q";
            ResultSet resultSet = databaseConnection.s.executeQuery(query);

            while (resultSet.next()) {
                String secQuestion = resultSet.getString("sec_q");
                int count = resultSet.getInt("Count");
                dataset.addValue(count, "Security Question Count", secQuestion);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SecurityQuestionChart example = new SecurityQuestionChart("Security Question Chart");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
