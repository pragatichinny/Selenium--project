package day6_assignment;

public class CompoundAssignmentDemo {
    public static void main(String[] args) {
        int x = 5;

        // 1. Direct assignment with different types:
        // x = x + 4.5;  // ❌ Compile-time error!
        // Reason: x + 4.5 promotes x to double (widening), result is double.
        // Assigning double → int without explicit cast is illegal in Java
        // because it’s a narrowing conversion that could lose data.

        // 2. Compound assignment:
        x += 4.5; // ✅ Compiles!
        // Behind the scenes: x = (int)(x + 4.5);
        // Compound assignment automatically casts back to int.
        // The fractional part (.5) is truncated, so result is 9.

        System.out.println(x); // Prints: 9
    }
}
