
package airlinemanagementsystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "poiUY54321@#");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
