//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EmployeeMnagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Home implements ActionListener {
    JFrame f = new JFrame("HOME PAGE");
    JLabel l1;
    JLabel l2;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;

    Home() {
        this.f.setBackground(Color.white);
        this.f.setLayout((LayoutManager)null);
        this.l1 = new JLabel();
        this.l1.setBounds(0, 0, 700, 400);
        this.l1.setLayout((LayoutManager)null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Home.jpg"));
        this.l1.setIcon(i1);
        this.f.add(this.l1);
        this.l2 = new JLabel("HOME ICONE");
        this.l2.setBounds(400, 20, 240, 40);
        this.l2.setFont(new Font("serif", 1, 30));
        this.l2.setForeground(Color.black);
        this.l1.add(this.l2);
        this.b1 = new JButton("Employee");
        this.b1.setBounds(380, 80, 120, 40);
        this.b1.setFont(new Font("serif", 1, 15));
        this.b1.addActionListener(this);
        this.b1.setForeground(new Color(0, 0, 0));
        this.b1.setBackground(new Color(255, 255, 255));
        this.l1.add(this.b1);
        this.b2 = new JButton("Salary");
        this.b2.setBounds(530, 80, 120, 40);
        this.b2.setFont(new Font("serif", 1, 15));
        this.b2.addActionListener(this);
        this.b2.setForeground(new Color(0, 0, 0));
        this.b2.setBackground(new Color(255, 255, 255));
        this.l1.add(this.b2);
        this.b3 = new JButton("Attendance");
        this.b3.setBounds(380, 140, 120, 40);
        this.b3.setFont(new Font("serif", 1, 15));
        this.b3.addActionListener(this);
        this.b3.setForeground(new Color(0, 0, 0));
        this.b3.setBackground(new Color(255, 255, 255));
        this.l1.add(this.b3);
        this.b4 = new JButton("About");
        this.b4.setBounds(530, 140, 120, 40);
        this.b4.setFont(new Font("serif", 1, 15));
        this.b4.addActionListener(this);
        this.b4.setForeground(new Color(0, 0, 0));
        this.b4.setBackground(new Color(255, 255, 255));
        this.l1.add(this.b4);
        this.b6 = new JButton(" EXIT ");
        this.b6.setBounds(440, 200, 150, 40);
        this.b6.setFont(new Font("serif", 1, 15));
        this.b6.addActionListener(this);
        this.b6.setForeground(Color.red);
        this.b6.setBackground(new Color(255, 255, 255));
        this.l1.add(this.b6);
        this.f.setVisible(true);
        this.f.setSize(700, 400);
        this.f.setLocation(400, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.b1) {
            this.f.setVisible(false);
            new employers();
        }

        if (ae.getSource() == this.b2) {
            this.f.setVisible(false);
            new salarybox();
        }

        if (ae.getSource() == this.b3) {
            this.f.setVisible(false);
            new attendancebox();
        }

        if (ae.getSource() == this.b4) {
            this.f.setVisible(false);
            (new AboutUs()).setVisible(true);
        }

        if (ae.getSource() == this.b6) {
            this.f.setVisible(false);
            System.exit(0);
        }

    }

    public static void main(String[] arg) {
        new Home();
    }
}
