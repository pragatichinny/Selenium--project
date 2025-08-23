package Day7;

public class BooleanWrapperDemo {
    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(true);   // from boolean primitive
        Boolean b2 = Boolean.valueOf("true"); // from String

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);

        // Boolean parsing
        if (b1) {
            System.out.println("b1 is true");
        }
    }
}
