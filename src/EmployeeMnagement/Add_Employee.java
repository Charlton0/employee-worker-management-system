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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Add_Employee implements ActionListener {
    JFrame f;
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
    JLabel id16;
    JLabel id17;
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
    JTextField t12;
    JTextField t13;
    JButton b;
    JButton b1;
    JButton b2;
    JButton b3;

    Add_Employee(int i) {
    }

    Add_Employee() {
        this.f = new JFrame("Add Employee");
        this.f.setBackground(Color.white);
        this.f.setLayout((LayoutManager)null);
        this.id15 = new JLabel();
        this.id15.setBounds(0, 0, 900, 700);
        this.id15.setLayout((LayoutManager)null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
        this.id15.setIcon(img);
        this.id8 = new JLabel("New Employee Details");
        this.id8.setBounds(320, 30, 500, 50);
        this.id8.setFont(new Font("serif", 2, 25));
        this.id8.setForeground(Color.black);
        this.id15.add(this.id8);
        this.f.add(this.id15);
        this.id1 = new JLabel("Name");
        this.id1.setBounds(50, 150, 100, 30);
        this.id1.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id1);
        this.t1 = new JTextField();
        this.t1.setBounds(200, 150, 150, 30);
        this.id15.add(this.t1);
        this.id2 = new JLabel("Father's Name");
        this.id2.setBounds(400, 150, 200, 30);
        this.id2.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id2);
        this.t2 = new JTextField();
        this.t2.setBounds(600, 150, 150, 30);
        this.id15.add(this.t2);
        this.id3 = new JLabel("Age");
        this.id3.setBounds(50, 200, 100, 30);
        this.id3.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id3);
        this.t3 = new JTextField();
        this.t3.setBounds(200, 200, 150, 30);
        this.id15.add(this.t3);
        this.id4 = new JLabel("DOB (yyyy-mm-dd)");
        this.id4.setBounds(400, 200, 200, 30);
        this.id4.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id4);
        this.t4 = new JTextField();
        this.t4.setBounds(600, 200, 150, 30);
        this.id15.add(this.t4);
        this.id5 = new JLabel("Address");
        this.id5.setBounds(50, 250, 100, 30);
        this.id5.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id5);
        this.t5 = new JTextField();
        this.t5.setBounds(200, 250, 150, 30);
        this.id15.add(this.t5);
        this.id6 = new JLabel("Phone");
        this.id6.setBounds(400, 250, 100, 30);
        this.id6.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id6);
        this.t6 = new JTextField();
        this.t6.setBounds(600, 250, 150, 30);
        this.id15.add(this.t6);
        this.id7 = new JLabel("Email Id");
        this.id7.setBounds(50, 300, 100, 30);
        this.id7.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id7);
        this.t7 = new JTextField();
        this.t7.setBounds(200, 300, 150, 30);
        this.id15.add(this.t7);
        this.id9 = new JLabel("Education");
        this.id9.setBounds(400, 300, 100, 30);
        this.id9.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id9);
        this.t8 = new JTextField();
        this.t8.setBounds(600, 300, 150, 30);
        this.id15.add(this.t8);
        this.id10 = new JLabel("Job Post");
        this.id10.setBounds(50, 350, 100, 30);
        this.id10.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id10);
        this.t9 = new JTextField();
        this.t9.setBounds(200, 350, 150, 30);
        this.id15.add(this.t9);
        this.id11 = new JLabel("Other No");
        this.id11.setBounds(400, 350, 100, 30);
        this.id11.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id11);
        this.t10 = new JTextField();
        this.t10.setBounds(600, 350, 150, 30);
        this.id15.add(this.t10);

        this.id11 = new JLabel("Gender");
        this.id11.setBounds(400, 400, 100, 30);
        this.id11.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id11);
        this.t12 = new JTextField();
        this.t12.setBounds(600, 400, 150, 30);
        this.id15.add(this.t12);

        this.id12 = new JLabel("Employee Id");
        this.id12.setBounds(50, 400, 150, 30);
        this.id12.setFont(new Font("serif", 1, 20));
        this.id15.add(this.id12);
        this.t11 = new JTextField();
        this.t11.setBounds(200, 400, 150, 30);
        this.id15.add(this.t11);
        this.lab = new JLabel();
        this.lab.setBounds(200, 450, 250, 200);
        this.id15.add(this.lab);
        this.lab1 = new JLabel("");
        this.lab1.setBounds(600, 450, 250, 200);
        this.id15.add(this.lab1);
        this.b = new JButton("Submit");
        this.b.setBackground(Color.BLACK);
        this.b.setForeground(Color.WHITE);
        this.b.setBounds(250, 550, 150, 40);
        this.id15.add(this.b);
        this.b1 = new JButton("Cancel");
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b1.setBounds(450, 550, 150, 40);
        this.id15.add(this.b1);

        this.b1 = new JButton("Report");
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.b1.setBounds(650, 550, 150, 40);
        this.id15.add(this.b1);



        this.b.addActionListener(this);
        this.b1.addActionListener(this);
        this.f.setVisible(true);
        this.f.setSize(900, 700);
        this.f.setLocation(300, 100);
    }

    public void actionPerformed(ActionEvent ae) {
        String a = this.t1.getText();
        String bb = this.t2.getText();
        String c = this.t3.getText();
        String d = this.t4.getText();
        String e = this.t5.getText();
        String ff = this.t6.getText();
        String g = this.t7.getText();
        String h = this.t8.getText();
        String i = this.t9.getText();
        String j = this.t10.getText();
        String k = this.t11.getText();
        String report = this.t12.getText();

        if (ae.getSource() == this.b) {
            try {
                conn cc = new conn();
                String q = "insert into employee values('" + a + "','" + bb + "','" + c + "','" + d + "','" + e + "','" + ff + "','" + g + "','" + h + "','" + i + "','" + j + "','" + k + "','"+report+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog((Component)null, "Details Successfully Inserted");
                this.f.setVisible(false);
                new employers();
            } catch (Exception var15) {
                System.out.println("The error is:" + String.valueOf(var15));
            }
        } else if (ae.getSource() == this.b1) {
            this.f.setVisible(false);
            new employers();
        }

    }

    public static void main(String[] arg) {
        new Add_Employee();
    }
}
