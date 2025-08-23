package exceptions;

public class Enum1 {
	enum level{High,Low,Medium}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		level l=level.Low;
		switch(l) {
		case Low:System.out.println("Low Level");
		break;
		
		case Medium:System.out.println("Medium Level");
		break;
		
		case High:System.out.println("High Level");
		break;
		}
		

	}

}
