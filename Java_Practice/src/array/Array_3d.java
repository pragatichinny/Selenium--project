package array;

public class Array_3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ref r c
		int[][][] arr= {{{10,20},{30,40}},
			            {{10,20,30},{10,20,30},{10,20,30,40}}};
		int[][][] ar=new int[2][3][3];
		System.out.println(arr[1][2][2]);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
   
	}

}
