package collection;
import java.util.*;
public class Linked_hashset {

	public static void main(String[] args) {
		LinkedHashSet<String> set =new LinkedHashSet<String>();
		set.add("Maggi");
		set.add("pasta");
		set.add("salt");
		set.add("chocolate");
		set.add("water");
		set.add(null);
		set.add(null);//allow only one null element
		set.add("water");//dont allow duplicates
		System.out.println(set);
		System.out.println(set.add("Masala"));// we can not insert in the middle of the list
		System.out.println(set);
		
	}

}
