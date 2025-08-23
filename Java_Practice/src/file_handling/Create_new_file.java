package file_handling;

import java.io.File;

public class Create_new_file {

	public static void main(String[] args) {
		File f=new File("Sample.txt");
		try {
			f.createNewFile();//create new file on particular location
			System.out.println(f.setWritable(true));
		}catch(Exception e) {
			System.out.println("File not found");
			System.out.println(e);
		}

	}

}
