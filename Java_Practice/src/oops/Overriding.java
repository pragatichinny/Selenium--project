package oops;
class Animal8{
	 void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dogii extends Animal8{
	void makeSound() {
		System.out.println("Dog barks.");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal8 ani=new Animal8();
		Dogii dog=new Dogii();
		
		ani.makeSound();
		dog.makeSound();

	}

}
