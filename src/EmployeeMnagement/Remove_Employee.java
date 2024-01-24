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
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Remove_Employee implements ActionListener {
    JFrame f = new JFrame("Remove Employee");
    JTextField t;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JButton b;
    JButton b1;
    JButton b2;
    JButton b3;

    Remove_Employee() {
        this.f.setBackground(Color.green);
        this.f.setLayout((LayoutManager)null);
        this.l5 = new JLabel();
        this.l5.setBounds(0, 0, 500, 500);
        this.l5.setLayout((LayoutManager)null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/remove.jpg"));
        this.l5.setIcon(img);
        this.f.add(this.l5);
        this.l1 = new JLabel("Employee Id");
        this.l1.setBounds(50, 50, 250, 30);
        this.l1.setForeground(Color.white);
        Font f2 = new Font("serif", 1, 25);
        this.l1.setFont(f2);
        this.l5.add(this.l1);
        this.t = new JTextField();
        this.t.setBounds(250, 50, 150, 30);
        this.l5.add(this.t);
        this.b = new JButton("Search");
        this.b.setBounds(200, 100, 100, 30);
        this.b.addActionListener(this);
        this.l5.add(this.b);
        this.b3 = new JButton("back");
        this.b3.setBounds(360, 100, 100, 30);
        this.b3.addActionListener(this);
        this.l5.add(this.b3);
        this.l2 = new JLabel("Name:");
        this.l2.setBounds(50, 150, 250, 30);
        this.l2.setForeground(Color.white);
        Font f3 = new Font("serif", 1, 20);
        this.l2.setFont(f3);
        this.l5.add(this.l2);
        this.l6 = new JLabel();
        this.l6.setBounds(200, 150, 350, 30);
        this.l6.setForeground(Color.white);
        Font F6 = new Font("serif", 1, 20);
        this.l6.setFont(F6);
        this.l5.add(this.l6);
        this.l3 = new JLabel("Mobile No:");
        this.l3.setBounds(50, 200, 250, 30);
        this.l3.setForeground(Color.white);
        Font f4 = new Font("serif", 1, 20);
        this.l3.setFont(f4);
        this.l5.add(this.l3);
        this.l7 = new JLabel();
        this.l7.setBounds(200, 200, 350, 30);
        this.l7.setForeground(Color.white);
        Font F7 = new Font("serif", 1, 20);
        this.l7.setFont(F7);
        this.l5.add(this.l7);
        this.l4 = new JLabel("Email Id:");
        this.l4.setBounds(50, 250, 250, 30);
        this.l4.setForeground(Color.white);
        Font F5 = new Font("serif", 1, 20);
        this.l4.setFont(F5);
        this.l5.add(this.l4);
        this.l8 = new JLabel();
        this.l8.setBounds(200, 250, 350, 30);
        this.l8.setForeground(Color.white);
        Font f8 = new Font("serif", 1, 20);
        this.l8.setFont(f8);
        this.l5.add(this.l8);
        this.b1 = new JButton("Remove");
        this.b1.setBounds(120, 300, 100, 30);
        this.b1.addActionListener(this);
        this.l5.add(this.b1);
        this.b2 = new JButton("Cancel");
        this.b2.setBounds(300, 300, 100, 30);
        this.b2.addActionListener(this);
        this.l5.add(this.b2);
        this.l2.setVisible(false);
        this.l3.setVisible(false);
        this.l4.setVisible(false);
        this.b1.setVisible(false);
        this.b2.setVisible(false);
        this.f.setSize(500, 500);
        this.f.setLocation(400, 200);
        this.f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        conn con;
        String str;
        if (ae.getSource() == this.b) {
            try {
                con = new conn();
                str = "select name,phone,email from employee where emp_id ='" + this.t.getText() + "' ";
                ResultSet rs = con.s.executeQuery(str);
                boolean i = false;
                if (rs.next()) {
                    String name = rs.getString(1);
                    String mob = rs.getString(2);
                    String email = rs.getString(3);
                    this.l2.setVisible(true);
                    this.l3.setVisible(true);
                    this.l4.setVisible(true);
                    this.b1.setVisible(true);
                    this.b2.setVisible(true);
                    i = true;
                    this.l6.setText(name);
                    this.l7.setText(mob);
                    this.l8.setText(email);
                }

                if (!i) {
                    JOptionPane.showMessageDialog((Component)null, "Id not found");
                }
            } catch (Exception var10) {
            }
        }

        if (ae.getSource() == this.b1) {
            try {
                con = new conn();
                str = "delete from employee where emp_id = '" + this.t.getText() + "'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog((Component)null, "deleted successfully");
                this.l2.setVisible(false);
                this.l3.setVisible(false);
                this.l4.setVisible(false);
                this.l6.setVisible(false);
                this.l7.setVisible(false);
                this.l8.setVisible(false);
                this.b1.setVisible(false);
                this.b2.setVisible(false);
            } catch (Exception var9) {
                JOptionPane.showMessageDialog((Component)null, "Exception occured while delting record " + String.valueOf(var9));
            }
        }

        if (ae.getSource() == this.b2) {
            this.f.setVisible(false);
            new Remove_Employee();
        }

        if (ae.getSource() == this.b3) {
            this.f.setVisible(false);
            new employers();
        }

    }

    public static void main(String[] ar) {
        new Remove_Employee();
    }
}
