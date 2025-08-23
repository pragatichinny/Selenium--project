package Day11;

import java.sql.*;

public class JDBConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = "password";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
