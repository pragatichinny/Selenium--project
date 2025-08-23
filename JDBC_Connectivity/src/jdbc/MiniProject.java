package jdbc;

import java.sql.*;

public class MiniProject {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";  // change if needed
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            System.out.println("Connected to the database.");

            // 1. Create students table
            stmt.executeUpdate("DROP TABLE IF EXISTS students");
            String createStudents = "CREATE TABLE students (" +
                    "rollno INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "per INT, " +
                    "city VARCHAR(50), " +
                    "email VARCHAR(50))";
            stmt.executeUpdate(createStudents);
            System.out.println("Students table created.");
            stmt.executeQuery("Select*From students");

            // 2. Insert values into students
            String insertStudents = "INSERT INTO students (rollno, name, per, city, email) VALUES " +
                    "(101, 'Neeva', 97, 'Hyderabad', 'neeva@gmail.com')," +
                    "(102, 'Chinna', 79, 'Pune', 'chinna@gmail.com')," +
                    "(103, 'Chinny', 95, 'Mumbai', 'chinny@gmail.com')," +
                    "(104, 'Ravi', 75, 'Hyderabad', 'ravi@gmail.com')," +
                    "(105, 'Adithya', 85, 'Hyderabad', 'adithya@gmail.com')," +
                    "(106, 'Harsh', 87, 'Delhi', 'harsh@gmail.com')," +
                    "(107, 'Veera', 75, 'Hyderabad', 'veera@gmail.com')," +
                    "(108, 'Anil', 85, 'Hyderabad', 'anil@gmail.com')," +
                    "(109, 'Pandu', 87, 'Delhi', 'pandu@gmail.com')," +
                    "(110, 'Reena', 95, 'Chennai', 'reena@gmail.com')";
            stmt.executeUpdate(insertStudents);
            System.out.println("Students inserted.");

            // 3. Update email
            stmt.executeUpdate("UPDATE students SET email = 'updated_neeva@gmail.com' WHERE rollno = 101");
            System.out.println("Email updated for rollno 101.");

            // 4. Highest percentage
            ResultSet rs = stmt.executeQuery("SELECT * FROM students WHERE per = (SELECT MAX(per) FROM students)");
            System.out.println("\nStudent with Highest Percentage:");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("name") +
                        " - " + rs.getInt("per") + "% - " + rs.getString("city"));
            }

            // 5. Arrange in ascending order
            rs = stmt.executeQuery("SELECT * FROM students ORDER BY per ASC");
            System.out.println("\nStudents Sorted by Ascending Percentage:");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("name") + ": " +
                        rs.getInt("per") + "%");
            }

            // 6. Students from same city
            rs = stmt.executeQuery(
                    "SELECT * FROM students WHERE city IN " +
                            "(SELECT city FROM students GROUP BY city HAVING COUNT(*) > 1)");
            System.out.println("\nStudents from Same Cities:");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " + rs.getString("name") +
                        " (" + rs.getString("city") + ")");
            }

            // 7. Add new column
            try {
                stmt.executeUpdate("ALTER TABLE students ADD COLUMN phone VARCHAR(15)");
                System.out.println("\nColumn 'phone' added.");
            } catch (SQLException e) {
                System.out.println("Column 'phone' may already exist.");
            }

            // 8. Change datatype of 'per' to DECIMAL
            stmt.executeUpdate("ALTER TABLE students MODIFY COLUMN per DECIMAL(5,2)");
            System.out.println("Column 'per' changed to DECIMAL.");

            // 9. Create courses table and insert
            stmt.executeUpdate("DROP TABLE IF EXISTS courses");
            String createCourses = "CREATE TABLE courses (" +
                    "rollno INT, " +
                    "course_name VARCHAR(50))";
            stmt.executeUpdate(createCourses);

            String insertCourses = "INSERT INTO courses VALUES " +
                    "(101, 'Java')," +
                    "(101, 'Python')," +
                    "(102, 'C++')," +
                    "(103, 'Data Science')," +
                    "(104, 'HTML')";
            stmt.executeUpdate(insertCourses);
            System.out.println("Courses table created and populated.");

            // 10. Inner join students and courses
            rs = stmt.executeQuery(
                    "SELECT s.rollno, s.name, s.city, c.course_name " +
                    "FROM students s INNER JOIN courses c ON s.rollno = c.rollno");
            System.out.println("\nJoined Students and Courses:");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + " - " +
                        rs.getString("name") + " - " +
                        rs.getString("city") + " - " +
                        rs.getString("course_name"));
            }

            // Cleanup
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
