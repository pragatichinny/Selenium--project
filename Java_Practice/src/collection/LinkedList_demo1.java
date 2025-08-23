package collection;
import java.util.*;
public class LinkedList_demo1 {

	public static void main(String[] args) {
		LinkedList<String> LinkedList=new LinkedList<>();
		LinkedList.add("Apple");
		LinkedList.add("Banana");
		LinkedList.add("Kiwi");
		LinkedList.add("Grapes");
		LinkedList.add("Orange");
		
		List<String> arrayList=new ArrayList<>(LinkedList);//Linkedlist to array list
		
		System.out.println("LinkedList: "+LinkedList);
		System.out.println("ArrayList: "+arrayList);

	}

}
