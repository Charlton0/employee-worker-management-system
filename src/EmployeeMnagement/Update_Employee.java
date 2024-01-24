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

class Update_Employee extends Add_Employee implements ActionListener {
    JFrame f = new JFrame("update Employee details");
    JLabel id;
    JLabel id1;
    JLabel id2;
    JLabel id3;
    JLabel id4;
    JLabel id5;
    JLabel id6;
    JLabel id7;
    JLabel id8;
    JLabel id9;
    JLabel id10;
    JLabel id11;
    JLabel id12;
    JLabel id15;
    JLabel lab;
    JLabel lab1;
    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
    JButton b;
    JButton b1;
    JButton b2;
    JButton b3;
    String id_emp;
    int i = 0;
    String age;
    String dat;

    Update_Employee(String idaa) {
        super(0);
        this.f.setVisible(true);
        this.f.setSize(900, 500);
        this.f.setLocation(450, 250);
        this.f.setBackground(Color.white);
        this.f.setLayout((LayoutManager)null);
        this.id_emp = idaa;
        this.id15 = new JLabel();
        this.id15.setBounds(0, 0, 900, 500);
        this.id15.setLayout((LayoutManager)null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_employee.jpg"));
        this.id15.setIcon(img);
        this.id8 = new JLabel("Update Employee Detail:");
        this.id8.setBounds(50, 10, 500, 50);
        this.id8.setFont(new Font("serif", 2, 40));
        this.id8.setForeground(Color.black);
        this.id15.add(this.id8);
        this.f.add(this.id15);
        this.id1 = new JLabel("Name:");
        this.id1.setBounds(50, 100, 100, 30);
        this.id1.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id1);
        this.t1 = new JTextField();
        this.t1.setBounds(200, 100, 150, 30);
        this.id15.add(this.t1);
        this.id2 = new JLabel("Father's Name:");
        this.id2.setBounds(400, 100, 200, 30);
        this.id2.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id2);
        this.t2 = new JTextField();
        this.t2.setBounds(600, 100, 150, 30);
        this.id15.add(this.t2);
        this.id3 = new JLabel("Address:");
        this.id3.setBounds(50, 150, 100, 30);
        this.id3.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id3);
        this.t3 = new JTextField();
        this.t3.setBounds(200, 150, 150, 30);
        this.id15.add(this.t3);
        this.id4 = new JLabel("Mobile No:");
        this.id4.setBounds(400, 150, 100, 30);
        this.id4.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id4);
        this.t4 = new JTextField();
        this.t4.setBounds(600, 150, 150, 30);
        this.id15.add(this.t4);
        this.id5 = new JLabel("Email Id:");
        this.id5.setBounds(50, 200, 100, 30);
        this.id5.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id5);
        this.t5 = new JTextField();
        this.t5.setBounds(200, 200, 150, 30);
        this.id15.add(this.t5);
        this.id6 = new JLabel("Education:");
        this.id6.setBounds(400, 200, 100, 30);
        this.id6.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id6);
        this.t6 = new JTextField();
        this.t6.setBounds(600, 200, 150, 30);
        this.id15.add(this.t6);
        this.id7 = new JLabel("Job Post:");
        this.id7.setBounds(50, 250, 100, 30);
        this.id7.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id7);
        this.t7 = new JTextField();
        this.t7.setBounds(200, 250, 150, 30);
        this.id15.add(this.t7);
        this.id9 = new JLabel("Aadhar No:");
        this.id9.setBounds(400, 250, 100, 30);
        this.id9.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id9);
        this.t8 = new JTextField();
        this.t8.setBounds(600, 250, 150, 30);
        this.id15.add(this.t8);
        this.id10 = new JLabel("Employee Id:");
        this.id10.setBounds(50, 300, 150, 30);
        this.id10.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id10);
        this.f.setVisible(false);
        this.t9 = new JTextField();
        this.t9.setBounds(200, 300, 150, 30);
        this.id15.add(this.t9);
        this.b = new JButton("update");
        this.b.setBounds(250, 400, 100, 30);
        this.b.addActionListener(this);
        this.id15.add(this.b);
        this.b1 = new JButton("Cancel");
        this.b1.setBounds(450, 400, 100, 30);
        this.b1.addActionListener(this);
        this.id15.add(this.b1);
        this.showData(idaa);
    }

    void showData(String s) {
        try {
            conn con = new conn();
            String str = "select * from employee where emp_id = '" + s + "'";
            ResultSet rs = con.s.executeQuery(str);
            if (rs.next()) {
                this.f.setVisible(true);
                this.i = 1;
                this.t1.setText(rs.getString(1));
                this.t2.setText(rs.getString(2));
                this.t3.setText(rs.getString(5));
                this.t4.setText(rs.getString(6));
                this.t5.setText(rs.getString(7));
                this.t6.setText(rs.getString(8));
                this.t7.setText(rs.getString(9));
                this.t8.setText(rs.getString(10));
                this.t9.setText(rs.getString(11));
                this.age = rs.getString(3);
                this.dat = rs.getString(4);
            }

            if (this.i == 0) {
                JOptionPane.showMessageDialog((Component)null, "Id not found");
            }

            new Search_Employee();
        } catch (Exception var5) {
        }

        this.f.setVisible(true);
        this.f.setSize(900, 500);
        this.f.setLocation(300, 100);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.b && this.i == 1) {
            try {
                conn con = new conn();
                String var10000 = this.t1.getText();
                String str = "update employee set name='" + var10000 + "',fname='" + this.t2.getText() + "',age='" + this.age + "',dob='" + this.dat + "',address='" + this.t3.getText() + "',phone='" + this.t4.getText() + "',email='" + this.t5.getText() + "',education='" + this.t6.getText() + "',post='" + this.t7.getText() + "',aadhar='" + this.t8.getText() + "',emp_id='" + this.t9.getText() + "' where emp_id='" + this.id_emp + "'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog((Component)null, "successfully updated");
                this.f.setVisible(false);
                new Search_Employee();
            } catch (Exception var4) {
                System.out.println("The error is:" + String.valueOf(var4));
            }
        }

        if (ae.getSource() == this.b1) {
            this.f.setVisible(false);
            new employers();
        }

    }

    public static void main(String[] arg) {
        new Update_Employee("Update Employee");
    }
}
