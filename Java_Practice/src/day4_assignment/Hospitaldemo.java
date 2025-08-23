package day4_assignment;


	// Superclass
	class Hospital {
	    String hospitalName = "City Care Hospital";
	    String location = "Downtown";

	    void showHospitalInfo() {
	        System.out.println("Hospital Name: " + hospitalName);
	        System.out.println("Location: " + location);
	    }
	}

	// Subclass
	class Patient extends Hospital {
	    String patientName;
	    int age;

	    Patient(String patientName, int age) {
	        this.patientName = patientName;
	        this.age = age;
	    }

	    void showPatientDetails() {
	        System.out.println("Patient Name: " + patientName);
	        System.out.println("Age: " + age);
	        System.out.println("Hospital Info from Superclass:");
	        super.showHospitalInfo(); // Accessing method from Hospital class
	        System.out.println("Hospital Name from Superclass variable: " + super.hospitalName);
	    }
	}

	public class Hospitaldemo {
	    public static void main(String[] args) {
	        Patient patient1 = new Patient("Alice", 30);
	        patient1.showPatientDetails();
	    }
	}
