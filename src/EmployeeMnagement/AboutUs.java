//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EmployeeMnagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutUs extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        (new AboutUs()).setVisible(true);
    }

    public AboutUs() {
        super("About Us");
        this.setBackground(new Color(173, 216, 230));
        this.setBounds(350, 150, 700, 500);
        this.contentPane = new JPanel();
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        new JLabel("New label");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Maseno_University_Official_avatar_400x400.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400, 40, 250, 100);
        this.contentPane.add(l1);
        JLabel l3 = new JLabel("Employee");
        l3.setForeground(new Color(0, 0, 255));
        l3.setFont(new Font("Trebuchet MS", 3, 34));
        l3.setBounds(140, 40, 200, 55);
        this.contentPane.add(l3);
        JLabel l4 = new JLabel("Mangement System");
        l4.setForeground(new Color(0, 0, 255));
        l4.setFont(new Font("Trebuchet MS", 3, 34));
        l4.setBounds(70, 90, 405, 40);
        this.contentPane.add(l4);
        JLabel l6 = new JLabel("Developed By : ORARO,JUMA,& JOHN");
        l6.setFont(new Font("Trebuchet MS", 1, 30));
        l6.setBounds(70, 198, 600, 35);
        this.contentPane.add(l6);
        JLabel l7 = new JLabel("Roll Number : 5 ,6 , & 13");
        l7.setFont(new Font("Trebuchet MS", 1, 20));
        l7.setBounds(70, 260, 600, 34);
        this.contentPane.add(l7);
        JLabel l8 = new JLabel("Contact : www.orarojack.ac.in ");
        l8.setFont(new Font("Trebuchet MS", 1, 20));
        l8.setBounds(70, 290, 600, 34);
        this.contentPane.add(l8);
        JLabel l9 = new JLabel("Education : Bsc.( COMPUTER SCIENCE )");
        l9.setFont(new Font("Trebuchet MS", 1, 20));
        l9.setBounds(70, 320, 600, 34);
        this.contentPane.add(l9);
        JLabel l10 = new JLabel("Phone - +254 713584267");
        l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Trebuchet MS", 3, 18));
        l10.setBounds(70, 400, 600, 34);
        this.contentPane.add(l10);
        this.contentPane.setBackground(Color.WHITE);
    }
}
