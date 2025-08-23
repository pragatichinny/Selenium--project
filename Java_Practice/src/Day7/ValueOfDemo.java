package Day7;

public class ValueOfDemo {
    public static void main(String[] args) {
        int num = 123;
        double d = 45.67;

        // Convert primitives to wrapper objects using valueOf
        Integer intObj = Integer.valueOf(num);
        Double doubleObj = Double.valueOf(d);

        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
    }
}
