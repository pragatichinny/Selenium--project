package file_handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Serial_data {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Minisha shah");
		Employee emp2=new Employee(102,"Monika");
		try {
			FileWriter fw=new FileWriter("employee.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(emp1.toString());
			bw.newLine();
			bw.write(emp2.toString());
			bw.newLine();
			bw.close();
			fw.close();
			System.out.println("Done");
		}catch(IOException e) {
			System.out.println("Failed");
			System.out.println(e);
		}

	}

}
