package day4_assignment;

	// Base class
	class Vehicle {
	    void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	// Level 2
	class Four_wheeler extends Vehicle {
	    void fourWheelerInfo() {
	        System.out.println("This vehicle has four wheels.");
	    }
	}

	// Level 3
	class Petrol_Four_Wheeler extends Four_wheeler {
	    void fuelType() {
	        System.out.println("This four-wheeler runs on petrol.");
	    }
	}

	// Level 4
	class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler {
	    void seatingCapacity() {
	        System.out.println("This vehicle has 5 seats.");
	    }
	}

	// Level 5
	class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
	    void modelName() {
	        System.out.println("Model: Baleno");
	    }
	}


	public class Multilevel_inheritance {
	    public static void main(String[] args) {
	        Baleno_FiveSeater_Petrol_Four_Wheeler baleno = new Baleno_FiveSeater_Petrol_Four_Wheeler();
	        
	        baleno.start();                 // From Vehicle
	        baleno.fourWheelerInfo();       // From Four_wheeler
	        baleno.fuelType();              // From Petrol_Four_Wheeler
	        baleno.seatingCapacity();       // From FiveSeater_Petrol_Four_Wheeler
	        baleno.modelName();             // From Baleno_FiveSeater_Petrol_Four_Wheeler
	    }
	}
