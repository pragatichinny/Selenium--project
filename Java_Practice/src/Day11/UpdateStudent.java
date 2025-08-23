package Day11;

import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = "password";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = con.prepareStatement(
                     "UPDATE students SET name = ?, percentage = ? WHERE id = ?")) {

            ps.setString(1, "Bob");
            ps.setDouble(2, 92.0);
            ps.setInt(3, 1);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
