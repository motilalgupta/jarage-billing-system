package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDb {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/garage";
        String user = "root";
        String pass = "Motilal#/@825313";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Connection successful!");
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ SQL Error!");
            e.printStackTrace();
        }
    }
}

