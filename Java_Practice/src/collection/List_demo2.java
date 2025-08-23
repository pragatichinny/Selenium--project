package collection;
import java.util.*;
import java.util.ArrayList;

public class List_demo2 {

	public static void main(String[] args) {
		ArrayList<String> Animals=new ArrayList<>();
		Animals.add("Dog");
		Animals.add("Cat");
		Animals.add("Loin");
		Animals.add("Tiger");
		Animals.add("Snake");
		
		String[] array=Animals.toArray(new String[0]);
		
		System.out.println("Array is "+Arrays.toString(array));
		
		
		}
	}
