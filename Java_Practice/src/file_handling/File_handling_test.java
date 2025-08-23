package file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling_test {

	public static void main(String[] args) {
		String fileName="myFile.txt";
		String contentToWrite="This is a test line.\nAnother line of text.";
		
		File file=new File(fileName);
		try {
			if(file.createNewFile()) {
				System.out.println("File created: "+file.getName());
			}else {
				System.out.println("File not found or already exists");
			}
		}catch(IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}
		
		try(FileWriter fw=new FileWriter(fileName);
			BufferedWriter bw=new BufferedWriter(fw)){
			bw.write(contentToWrite);
			System.out.println("Successfully wrote to the file");
		}catch(IOException e){
			System.out.println("An error occurred while Writing the file.");
			e.printStackTrace();
		}
		
		try(FileReader fr=new FileReader(fileName);
				BufferedReader br=new BufferedReader(fr)){
				String line;
				System.out.println("Reading from the file");
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			}catch(IOException e){
				System.out.println("An error occurred while reading the file.");
				e.printStackTrace();
			}

	}

}
