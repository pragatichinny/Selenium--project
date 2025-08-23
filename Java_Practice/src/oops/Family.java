package oops;

class Mohan {
	void surname() {
		System.out.println("Sharma");
	}
	
	void flat() {
		System.out.println("2bhk flat");
	}
	void car() {
		System.out.println("Baleno car");
	}
}
class Sohan extends Mohan{
	void bike() {
		System.out.println("Pulsar");
	}
	void job() {
		System.out.println("Software");
	}
}
public class Family {  //Inheritance pratice

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Sohan son=new Sohan();
			System.out.print("Sohan ");son.surname();
			son.flat();
			son.car();
			son.bike();
			son.job();

	}

}
