package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class Tree_set_demo {

	public static void main(String[] args) {
		TreeMap<String,String> map= new TreeMap<String,String>();
		map.put("one", "Orange");
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Five", "Watermelon");
		map.put("Ten", "Muskmelon");
		map.put("Two", "Kiwi");
		map.put("Nine", "Kiwi");
		map.put("Nine", "CusterdApple");//replace
		System.out.println(map);
		System.out.println(map.get("Three"));
		map.replace("nine", "CusturdApple");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.ceilingKey("Nines"));
		System.out.println(map.floorKey("Nines"));
		System.out.println(map.higherKey("Nines"));
		System.out.println(map.lowerKey("Nines"));

		
	}

}

