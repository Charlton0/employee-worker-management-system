import EmployeeMnagement.LoginUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Front_Page implements ActionListener {
    JFrame f = new JFrame("Employee Management System");
    JLabel id;
    JButton b;

    Front_Page() {
        f.setBackground(Color.red);
        f.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 150, 1360, 530);
        f.add(l1);

        b = new JButton("CLICK HERE TO CONTINUE");
        b.setForeground(new Color(0, 0, 0));
        b.setBackground(new Color(204, 255, 255));
        b.setFont(new Font("Tahoma", 1, 25));
        b.setBounds(475, 600, 400, 70);
        b.addActionListener(this);

        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setLayout(null);

        JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80, 30, 1500, 100);
        lid.setFont(new Font("serif", 0, 70));
        id.add(lid);
        id.add(b);

        f.add(id);

        f.getContentPane().setBackground(Color.WHITE);
        f.setVisible(true);
        f.setSize(1360, 750);
        f.setLocation(90, 50);

        // Animation for the title (optional)
        animateTitle(lid);
    }
//    private void animateTitle(JLabel titleLabel) {
//        new Thread(() -> {
//            int colorStep = 0; // 0: Red, 1: Green, 2: Blue
//            while (true) {
//                switch (colorStep) {
//                    case 0:
//                        titleLabel.setForeground(Color.RED);
//                        break;
//                    case 1:
//                        titleLabel.setForeground(Color.GREEN);
//                        break;
//                    case 2:
//                        titleLabel.setForeground(Color.BLUE);
//                        break;
//                }
//
//                try {
//                    Thread.sleep(1000L); // Change color every 1000 milliseconds (1 second)
//                } catch (InterruptedException ignored) {
//                }
//
//                colorStep = (colorStep + 1) % 3; // Move to the next color
//            }
//        }).start();
//    }
    // Animation for the title (optional)
    private void animateTitle(JLabel titleLabel) {
        new Thread(() -> {
            Random random = new Random();
            while (true) {
                // Generate random RGB values
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);

                titleLabel.setForeground(new Color(red, green, blue));

                try {
                    Thread.sleep(500L); // Change color every 500 milliseconds (0.5 second)
                } catch (InterruptedException ignored) {
                }
            }
        }).start();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            f.setVisible(false);
            new LoginUser().setVisible(true);
        }
    }

    public static void main(String[] arg) {
        new Front_Page();
    }
}
