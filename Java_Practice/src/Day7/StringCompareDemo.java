package Day7;
public class StringCompareDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Using equals()
        if (str1.equals(str2)) {
            System.out.println("Strings are equal (case-sensitive).");
        } else {
            System.out.println("Strings are not equal (case-sensitive).");
        }

        // Using equalsIgnoreCase()
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (ignore case).");
        }
    }
}
