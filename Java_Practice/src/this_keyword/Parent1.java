package this_keyword;

class Parent{
// interface_practice
	interface Parent2{
		void flat();
		void car();
	}
	interface Parent3{
		void flat();
		void bike();
	}
	class Child implements Parent2,Parent3{
		public void bike(){
			System.out.println("Sports bike");
		}
		public void flat(){
			System.out.println("2BHK flat");
		}
		@Override
		public void car() {
			// TODO Auto-generated method stub
			
		}
	}
	public class Parent1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
