package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file {

	public static void main(String[] args) {
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("Sample.txt"));
			w.write("\nHello");
			w.newLine();
			w.write("\nWelcome to java learning sessions");
			w.close();
			System.out.println("Write file successfully");
		}catch(IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}

	}

}
