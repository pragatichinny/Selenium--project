package Day7;
public class PassByValueDemo2 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        swap(a, b);  // attempt to swap
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside swap method: x = " + x + ", y = " + y);
    }
}

