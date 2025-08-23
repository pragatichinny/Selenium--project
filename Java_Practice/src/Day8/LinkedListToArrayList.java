package Day8;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Blue");
        linkedList.add("Green");

        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        System.out.println("LinkedList: " + linkedList);
        System.out.println("ArrayList: " + arrayList);
    }
}

