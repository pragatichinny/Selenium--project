package oops;
abstract class Animal9{
	void eat() {
		System.out.println("Eating");
	}
	abstract void sound();  //no need to write method body
}
class Dog6 extends Animal{
	void sound() {
		System.out.println("sound=Barking");  //for abstarct method it is important to specify method in child class
	}
}

class Tiger5 extends Animal9{
	void sound() {
		System.out.println("sound=Roarr");  //for abstarct method it is important to specify method in child class
	}
}
public class Abstract_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Dog***");
		Dog6 max=new Dog6();
		//max.eat();
		max.sound();
		System.out.println("***Tiger***");
		Tiger sher=new Tiger();
		sher.eat();
		sher.sound();

	}

}
