package Day11;

import java.sql.*;

public class DeleteStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = "password";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id = ?")) {

            ps.setInt(1, 1);
            int rows = ps.executeUpdate();
            System.out.println(rows + " record(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
