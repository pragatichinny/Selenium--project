package collection;
import java.util.*;
public class Linked_list_demo {

	public static void main(String[] args) {
		LinkedList<Integer> numbers=new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
	
		System.out.println("Original List: "+numbers);
		System.out.println("Cloned List: "+numbers.clone());
		
		
	}

}
