package jdbc;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Jdbc_conn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");//used to establish the connection
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Emp");
		System.out.println("ID\t name\t salary\t");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int salary=rs.getInt("salary");
			System.out.println(id+" "+ name+" "+ salary);
			
		}
		rs.close();
		stmt.close();
		con.close();

	}

}
