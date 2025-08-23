package exceptions;
enum Day{Monday,Saturday}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today=Day.Saturday;
		Day today1=Day.Monday;
		System.out.println("Today is: "+today);
		System.out.println("Day after tommorow: "+today1);
	}

}
