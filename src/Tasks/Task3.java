package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Kids -> A -> Excellent, F -> Fail
        // Create a program that will basically be based on
        // the alphabet or based on the grade.
        // You will give the message to the kid if you got
        // excellent, very good, good, needs improvement,
        // fail, or invalid grade.

        Scanner scanner = new Scanner(System.in);{
            System.out.println("Enter Grade");
            String input= scanner.nextLine();
            char grade = input.charAt(0);
            //int grade = scanner.nextInt();
            switch (grade){

                case 'A':
                    System.out.println("excellent");
                break;
                case 'B':
                    System.out.println("very good");
                    break;
                case 'C':
                    System.out.println("Good");
                    break;
                case 'D':
                    System.out.println("needs improvement");
                default:
                    System.out.println("Fail,Invalid grade");
            }




        }




        }







    }

