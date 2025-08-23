package collection;
import java.util.*;
public class Student implements Comparable<Student>{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	//public int compareTo(Student s){//sorting id
	//return id-s.id;
	public int compareTo(Student s) {
		return this.name.compareTo(s.name); //for comparing String
	}
	public String toString() {
		return id+" "+name;
	}

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(9, "Amit"));
		list.add(new Student(0,"Rahul"));
		list.add(new Student(2,"Kiran"));
		Collections.sort(list); //uses comparable
		
		for(Student s:list) {
			System.out.println(s);
		}
		
		

	}

}
