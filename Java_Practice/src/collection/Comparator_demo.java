package collection;
import java.util.*;
class Student2{
	int id;
	String name;
	Student2(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
}
public class Comparator_demo {

	public static void main(String[] args) {
		List<Student2> list=new ArrayList<>();
		list.add(new Student2(9, "Amit"));
		list.add(new Student2(0,"Rahul"));
		list.add(new Student2(2,"Kiran"));
		list.add(new Student2(2, "Kiran"));
		
		list.sort((s1,s2) -> s1.name.compareTo(s2.name));//use comparator

		list.forEach(System.out::println);

	}

}
