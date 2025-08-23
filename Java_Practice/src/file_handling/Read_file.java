package file_handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Read_file {

	public static void main(String[] args) throws IOException{
		List<String> lines=new ArrayList<String>();
		BufferedReader r=new BufferedReader(new FileReader("Sample.txt"));
		String line;
		/*if((line=r.readLine())!=null) {
			System.out.println(line);
		}
		else {
			System.out.println("File not found");
		}*/
		//used list
		while((line=r.readLine())!=null) {
			lines.add(line);
		}
		for(String l:lines) {
			System.out.println(l);
		}
		r.close();
		

	}

}
