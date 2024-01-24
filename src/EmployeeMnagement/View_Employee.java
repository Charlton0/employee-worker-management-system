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

class View_Employee implements ActionListener {
    JFrame f = new JFrame("View");
    JTextField t;
    JLabel l1;
    JLabel l2;
    JButton b;
    JButton b2;

    View_Employee() {
        this.f.setBackground(Color.green);
        this.f.setLayout((LayoutManager)null);
        this.l1 = new JLabel();
        this.l1.setBounds(0, 0, 500, 270);
        this.l1.setLayout((LayoutManager)null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        this.l1.setIcon(img);
        this.l2 = new JLabel("Employee Id");
        this.l2.setVisible(true);
        this.l2.setBounds(40, 60, 250, 30);
        this.l2.setForeground(Color.white);
        Font F1 = new Font("serif", 1, 30);
        this.l2.setFont(F1);
        this.l1.add(this.l2);
        this.f.add(this.l1);
        this.t = new JTextField();
        this.t.setBounds(240, 60, 220, 30);
        this.l1.add(this.t);
        this.b = new JButton("Search");
        this.b.setBounds(240, 150, 100, 30);
        this.b.addActionListener(this);
        this.l1.add(this.b);
        this.b2 = new JButton("Cancel");
        this.b2.setBounds(360, 150, 100, 30);
        this.b2.addActionListener(this);
        this.l1.add(this.b2);
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
            this.f.setVisible(false);
            new Print_Data(this.t.getText());
        }

    }

    public static void main(String[] ar) {
        new View_Employee();
    }
}
