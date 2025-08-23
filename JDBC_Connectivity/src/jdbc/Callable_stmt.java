package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable_stmt {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb"; 
        String user = "root"; 
        String password = "root";
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            
            CallableStatement cst = con.prepareCall("{CALL getStudentBymark00(?)}");
     
           
            cst.setInt(1, 87);               
           //cst.setString(2, "Neeva sharma");
     
            
            ResultSet rs = cst.executeQuery();
     
            System.out.println("ID\tName\t\t\tMarks");
            System.out.println("------------------------------------");
     
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
     
                System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
            }
     
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
     