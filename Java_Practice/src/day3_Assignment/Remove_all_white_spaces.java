package day3_Assignment;

public class Remove_all_white_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString="This is a string with whitespaces. ";
		System.out.println("Original String: \""+originalString+ "\"");
		
		String modifiedString=originalString.replaceAll("\\s","");
		
		System.out.println("String without whitespace: \""+modifiedString+"\"");

	}

}
