//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EmployeeMnagement;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUser extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1;
    private JButton b2;
    private JButton b3;

    public LoginUser() {
        this.setBackground(new Color(169, 169, 169));
        this.setBounds(400, 200, 600, 400);
        this.panel = new JPanel();
        this.panel.setBackground(new Color(150, 150, 150));
        this.setContentPane(this.panel);
        this.panel.setLayout((LayoutManager)null);
        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(124, 89, 95, 24);
        l1.setFont(new Font("Tahoma", 1, 13));
        l1.setForeground(new Color(0, 0, 0));
        this.panel.add(l1);
        JLabel l2 = new JLabel("Password : ");
        l2.setBounds(124, 124, 95, 24);
        l2.setFont(new Font("Tahoma", 1, 13));
        l2.setForeground(new Color(0, 0, 0));
        this.panel.add(l2);
        this.textField = new JTextField();
        this.textField.setBounds(210, 93, 157, 20);
        this.panel.add(this.textField);
        this.passwordField = new JPasswordField();
        this.passwordField.setBounds(210, 128, 157, 20);
        this.panel.add(this.passwordField);
        JLabel l3 = new JLabel("");
        l3.setBounds(377, 79, 46, 34);
        this.panel.add(l3);
        JLabel l4 = new JLabel("");
        l4.setBounds(377, 124, 46, 34);
        this.panel.add(l3);
        this.b1 = new JButton("Login");
        this.b1.addActionListener(this);
        this.b1.setForeground(new Color(0, 0, 0));
        this.b1.setBackground(new Color(204, 255, 255));
        this.b1.setFont(new Font("Tahoma", 1, 13));
        this.b1.setBounds(149, 181, 113, 39);
        this.panel.add(this.b1);
        this.b2 = new JButton("SignUp");
        this.b2.addActionListener(this);
        this.b2.setFont(new Font("Tahoma", 1, 13));
        this.b2.setForeground(new Color(0, 0, 0));
        this.b2.setBackground(new Color(204, 255, 255));
        this.b2.setBounds(289, 181, 113, 39);
        this.panel.add(this.b2);
        this.b3 = new JButton("Forgot Password");
        this.b3.addActionListener(this);
        this.b3.setForeground(new Color(255, 255, 255));
        this.b3.setBackground(new Color(255, 0, 0));
        this.b3.setFont(new Font("Tahoma", 1, 15));
        this.b3.setBounds(199, 231, 179, 39);
        this.panel.add(this.b3);
        JLabel l5 = new JLabel("Trouble in Login?");
        l5.setFont(new Font("Tahoma", 1, 13));
        l5.setForeground(new Color(0, 0, 0));
        l5.setBounds(70, 240, 130, 20);
        this.panel.add(l5);
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(150, 150, 150));
        panel2.setBounds(24, 40, 434, 263);
        this.panel.add(panel2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.b1) {
            Boolean status = false;

            try {
                conn con = new conn();
                String sql = "select * from account where username=? and password=?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, this.textField.getText());
                st.setString(2, this.passwordField.getText());
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    new Home();
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Invalid Login...!.");
                }
            } catch (Exception var7) {
                var7.printStackTrace();
            }
        }

        if (ae.getSource() == this.b2) {
            this.setVisible(false);
            Signup su = new Signup();
            su.setVisible(true);
        }

        if (ae.getSource() == this.b3) {
            this.setVisible(false);
            Forgot forgot = new Forgot();
            forgot.setVisible(true);
        }

    }

    public static void main(String[] args) {
        (new LoginUser()).setVisible(true);
    }
}
