
import java.util.Scanner;

public class Menstraul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Menstrual Tracker!");
        System.out.println("Please enter the start date of your last period (YYYY-MM-DD):");
        String startDate = scanner.nextLine();

        System.out.println("Please enter the average length of your menstrual cycle (in days):");
        int cycleLength = scanner.nextInt();

        System.out.println("Your menstrual cycle details:");
        System.out.println("Start Date: " + startDate);
        System.out.println("Average Cycle Length: " + cycleLength + " days");

        // Calculate and display the next expected period date
        System.out.println("Next Expected Period Date: " + calculateNextPeriod(startDate, cycleLength));
    }

    // Method to calculate the next expected period date based on the start date and cycle length
    public static String calculateNextPeriod(String startDate, int cycleLength) {
        String[] parts = startDate.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Add the cycle length to the start date to calculate the next period date
        day += cycleLength;
        if (day > 30) {
            day -= 30;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }
}
