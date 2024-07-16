/*
 * Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
 * If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
 * If they enter 0 then stop.
 * If he/ she scores :
 * Marks >=90 -> print “This is Good”
 * 89 >= Marks >= 60 -> print “This is also Good”
 * 59 >= Marks >= 0 -> print “This is Good as well”
 * 
 */

package JavaBasics;

import java.util.Scanner;

public class P9MarksEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int marks;

        do {
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter marks (out of 100): ");
                marks = scanner.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                }
            }
        } while (choice != 0);

        System.out.println("Program terminated.");
        scanner.close();
    }
}
