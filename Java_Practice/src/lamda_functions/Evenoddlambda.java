package lamda_functions;
interface Even{
	boolean iseven(int num);
}
public class Evenoddlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even check=(num)->num%2==0;
		System.out.println(check.iseven(-2));

	}

}
