package array;

public class Min_of_arrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] per= {86.7f,98.7f,79};
		float min=per[0];
		for(int i=0;i<per.length;i++) {
			if(per[i]<min) {
				min=per[i];
			}
		}
		System.out.println("Lowest percentage="+min);


	}

}
