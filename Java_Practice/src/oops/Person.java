package oops;

public class Person {   //encapsulation_practice
	
		private String name="pragati";
		private int age=29;
		public String setName() {
			return name;
		}
		
		public void getNameage() {
			System.out.println(name);
			System.out.println(age);
		}
		public int setage() {
			return age;
		}
		
	
		public static void main(String[] args) {
			Person p=new Person();
			p.getNameage();
			
	}

}
