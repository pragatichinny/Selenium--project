package day6_assignment;
import java.util.Scanner;

enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Day_of_week_enum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String input = scanner.nextLine().toUpperCase();

        try {
            DaysOfWeek day = DaysOfWeek.valueOf(input);

            System.out.println("Position (ordinal) of " + day + " is: " + day.ordinal());

            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(day + " is a weekend!");
                    break;
                default:
                    System.out.println(day + " is a weekday.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }

        scanner.close();
    }
}

