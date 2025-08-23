package Day9;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.Serializable;

public class FileHandlingTasks {

    // Q1. Create and Write to a File
    public static void createAndWriteFile() {
        try (FileWriter writer = new FileWriter("student.txt")) {
            writer.write("Alice\nBob\nCharlie\nDavid\nEve\n");
            System.out.println("Q1: Data written to student.txt successfully.");
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q2. Read from a File
    public static void readFile() {
        System.out.println("Q2: Reading student.txt:");
        try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q3. Append Data to a File
    public static void appendToFile() {
        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Frank\n");
            System.out.println("Q3: Data appended successfully.");
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q4. Count Words and Lines
    public static void countWordsAndLines() {
        int lines = 0, words = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                words += line.trim().split("\\s+").length;
            }
            System.out.println("Q4: Lines: " + lines + ", Words: " + words);
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q5. Copy contents from one file to another
    public static void copyFile() {
        try (FileReader fr = new FileReader("source.txt");
             FileWriter fw = new FileWriter("destination.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) fw.write(ch);
            System.out.println("Q5: File copied successfully.");
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q6. Check if a File Exists and Display Properties
    public static void fileProperties() {
        File file = new File("report.txt");
        if (file.exists()) {
            System.out.println("Q6: Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Name: " + file.getName());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size: " + file.length() + " bytes");
        } else System.out.println("Q6: File does not exist.");
    }

    // Q7. Create a File and Accept User Input
    public static void userInputToFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to write to file:");
        String input = sc.nextLine();
        try (FileWriter writer = new FileWriter("userinput.txt")) {
            writer.write(input);
            System.out.println("Q7: Input written to userinput.txt");
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q8. Reverse File Content
    public static void reverseFileContent() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) lines.add(line);
        } catch (IOException e) { e.printStackTrace(); }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reversed.txt"))) {
            for (int i = lines.size() - 1; i >= 0; i--) {
                bw.write(lines.get(i));
                bw.newLine();
            }
            System.out.println("Q8: Reversed content written to reversed.txt");
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q9. Store Objects in a File using Serialization
    static class Student implements Serializable {
        int id; String name; int marks;
        Student(int id, String name, int marks) { this.id = id; this.name = name; this.marks = marks; }
    }
    public static void serializeStudent() {
        Student s = new Student(1, "Alice", 90);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(s);
            System.out.println("Q9: Student object serialized to student.ser");
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q10. Read Serialized Object from File
    public static void deserializeStudent() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s = (Student) ois.readObject();
            System.out.println("Q10: ID: " + s.id + ", Name: " + s.name + ", Marks: " + s.marks);
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    }

    // Q11. Print All Files in a Directory
    public static void listFiles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter folder path:");
        String path = sc.nextLine();
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            System.out.println("Q11: Files in directory:");
            for (File f : files) if (f.isFile()) System.out.println(f.getName());
        } else System.out.println("Q11: Invalid folder path.");
    }

    // Q12. Delete a File
    public static void deleteFile() {
        File file = new File("file_to_delete.txt");
        if (file.exists()) {
            if (file.delete()) System.out.println("Q12: File deleted successfully.");
            else System.out.println("Q12: Failed to delete the file.");
        } else System.out.println("Q12: File does not exist.");
    }

    // Q13. Word Search in a File
    public static void wordSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to search:");
        String word = sc.nextLine();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = br.readLine()) != null) if (line.contains(word)) { found = true; break; }
            System.out.println(found ? "Q13: Word found." : "Q13: Word not found.");
        } catch (IOException e) { e.printStackTrace(); }
    }

    // Q14. Replace a Word in a File
    public static void replaceWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to replace:");
        String oldWord = sc.nextLine();
        System.out.println("Enter new word:");
        String newWord = sc.nextLine();

        File inputFile = new File("notes.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll(oldWord, newWord);
                bw.write(line); bw.newLine();
            }
        } catch (IOException e) { e.printStackTrace(); }

        // Replace original file
        if (inputFile.delete()) tempFile.renameTo(inputFile);
        System.out.println("Q14: Word replacement done.");
    }

    // Main method to call any task
    public static void main(String[] args) {
        createAndWriteFile();
        readFile();
        appendToFile();
        countWordsAndLines();
        copyFile();
        fileProperties();
        userInputToFile();
        reverseFileContent();
        serializeStudent();
        deserializeStudent();
        listFiles();
        deleteFile();
        wordSearch();
        replaceWord();
    }
}

