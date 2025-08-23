package collection;
import java.util.*;
public class List_demo3 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
        list1.add("Dog");
        list1.add("Cat");
        list1.add("Loin");
        List<String> list2 = new ArrayList<>();
        list2.add("cat");
        list2.add("Tiger");
        list2.add("Snake");
        List<String> mergedList = new ArrayList<>();
        for (String item : list1) {
            if (!mergedList.contains(item)) {
                mergedList.add(item);
            }
        }
        for (String item : list2) {
            if (!mergedList.contains(item)) {
                mergedList.add(item);
            }
        }

        System.out.println("Merged list without duplicates: " + mergedList);
	}
}