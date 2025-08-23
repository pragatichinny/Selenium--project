package Day7;
public class PassByValueDemo1 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call: " + num);

        changeValue(num);  // pass primitive
        System.out.println("After method call: " + num);
    }

    static void changeValue(int n) {
        n = 50;  // change local copy
        System.out.println("Inside method: " + n);
    }
}
