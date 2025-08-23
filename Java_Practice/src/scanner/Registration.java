package scanner;
import java.util.*;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your Phone number");
		long num=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your email");
		String email=sc.nextLine();
		System.out.println("Enter username");
		String username=sc.nextLine();
		System.out.println("Enter password");
		String password=sc.nextLine();
		
		System.out.println("Registration details are.....");
		System.out.println("name:"+name);
		System.out.println("Phone number:"+num);
		System.out.println("Email:"+email);
		System.out.println("username:"+username);
		System.out.println("password:"+password);
	}

}
