package array;

public class Single_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {20,21,20,22,24}; //dynamic array
		int arr[]=new int[3];  //static array
		System.out.println(age[1]);
		
		//to access whole array
		for(int b:age) {
			System.out.println(b);
		}
        for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}

	}

}
