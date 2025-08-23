package Day8;

import java.util.ArrayList;

public class UpdateArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of subjects
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("English");

        // Display original list
        System.out.println("Original List: " + subjects);

        // Update "Math" to "Statistics"
        int index = subjects.indexOf("Math");
        if (index != -1) {
            subjects.set(index, "Statistics");
            System.out.println("\"Math\" has been replaced with \"Statistics\".");
        } else {
            System.out.println("\"Math\" not found in the list.");
        }

        // Display updated list
        System.out.println("Updated List: " + subjects);
    }
}
