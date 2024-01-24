//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EmployeeMnagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    public Connection c;
    public Statement s;

    public conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project3", "root", "8045A");
            this.s = this.c.createStatement();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}
