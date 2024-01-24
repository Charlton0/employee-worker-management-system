//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EmployeeMnagement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class Signup extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1;
    private JButton b2;
    private JComboBox<?> comboBox;

    public static void main(String[] args) {
        (new Signup()).setVisible(true);
    }

    public Signup() {
        this.setBounds(400, 200, 606, 406);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setBackground(Color.WHITE);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setForeground(Color.DARK_GRAY);
        lblUsername.setFont(new Font("Tahoma", 1, 14));
        lblUsername.setBounds(99, 86, 92, 26);
        this.contentPane.add(lblUsername);
        JLabel lblName = new JLabel("Name :");
        lblName.setForeground(Color.DARK_GRAY);
        lblName.setFont(new Font("Tahoma", 1, 14));
        lblName.setBounds(99, 123, 92, 26);
        this.contentPane.add(lblName);
        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setForeground(Color.DARK_GRAY);
        lblPassword.setFont(new Font("Tahoma", 1, 14));
        lblPassword.setBounds(99, 160, 92, 26);
        this.contentPane.add(lblPassword);
        JLabel lblAnswer = new JLabel("Answer :");
        lblAnswer.setForeground(Color.DARK_GRAY);
        lblAnswer.setFont(new Font("Tahoma", 1, 14));
        lblAnswer.setBounds(99, 234, 92, 26);
        this.contentPane.add(lblAnswer);
        this.comboBox = new JComboBox();
        this.comboBox.setModel(new DefaultComboBoxModel(new String[]{"Your NickName?", "Your Lucky Number?", "Your child SuperHero?", "Your childhood Name ?"}));
        this.comboBox.setBounds(265, 202, 148, 20);
        this.contentPane.add(this.comboBox);
        JLabel lblSecurityQuestion = new JLabel("Security Question :");
        lblSecurityQuestion.setForeground(Color.DARK_GRAY);
        lblSecurityQuestion.setFont(new Font("Tahoma", 1, 14));
        lblSecurityQuestion.setBounds(99, 197, 140, 26);
        this.contentPane.add(lblSecurityQuestion);
        this.textField = new JTextField();
        this.textField.setBounds(265, 91, 148, 20);
        this.contentPane.add(this.textField);
        this.textField.setColumns(10);
        this.textField_1 = new JTextField();
        this.textField_1.setColumns(10);
        this.textField_1.setBounds(265, 128, 148, 20);
        this.contentPane.add(this.textField_1);
        this.textField_2 = new JTextField();
        this.textField_2.setColumns(10);
        this.textField_2.setBounds(265, 165, 148, 20);
        this.contentPane.add(this.textField_2);
        this.textField_3 = new JTextField();
        this.textField_3.setColumns(10);
        this.textField_3.setBounds(265, 239, 148, 20);
        this.contentPane.add(this.textField_3);
        this.b1 = new JButton("Create");
        this.b1.addActionListener(this);
        this.b1.setFont(new Font("Tahoma", 1, 13));
        this.b1.setBounds(140, 289, 100, 30);
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.contentPane.add(this.b1);
        this.b2 = new JButton("Back");
        this.b2.addActionListener(this);
        this.b2.setFont(new Font("Tahoma", 1, 13));
        this.b2.setBounds(300, 289, 100, 30);
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.contentPane.add(this.b2);
        JPanel panel = new JPanel();
        panel.setForeground(new Color(34, 139, 34));
        panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account", 4, 2, (Font)null, new Color(34, 139, 34)));
        panel.setBounds(31, 46, 476, 296);
        panel.setBackground(Color.WHITE);
        this.contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            conn con = new conn();
            if (ae.getSource() == this.b1) {
                // Check if username, name, or password is not a single character or contains + or -
                if (this.textField.getText().length() == 1 || this.textField_1.getText().length() == 1 || this.textField_2.getText().length() == 1 ||
                        this.textField.getText().contains("+") || this.textField.getText().contains("-") ||
                        this.textField_1.getText().contains("+") || this.textField_1.getText().contains("-") ||
                        this.textField_2.getText().contains("+") || this.textField_2.getText().contains("-")) {
                    JOptionPane.showMessageDialog(this, "Please enter valid credentials.");
                    return; // Exit the method to prevent further execution
                }

                // Check if the name contains only alphabets
                if (!this.textField_1.getText().matches("^[a-zA-Z]+$")) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid name with only alphabets.");
                    return; // Exit the method to prevent further execution
                }

                String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, this.textField.getText());
                st.setString(2, this.textField_1.getText());
                st.setString(3, this.textField_2.getText());
                st.setString(4, (String) this.comboBox.getSelectedItem());
                st.setString(5, this.textField_3.getText());
                this.setVisible(false);
                (new LoginUser()).setVisible(true);
                int i = st.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog((Component) null, "Successfully Created");
                }

                this.textField.setText("");
                this.textField_1.setText("");
                this.textField_2.setText("");
                this.textField_3.setText("");
            }

            if (ae.getSource() == this.b2) {
                this.setVisible(false);
                (new LoginUser()).setVisible(true);
            }
        } catch (Exception var6) {
            var6.printStackTrace(); // It's a good practice to print the exception details during development
        }
    }
}