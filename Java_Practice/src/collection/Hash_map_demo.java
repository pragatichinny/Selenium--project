package collection;

import java.util.HashMap;

public class Hash_map_demo {

	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "Maggi");
		map.put(5, "Water");
		map.put(2, "Vegies");
		map.put(4, "Masala");
		map.put(3, "yippi");
		System.out.println(map);
		System.out.println(map.containsKey(7));
		System.out.println(map.get(5));
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		

	}

}
