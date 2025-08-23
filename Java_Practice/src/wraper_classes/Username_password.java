package wraper_classes;
class User_pass{
	String username;
	String password;
}
public class Username_password {//pass by reference
	static void update_credentials(User_pass up) {
		up.username="Pragati";
		up.password="pass@123";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_pass up=new User_pass();
		up.username="User123";
		up.password="user@123";
		update_credentials(up);
		System.out.println("Username: "+up.username);
		System.out.println("Password: "+up.password);

	}

}
