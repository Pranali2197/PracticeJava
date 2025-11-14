package Tasks;

import java.util.Scanner;

public class Task6_numberof_days {
    //Write a Java program that takes a month number (1-12)
    // and prints the number of days in that month using a switch statement.
    // Handle February separately for leap years.
    //a year is a leap year if it is divisible by 4,
    // but not by 100, unless it is also divisible by 400.
    //Input -> 1 to 12, and Year = 2025
    //-> 1 and year 2025 -> 31 Days
    //-> 2 and year 2025 -> 28 Days, ( 2025 leap)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = scanner.nextInt();

        System.out.println("Enter MOnth");
        int month =scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("31 days");
                break;

            case 2:








        }



        {



        }
    }










}
