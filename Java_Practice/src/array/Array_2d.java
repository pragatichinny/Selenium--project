package array;

public class Array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] arr = {{10,20},{30,40,50},{60}};
		//System.out.println(arr[1][2]);
		//System.out.println(arr[2][0]);
		int [][] arr=new int [4][2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
