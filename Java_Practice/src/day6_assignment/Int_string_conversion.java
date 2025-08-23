package day6_assignment;

public class Int_string_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalInt = 12345;
        System.out.println("Original int: " + originalInt);

        String intAsString = String.valueOf(originalInt);
        System.out.println("Converted to String: " + intAsString);

        try {
            int parsedInt = Integer.parseInt(intAsString);
            System.out.println("Converted back to int: " + parsedInt);

            String invalidString = "abc";
            System.out.println("\nAttempting to parse invalid string: \"" + invalidString + "\"");
            int invalidParsedInt = Integer.parseInt(invalidString); 
            System.out.println("This line will not be reached if exception occurs.");

        } catch (NumberFormatException e) {
            System.err.println("Error: NumberFormatException occurred. The string could not be parsed as an integer.");
            System.err.println("Exception message: " + e.getMessage());
        }

	}

}
