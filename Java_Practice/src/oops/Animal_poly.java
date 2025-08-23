package oops;
class Animal5{
	void eat() {
		System.out.println("eating");
	}
	void sound() {
		System.out.println("Sound");
	}
}

class Dog1 extends Animal5{
	void eat() {
		System.out.println("Eats:Royal cacin");
	}
	void sound() {
		System.out.println("Sound:Barking");
	}
}

class Tiger extends Animal5{
	void eat() {
		System.out.println("eat:Meat");
	}
	void sound() {
		System.out.println("Sound:Roarr");
	}
}
public class Animal_poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Dog***");
		Dog1 max=new Dog1();
		max.eat();
		max.sound();
		System.out.println("***Tiger***");
		Tiger sher=new Tiger();
		sher.eat();
		sher.sound();

	}

}
