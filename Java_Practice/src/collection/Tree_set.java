package collection;
import java.util.*;
public class Tree_set {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("maggi");
		set.add("pasta");
		set.add("salt");
		set.add("chocolate");
		set.add("water");
		set.add("yippi");
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		//set.remove("Water");
		System.out.println(set);
		System.out.println(set.ceiling("Waters"));// next(Highest)
		System.out.println(set.floor("Waters"));//previous(Lowest)
		System.out.println(set.higher("Salt"));
		System.out.println(set.lower("Salt"));
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
		System.out.println(set.descendingSet());

	}

}
