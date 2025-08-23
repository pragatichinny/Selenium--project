package Day7;
public class PassByValueDemo3 {
    public static void main(String[] args) {
        int x = 20;
        double y = 15.5;
        boolean flag = true;

        System.out.println("Before method call: x=" + x + ", y=" + y + ", flag=" + flag);
        modifyPrimitives(x, y, flag);
        System.out.println("After method call: x=" + x + ", y=" + y + ", flag=" + flag);
    }

    static void modifyPrimitives(int a, double b, boolean c) {
        a = 100;
        b = 200.5;
        c = false;
        System.out.println("Inside method: a=" + a + ", b=" + b + ", c=" + c);
    }
}
