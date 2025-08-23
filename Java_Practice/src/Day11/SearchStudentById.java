package Day11;

import java.sql.*;
import java.util.Scanner;

public class SearchStudentById{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = "password";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE id = ?")) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Percentage: " + rs.getDouble("percentage"));
            } else {
                System.out.println("Student not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
