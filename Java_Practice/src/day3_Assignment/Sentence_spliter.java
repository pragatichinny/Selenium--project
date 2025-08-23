package day3_Assignment;
import java.util.Scanner;

public class Sentence_spliter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");

      
        System.out.println("The sentence contains the following words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
