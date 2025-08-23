package type_casting;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening
		int num=10;
		System.out.println("value of num="+num);
		float d=num;
		System.out.println("value of d="+d);
		
		//narrowing
		int a=(int)d;
		System.out.println("value of a="+a);

		
		
		int val=150;
		byte bt=(byte)val;   //data loss
		System.out.println("value of bt="+bt);  
	}

}
