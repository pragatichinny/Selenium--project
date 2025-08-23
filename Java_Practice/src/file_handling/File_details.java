package file_handling;

import java.io.File;

public class File_details {

	public static void main(String[] args) {
		File f=new File("Sample.txt");
		if(f.exists()){
			System.out.println("File name:"+f.getName());
			System.out.println("File location:"+f.getAbsolutePath());
			System.out.println("File size:"+f.length());
			System.out.println("File readble:"+f.canRead());
			System.out.println("File Writable:"+f.canWrite());
			
		}
		else {
			System.out.println("File not found");
		}
	}

}
