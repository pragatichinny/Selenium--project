package string;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello";
		System.out.println(st.charAt(2));
		System.out.println(st.codePointAt(1));  //returns ascii value
		System.out.println(st.codePointBefore(1));  //returns before char ascii value
		System.out.println(st.codePointCount(0,3));
		System.out.println(st.equals("welcome")); //Compare two string
		System.out.println(st.equalsIgnoreCase("hello")); //ignore the case of the char
		System.out.println(st.isBlank());
		System.out.println(st.isEmpty());
		System.out.println(st.lastIndexOf("o"));
		System.out.println(st.contains("lo"));
	}

}
