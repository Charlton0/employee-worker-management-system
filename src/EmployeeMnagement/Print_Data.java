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

class Print_Data implements ActionListener {
    JFrame f;
    JLabel id8;
    JLabel id;
    JLabel aid;
    JLabel id1;
    JLabel aid1;
    JLabel id2;
    JLabel aid2;
    JLabel id3;
    JLabel aid3;
    JLabel id4;
    JLabel aid4;
    JLabel id5;
    JLabel aid5;
    JLabel id6;
    JLabel aid6;
    JLabel id7;
    JLabel aid7;
    JLabel id9;
    JLabel id10;
    JLabel id11;
    JLabel id12;
    JLabel id13;
    JLabel id14;
    JLabel id15;
    JLabel id16;
    JLabel id17;
    JLabel lab;
    String emp_id;
    String name;
    String father;
    String address;
    String phone;
    String email;
    String education;
    String post;
    String age;
    String dob;
    String aadhar;
    JButton b1;
    JButton b2;
    ImageIcon icon;

    Print_Data(String e_id) {
        try {
            conn con = new conn();
            String str = "select * from employee where emp_id = '" + e_id + "'";

            for(ResultSet rs = con.s.executeQuery(str); rs.next(); this.emp_id = rs.getString("emp_id")) {
                this.name = rs.getString("name");
                this.father = rs.getString("fname");
                this.age = rs.getString("age");
                this.dob = rs.getString("dob");
                this.address = rs.getString("address");
                this.phone = rs.getString("phone");
                this.email = rs.getString("email");
                this.education = rs.getString("education");
                this.post = rs.getString("post");
                this.aadhar = rs.getString("aadhar");
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        this.f = new JFrame("Print Data");
        this.f.setVisible(true);
        this.f.setSize(595, 642);
        this.f.setLocation(450, 100);
        this.f.setBackground(Color.white);
        this.f.setLayout((LayoutManager)null);
        this.id9 = new JLabel();
        this.id9.setBounds(0, 0, 595, 642);
        this.id9.setLayout((LayoutManager)null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/print.jpg"));
        this.id9.setIcon(img);
        this.id8 = new JLabel("Employee Details");
        this.id8.setBounds(50, 10, 250, 30);
        this.f.add(this.id8);
        this.id8.setFont(new Font("serif", 1, 25));
        this.id9.add(this.id8);
        this.f.add(this.id9);
        this.id = new JLabel("Employee Id:");
        this.id.setBounds(50, 70, 120, 30);
        this.id.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id);
        this.aid = new JLabel(this.emp_id);
        this.aid.setBounds(200, 70, 200, 30);
        this.aid.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid);
        this.id1 = new JLabel("Name:");
        this.id1.setBounds(50, 120, 100, 30);
        this.id1.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id1);
        this.aid1 = new JLabel(this.name);
        this.aid1.setBounds(200, 120, 300, 30);
        this.aid1.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid1);
        this.id2 = new JLabel("Father's Name:");
        this.id2.setBounds(50, 170, 200, 30);
        this.id2.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id2);
        this.aid2 = new JLabel(this.father);
        this.aid2.setBounds(200, 170, 300, 30);
        this.aid2.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid2);
        this.id3 = new JLabel("Address:");
        this.id3.setBounds(50, 220, 100, 30);
        this.id3.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id3);
        this.aid3 = new JLabel(this.address);
        this.aid3.setBounds(200, 220, 300, 30);
        this.aid3.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid3);
        this.id4 = new JLabel("Mobile No:");
        this.id4.setBounds(50, 270, 100, 30);
        this.id4.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id4);
        this.aid4 = new JLabel(this.phone);
        this.aid4.setBounds(200, 270, 300, 30);
        this.aid4.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid4);
        this.id5 = new JLabel("Email Id:");
        this.id5.setBounds(50, 320, 100, 30);
        this.id5.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id5);
        this.aid5 = new JLabel(this.email);
        this.aid5.setBounds(200, 320, 300, 30);
        this.aid5.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid5);
        this.id6 = new JLabel("Education:");
        this.id6.setBounds(50, 370, 100, 30);
        this.id6.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id6);
        this.aid6 = new JLabel(this.education);
        this.aid6.setBounds(200, 370, 300, 30);
        this.aid6.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid6);
        this.id7 = new JLabel("Job Post:");
        this.id7.setBounds(50, 420, 100, 30);
        this.id7.setFont(new Font("serif", 1, 20));
        this.id9.add(this.id7);
        this.aid7 = new JLabel(this.post);
        this.aid7.setBounds(200, 420, 300, 30);
        this.aid7.setFont(new Font("serif", 1, 20));
        this.id9.add(this.aid7);
        this.b1 = new JButton("Print");
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b1.setBounds(100, 520, 100, 30);
        this.b1.addActionListener(this);
        this.id9.add(this.b1);
        this.b2 = new JButton("cancel");
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.b2.setBounds(250, 520, 100, 30);
        this.b2.addActionListener(this);
        this.id9.add(this.b2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.b1) {
            JOptionPane.showMessageDialog((Component)null, "printed successfully");
            this.f.setVisible(false);
            new employers();
        }

        if (ae.getSource() == this.b2) {
            this.f.setVisible(false);
            new View_Employee();
        }

    }

    public static void main(String[] args) {
        new Print_Data("Print Data");
    }
}
