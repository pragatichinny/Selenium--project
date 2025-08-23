package file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Append_file {

	public static void main(String[] args) {
        
        Path filePath = Paths.get("myFile.txt");

        String contentToAppend = "\nThis is a new line appended to the file.";
        try {
            Files.write(filePath, contentToAppend.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Content successfully appended to " + filePath.toAbsolutePath());
        } catch (IOException e) {
            
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }
}