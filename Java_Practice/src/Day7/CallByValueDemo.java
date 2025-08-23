package Day7;
class Box2 {
    int length;
    Box2(int length) { this.length = length; }
}

public class CallByValueDemo {
    public static void changeObject(Box2 b) {
        b = new Box2(100); // assign new object
    }

    public static void main(String[] args) {
        Box2 box = new Box2(10);
        System.out.println("Before method: " + box.length);
        changeObject(box);
        System.out.println("After method: " + box.length);
    }
}
