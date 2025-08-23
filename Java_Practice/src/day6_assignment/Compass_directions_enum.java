package day6_assignment;
import java.util.Scanner;

enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class Compass_directions_enum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a direction (NORTH, SOUTH, EAST, WEST): ");
        String input = scanner.nextLine().toUpperCase();

        try {
            Direction dir = Direction.valueOf(input);

            // Use switch to print movement
            switch (dir) {
                case NORTH:
                    System.out.println("Move north");
                    break;
                case SOUTH:
                    System.out.println("Move south");
                    break;
                case EAST:
                    System.out.println("Move east");
                    break;
                case WEST:
                    System.out.println("Move west");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid direction entered. Please use NORTH, SOUTH, EAST, or WEST.");
        }

        scanner.close();
    }
}
