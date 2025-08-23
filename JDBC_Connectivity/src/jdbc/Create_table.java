package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.transform.Result;

public class Create_table {

	public static void main(String[] args)  {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="root";
		//crete table
		String sql="Create table students(rollno int,"
				+"name varchar(50),"
				+"per int,"
				+"city varchar(50),"
				+"email varchar(50))";
		
		//create course table
		String createCourseTable = "CREATE TABLE courses (" +
                "rollno INT, " +
                "course_name VARCHAR(50))";
		
		
		//insert record
		String insertSQL="insert into students values(101,'   neeva',       97,'Hyderabad','     abc@gmail.com'),"
				+"(102,'    chinna',    79,',Pune','    munna@gmail.com'),"
				+"(103,'    chinny',    95,'Mumbai','    chinny@gmail.com'),"
				+"(104,'    ravi',      75,'Hyderabad','    ravi@gmail.com'),"
				+"(105,'    adithya',   85,'Hyderabad','    adi@gmail.com'),"
				+"(106,'    harsh',     87,'Delhi','    harsh@gmail.com'),"
				+"(107,'    veera',      75,'Hyderabad','    veera@gmail.com'),"
				+"(108,'    anil',   85,'Hyderabad','    anil@gmail.com'),"
				+"(109,'    pandu',     87,'Delhi','    pandu@gmail.com'),"
				+"(110,'    reena',     95,'Chennai','    renna@gmail.com')";
		
		//insert records in courses table
		String insertCourses = "INSERT INTO courses VALUES " +
                "(101, 'Java'), " +
                "(101, 'Python'), " +
                "(102, 'C++'), " +
                "(103, 'Data Science'), " +
                "(104, 'HTML')";
		String updateQuery = "UPDATE students SET email = '  nevva@gmail.com' WHERE rollno = 101";
		String query="Select*from students where per =(select max(per) from students)";
		String alterQuery="Alter table students ADD column phoneno varchar(10)";
		
				
		try {
			//driver connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
			//create statement for query creation
			Statement stmt=con.createStatement();
			//call create query using statement
			stmt.executeUpdate(sql);
			
			stmt.executeUpdate(createCourseTable);
			System.out.println("Courses table created");
			
			
			stmt.executeUpdate(insertCourses);
			System.out.println("Courses inserted");
			
			System.out.println("Student table created");
			//call insert query using statement
			int rowInserted=stmt.executeUpdate(insertSQL);
			if(rowInserted>0) {
				System.out.println("New Student record inserted");
			}
			
			//print table
			ResultSet rs=stmt.executeQuery("Select*From students");
			//System.out.println("rollno\t name\t per\t email");
			
			stmt.execute(updateQuery);
			//add new column
			stmt.execute(alterQuery);
			
			
			//records in ascending order
			rs=stmt.executeQuery("Select*From students ORDER BY per ASC");
			System.out.println("ro1lno\t name\t per\t email");
			
			//students belongs to same city
			rs = stmt.executeQuery(
				    "SELECT * FROM students " +
				    "WHERE city IN (" +
				        "SELECT city FROM students GROUP BY city HAVING COUNT(*) > 1" +
				    ")"
				);
			
			//add new column
			stmt.executeQuery("Alter table students ADD column phoneno varchar(10)");

			System.out.println("Students from same cities:");
			System.out.println("eollno\tname\tper\temail\tcity");
			
			//highest percentage
			rs=stmt.executeQuery(query);
			System.out.println("\nStudent with highest percentage:");
			
			
			//join student and courses
			System.out.println("\nJoined data (students + their courses):");
			String joinQuery = "SELECT students.rollno, students.name, students.city, courses.course_name " +
			                   "FROM students " +
			                   "INNER JOIN courses ON students.rollno = courses.rollno";
			rs = stmt.executeQuery(joinQuery);
			//while loop for fetching all the table records
			while(rs.next()) {
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String email=rs.getString("email");
				String city=rs.getString("city");
				System.out.println(rollno+" "+name+" "+per+" "+" "+city+" "+email);
			}
			stmt.close();
			con.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
