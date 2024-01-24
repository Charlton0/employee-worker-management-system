// Import necessary Java libraries
package EmployeeMnagement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// Define a class named Attendanceview that extends JFrame and implements ActionListener
public class Attendanceview extends JFrame implements ActionListener {
    // Declare instance variables
    JTable j1; // JTable for displaying attendance data
    JButton b1; // JButton for printing the table
    String[] h = new String[]{"Emp id", "First Half", "Second Half", "Date Time"}; // Column headers
    String[][] d = new String[500][4]; // Data array to store attendance information
    int i = 0; // Row index for data array
    int j = 0; // Column index for data array

    // Constructor for the Attendanceview class
    Attendanceview() {
        super("View Employees Attendance"); // Set the title of the JFrame
        this.setSize(800, 300); // Set the size of the JFrame
        this.setLocation(450, 150); // Set the location of the JFrame on the screen

        try {
            String q = "select * from attendance"; // SQL query to select all data from the 'attendance' table
            conn c1 = new conn(); // Create a connection object

            // Execute the query and iterate through the result set
            for (ResultSet rs = c1.s.executeQuery(q); rs.next(); this.j = 0) {
                // Populate the data array with values from the result set
                this.d[this.i][this.j++] = rs.getString("emp_id");
                this.d[this.i][this.j++] = rs.getString("first");
                this.d[this.i][this.j++] = rs.getString("second");
                this.d[this.i][this.j++] = rs.getString("Date");
                ++this.i; // Move to the next row in the data array
            }

            // Create a JTable with the data array and column headers
            this.j1 = new JTable(this.d, this.h);
        } catch (Exception var4) {
            // Handle any exceptions that might occur during database access
        }

        // Initialize and configure the "Print" button
        this.b1 = new JButton("Print");
        this.add(this.b1, "South"); // Add the button to the bottom of the JFrame
        JScrollPane s1 = new JScrollPane(this.j1); // Create a scroll pane for the JTable
        this.add(s1); // Add the scroll pane to the JFrame
        this.b1.addActionListener(this); // Register the button's ActionListener
    }

    // ActionListener implementation for the "Print" button
    public void actionPerformed(ActionEvent ae) {
        try {
            this.j1.print(); // Print the contents of the JTable
        } catch (Exception var3) {
            // Handle any exceptions that might occur during printing
        }
    }

    // Main method to create an instance of Attendanceview and make it visible
    public static void main(String[] args) {
        (new Attendanceview()).setVisible(true);
    }
}
