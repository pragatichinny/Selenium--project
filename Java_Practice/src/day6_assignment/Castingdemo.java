package day6_assignment;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class Castingdemo {
    public static void main(String[] args) {
        Dog d = new Dog();    
        Animal a = d;         

        
        a.makeSound();        // Prints: Woof!

        // a.fetch(); // ❌ Compile-time error: Animal has no fetch() method

        ((Dog) a).fetch();    
    }
}
