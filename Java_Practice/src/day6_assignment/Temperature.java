package day6_assignment;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

       
        double fahrenheit = celsius * 9 / 5 + 32;
        
        int fahrenheitTruncated = (int) fahrenheit;

        System.out.println("Fahrenheit (precise): " + fahrenheit);
        System.out.println("Fahrenheit (truncated to int): " + fahrenheitTruncated);

    }
}
