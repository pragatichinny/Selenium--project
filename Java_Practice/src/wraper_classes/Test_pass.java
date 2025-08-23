package wraper_classes;

public class Test_pass {
	

	public static void changepassword(String password) {
		password="NewPassword";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password="OldPassword";
		changepassword(password);
		System.out.println("password: "+password);

	}

}
