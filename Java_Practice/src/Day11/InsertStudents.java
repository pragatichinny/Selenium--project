package Day11;

import java.sql.*;

public class InsertStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = "password";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {

            String sql = "INSERT INTO students (id, name, percentage) VALUES (1, 'Alice', 85.5)";
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " record(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

