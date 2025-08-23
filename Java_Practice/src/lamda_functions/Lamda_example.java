package lamda_functions;
interface Greeting{
	void sayHello();
}
public class Lamda_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greet=()->System.out.println("Hello students");
		greet.sayHello();

	}

}
