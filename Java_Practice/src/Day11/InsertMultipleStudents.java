package Day11;

import java.sql.*;
import java.util.Scanner;

public class InsertMultipleStudents {

    private static final String URL = "jdbc:mysql://localhost:3306/school_db";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Connected to database successfully!");

            String sql = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                System.out.print("How many students do you want to insert? ");
                int n = sc.nextInt();
                sc.nextLine(); // consume newline

                for (int i = 1; i <= n; i++) {
                    System.out.println("\nEnter details for student " + i + ":");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setInt(3, marks);

                    ps.addBatch(); // add to batch
                }

                int[] result = ps.executeBatch(); // execute all inserts
                System.out.println(result.length + " student(s) inserted successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

