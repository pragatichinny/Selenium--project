package collection;
import java.util.*;
public class List_demo {

	public static void main(String[] args) {
		/*List<String> list=new ArrayList<String>();
		list.add(0,"Apple");
		list.add(1,"Mango");
		list.add(2,"Kiwi");
		list.add(3,"Banana");
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(2, "orange");
		System.out.println(list);
		list.add(3,"Kiwi");
		System.out.println(list);
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana"));
		//System.out.println(list.getFirst());
		//System.out.println(list.getLast());
		System.out.println(list.indexOf("Kiwi"));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("Kiwi");
		System.out.println(list);
		//System.out.println(list.reversed());
		
		
		//with iterator
		Iterator<String> itr=list.listIterator();
		while(itr=hasNext()) {
			System.out.println(itr.next());*/
			
		//Add group of elements with list interface method "of"
			
			ArrayList<Integer> list1=new ArrayList<>(List.of(50,40,70,80,50,30));
			Collections.sort(list1);
			System.out.println(list1);
		}

	}


