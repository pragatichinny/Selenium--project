package oops;
class Animal1
{
	void eat(String eats) {
		System.out.println("Eats="+eats);
	}
	void sound(String sd) {
		System.out.println("Sound="+sd);
	}
}

class Dog extends Animal1{
	void lives(String live) {
		System.out.println("Lives in the "+live);
	}
}

class Puppy extends Dog{
	void breed(String bd) {
		System.out.println("Breed of Dogis "+bd);
    }
}
	
public class Animal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Dog dog=new Dog();
		System.out.println("***Dog***");
		dog.eat("Royal canin");
		dog.sound("Barking");
		dog.eat("city");
		
		System.out.println("***Cat***");
		dog.eat("Fish");
		dog.sound("Meow");
		dog.eat("city");
		
		System.out.println("***Cow***");
		dog.eat("Grass");
		dog.sound("mooo");
		dog.eat("Farm");
		
		Puppy max=new Puppy();
		System.out.println("***Puppy***");
		max.sound("barking");
		max.lives("city");
		max.breed("Lab");

	}

}
