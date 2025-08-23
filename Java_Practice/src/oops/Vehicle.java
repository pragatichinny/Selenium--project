package oops;
class Vehicle1{
	void wheeler(String Wheel) {
		System.out.println("Wheel= "+Wheel);
	}
	void seat(String seats) {
		System.out.println("Seats= "+seats);
	}
	void type(String fuel) {
		System.out.println("Fuel= "+fuel);
	}
}
class Car extends Vehicle1{
	
	void Brand(String brand) {
		System.out.println("Brand= "+brand);
	}
}
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		System.out.println("****car*****");
		
		car.seat("4 Seater");
		car.type("Petrol Car");
		car.wheeler("4 Seater");
		car.Brand("Baleno car");

	}

}
