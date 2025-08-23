package exceptions;
enum Weekdays{Monday,Tuesday,Wednesday,Thusday,Friday,Saturday,Sunday};
public class Enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekdays day = Weekdays.Sunday;
		
		switch(day) {
		case Monday:System.out.println("Today is monday");
		break;
		
		case Tuesday:System.out.println("Today is tuesday");
		break;
		
		case Wednesday:System.out.println("today is wednesday");
		break;
		
		case Thusday:System.out.println("today is Thusday");
		break;
		
		case Friday:System.out.println("today is Friday");
		break;
		
		case Saturday:System.out.println("today is Saturday");
		break;
		
		case Sunday:System.out.println("today is Sunday");
		break;
		
		}
		if(day==Weekdays.Saturday |day==Weekdays.Sunday) {
			System.out.println("Weekend");
		}
		else
			System.out.println("Weekday");

	}

}
