package collection;
import java.util.*;
public class Vector_practice {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Orange");
		v.add("Blue");
		v.add("White");
		v.add("Black");
		v.add(4,"gray");
		v.add("null");
		v.add("Black");
		System.out.println(v);
		System.out.println(v.indexOf("Blue"));
		System.out.println(v.subList(0, 2));
		System.out.println(v.contains("red"));
		System.out.println(v.clone());
		System.out.println(v.elementAt(4));
		System.out.println(v.equals("Gray"));
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.get(5));
		System.out.println(v.indexOf("Blue", 1));
		System.out.println(v.isEmpty());
		System.out.println(v.lastElement());
		System.out.println(v.remove(5));
		System.out.println(v);
		
	}

}
