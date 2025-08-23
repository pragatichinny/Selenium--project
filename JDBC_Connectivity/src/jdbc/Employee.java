package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Employee {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb"; 
        String user = "root"; 
        String password = "root";
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            
            CallableStatement bonusStmt = con.prepareCall("{CALL addBonusToEmployees()}");
            bonusStmt.executeUpdate();
            System.out.println("Bonus of 5000 added to all employees.\n");
            
            CallableStatement dupNameStmt = con.prepareCall("{CALL getDuplicateEmpName()}");
            ResultSet rs1 = dupNameStmt.executeQuery();
            System.out.println("Employees with Same Names:");
            System.out.println("Name\tCount");
            while (rs1.next()) {
                String name = rs1.getString("name");
                int count = rs1.getInt("count");
                System.out.println(name + "\t" + count);
            }
            System.out.println();
            
            
            CallableStatement salStmt = con.prepareCall("{CALL getHighestAndLowestSalary(?, ?)}");
            salStmt.registerOutParameter(1, Types.INTEGER);
            salStmt.registerOutParameter(2, Types.INTEGER);
            salStmt.execute();

            double highestSalary = salStmt.getDouble(1);
            double lowestSalary = salStmt.getDouble(2);

            System.out.println("Highest Salary: " + highestSalary);
            System.out.println("Lowest Salary: " + lowestSalary);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


