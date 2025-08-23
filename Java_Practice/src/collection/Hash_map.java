package collection;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		HashMap<String,String> map= new HashMap<String,String>();
		map.put("one", "Orange");
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Five", "Watermelon");
		map.put("Ten", "Muskmelon");
		map.put("Two", "Kiwi");
		map.put("Nine", "Kiwi");
		map.put(null, "Nothing");
		map.put(null, null);
		map.put("Nine", "Apple");//replace
		System.out.println(map);
		map.replace("nine", "Grapes");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
	}

}
