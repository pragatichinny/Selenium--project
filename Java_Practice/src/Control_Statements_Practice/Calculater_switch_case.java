package Control_Statements_Practice;

public class Calculater_switch_case {

	public static void main(String[] args) {
		char Operator='/';
		int Num1=20;
		int Num2=20;
		int Result;
		
		switch(Operator) {
		case'+':
			Result=Num1+Num2;
			System.out.println("Result="+Result);
			break;
		case'-':
			Result=Num1-Num2;
			System.out.println("Result="+Result);
			break;
		case'*':
			Result=Num1*Num2;
			System.out.println("Result="+Result);
			break;
		case'/':
			Result=Num1/Num2;
			System.out.println("Result="+Result);
			break;
		default:System.out.println("Invalid Input");
			
		}

	}

}
