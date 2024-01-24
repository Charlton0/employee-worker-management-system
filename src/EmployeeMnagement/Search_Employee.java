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
import javax.swing.JTextField;

class Search_Employee implements ActionListener {
    JFrame f = new JFrame("search");
    JTextField t;
    JLabel l;
    JLabel l5;
    JButton b;
    JButton b2;

    Search_Employee() {
        this.f.setBackground(Color.green);
        this.f.setLayout((LayoutManager)null);
        this.l5 = new JLabel();
        this.l5.setBounds(0, 0, 500, 270);
        this.l5.setLayout((LayoutManager)null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        this.l5.setIcon(img);
        this.l = new JLabel("Employee Id");
        this.l.setVisible(true);
        this.l.setBounds(40, 50, 250, 30);
        this.l.setForeground(Color.white);
        Font F1 = new Font("serif", 1, 25);
        this.l.setFont(F1);
        this.l5.add(this.l);
        this.f.add(this.l5);
        this.t = new JTextField();
        this.t.setBounds(240, 50, 220, 30);
        this.l5.add(this.t);
        this.b = new JButton("Search");
        this.b.setBounds(240, 150, 100, 30);
        this.b.addActionListener(this);
        this.l5.add(this.b);
        this.b2 = new JButton("Cancel");
        this.b2.setBounds(360, 150, 100, 30);
        this.b2.addActionListener(this);
        this.l5.add(this.b2);
        this.f.setSize(500, 270);
        this.f.setLocation(450, 250);
        this.f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.b2) {
            this.f.setVisible(false);
            new employers();
        }

        if (ae.getSource() == this.b) {
            new Update_Employee(this.t.getText());
            this.f.setVisible(false);
        }

    }

    public static void main(String[] ar) {
        new Search_Employee();
    }
}
