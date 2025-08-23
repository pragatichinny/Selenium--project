package collection;
import java.util.*;
public class List_demo1 {

	public static void main(String[] args) {
		ArrayList<String> Animals=new ArrayList<>();
		Animals.add("Dog");
		Animals.add("Cat");
		Animals.add("Loin");
		Animals.add("Tiger");
		Animals.add("Snake");
		System.out.println(Animals);
		
		String Animal1="Dog";
		if(Animals.contains(Animal1)) {
			System.out.println(Animal1 +" is Found in a list");
		}else
			System.out.println(Animal1 +"is not Found in a list");
		

	}

}
