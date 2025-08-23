package Day7;
class Box {
    int length;

    Box(int length) {
        this.length = length;
    }
}

public class BoxDemo {
    public static void modifyLength(Box b) {
        b.length = 50;  // modifying the object
    }

    public static void main(String[] args) {
        Box box = new Box(10);
        System.out.println("Before modification: " + box.length);
        modifyLength(box);
        System.out.println("After modification: " + box.length);
    }
}

