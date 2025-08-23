package array;

public class Max_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] per= {86.7f,98.7f,79};
		float max=per[0];
		for(int i=0;i<per.length;i++) {
			if(per[i]>max) {
				max=per[i];
			}
		}
		System.out.println("higest percentage="+max);

	}

}
