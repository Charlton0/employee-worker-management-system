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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Forgot extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JButton b1;
    private JButton b2;
    private JButton b3;

    public static void main(String[] args) {
        (new Forgot()).setVisible(true);
    }

    public Forgot() {
        this.setBounds(400, 200, 650, 500);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setBackground(Color.WHITE);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma", 1, 13));
        l1.setBounds(109, 83, 87, 29);
        l1.setForeground(new Color(0, 0, 0));
        this.contentPane.add(l1);
        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("Tahoma", 1, 13));
        l2.setBounds(109, 122, 75, 21);
        l2.setForeground(new Color(0, 0, 0));
        this.contentPane.add(l2);
        JLabel l3 = new JLabel("Your Security Question");
        l3.setFont(new Font("Tahoma", 1, 13));
        l3.setBounds(109, 154, 156, 27);
        l3.setForeground(new Color(0, 0, 0));
        this.contentPane.add(l3);
        JLabel l4 = new JLabel("Answer");
        l4.setFont(new Font("Tahoma", 1, 13));
        l4.setBounds(109, 192, 104, 21);
        l4.setForeground(new Color(0, 0, 0));
        this.contentPane.add(l4);
        JLabel l5 = new JLabel("Password");
        l5.setFont(new Font("Tahoma", 1, 13));
        l5.setBounds(109, 224, 104, 21);
        l5.setForeground(new Color(0, 0, 0));
        this.contentPane.add(l5);
        this.t1 = new JTextField();
        this.t1.setFont(new Font("Tahoma", 1, 13));
        this.t1.setForeground(new Color(0, 0, 0));
        this.t1.setBounds(277, 88, 139, 20);
        this.contentPane.add(this.t1);
        this.t1.setColumns(10);
        this.t2 = new JTextField();
        this.t2.setEditable(false);
        this.t2.setFont(new Font("Tahoma", 1, 13));
        this.t2.setForeground(new Color(165, 42, 42));
        this.t2.setColumns(10);
        this.t2.setBounds(277, 123, 139, 20);
        this.contentPane.add(this.t2);
        this.t3 = new JTextField();
        this.t3.setEditable(false);
        this.t3.setFont(new Font("Tahoma", 1, 12));
        this.t3.setForeground(new Color(72, 61, 139));
        this.t3.setColumns(10);
        this.t3.setBounds(277, 161, 221, 20);
        this.contentPane.add(this.t3);
        this.t4 = new JTextField();
        this.t4.setFont(new Font("Tahoma", 1, 13));
        this.t4.setForeground(new Color(205, 92, 92));
        this.t4.setColumns(10);
        this.t4.setBounds(277, 193, 139, 20);
        this.contentPane.add(this.t4);
        this.t5 = new JTextField();
        this.t5.setEditable(false);
        this.t5.setFont(new Font("Tahoma", 1, 13));
        this.t5.setForeground(new Color(50, 205, 50));
        this.t5.setColumns(10);
        this.t5.setBounds(277, 225, 139, 20);
        this.contentPane.add(this.t5);
        this.b1 = new JButton("Search");
        this.b1.addActionListener(this);
        this.b1.setFont(new Font("Tahoma", 1, 11));
        this.b1.setBounds(428, 83, 80, 29);
        this.b1.setForeground(new Color(0, 0, 0));
        this.b1.setBackground(new Color(204, 255, 255));
        this.contentPane.add(this.b1);
        this.b2 = new JButton("Retrieve");
        this.b2.addActionListener(this);
        this.b2.setFont(new Font("Tahoma", 1, 11));
        this.b2.setBounds(426, 188, 85, 29);
        this.b2.setForeground(new Color(0, 0, 0));
        this.b2.setBackground(new Color(204, 255, 255));
        this.contentPane.add(this.b2);
        this.b3 = new JButton("Back");
        this.b3.addActionListener(this);
        this.b3.setFont(new Font("Tahoma", 1, 13));
        this.b3.setBounds(233, 270, 101, 29);
        this.b3.setBackground(Color.BLACK);
        this.b3.setForeground(Color.WHITE);
        this.contentPane.add(this.b3);
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19), 2), "Forgot-Panel", 4, 2, (Font)null, new Color(178, 34, 34)));
        panel.setBounds(47, 45, 508, 281);
        panel.setBackground(Color.WHITE);
        this.contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            conn con = new conn();
            String sql;
            PreparedStatement st;
            ResultSet rs;
            if (ae.getSource() == this.b1) {
                sql = "select * from account where username=?";
                st = con.c.prepareStatement(sql);
                st.setString(1, this.t1.getText());
                rs = st.executeQuery();

                while(rs.next()) {
                    this.t2.setText(rs.getString("name"));
                    this.t3.setText(rs.getString("sec_q"));
                }
            }

            if (ae.getSource() == this.b2) {
                sql = "select * from account where sec_ans=?";
                st = con.c.prepareStatement(sql);
                st.setString(1, this.t4.getText());
                rs = st.executeQuery();

                while(rs.next()) {
                    this.t5.setText(rs.getString("password"));
                }
            }

            if (ae.getSource() == this.b3) {
                this.setVisible(false);
                (new LoginUser()).setVisible(true);
            }
        } catch (Exception var6) {
        }

    }
}
