package day3_Assignment;
import java.util.Scanner;
public class Words_in_sen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Trim and check if sentence is empty
        if (sentence.trim().isEmpty()) {
            System.out.println("The sentence contains 0 words.");
        } else {
            // Split sentence by spaces (handles multiple spaces)
            String[] words = sentence.trim().split("\\s+");
            System.out.println("The sentence contains " + words.length + " words.");
        }
	}

}
