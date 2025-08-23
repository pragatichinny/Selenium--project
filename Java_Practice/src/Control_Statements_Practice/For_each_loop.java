package Control_Statements_Practice;

public class For_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}*/

		
		//To print right triangle *
		/*for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}*/
		
		//To print mirror for right triangle *
		
		/*for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}*/
		
		
		// to print  pyramid
		for(int i=1;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
			}
			System.out.println();
		}
				
		
		//print table
		/*for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j +"\t");
			}
			System.out.println();
		}*/
	}

}
