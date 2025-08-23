package Day7;


	public class CallByReference {
	    public static void increment(int[] num) {
	        num[0] = num[0] + 1;
	    }

	    public static void main(String[] args) {
	        int[] x = {10};  // array wrapper
	        System.out.println("Before increment: " + x[0]);
	        increment(x);
	        System.out.println("After increment: " + x[0]);
	    }
	}


