package Day8;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

    // Method to reverse a string using Stack
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    // Method to check balanced parentheses using Stack
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for(char ch : expr.toCharArray()) {
            if(ch == '(') {
                stack.push(ch);
            } else if(ch == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    // Method to convert decimal to binary using Stack
    public static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        while(num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
        StringBuilder binary = new StringBuilder();
        while(!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --------- Part 1: Stack of Integers -----------
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Original Stack: " + stack);

        // Pop top element
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // Peek current top
        System.out.println("Current top element: " + stack.peek());

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // --------- Part 2: Reverse a String -----------
        System.out.print("\nEnter a string to reverse: ");
        String inputStr = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(inputStr));

        // --------- Part 3: Balanced Parentheses -----------
        System.out.print("\nEnter an expression to check parentheses: ");
        String expr = sc.nextLine();
        if(isBalanced(expr)) {
            System.out.println("The expression is Valid.");
        } else {
            System.out.println("The expression is Invalid.");
        }

        // --------- Part 4: Decimal to Binary -----------
        System.out.print("\nEnter a decimal number to convert to binary: ");
        int decimal = sc.nextInt();
        System.out.println("Binary representation: " + decimalToBinary(decimal));

        sc.close();
    }
}
