/*
 * Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P13Count {
    public static void main(String[] args) {
        int countPositives = 0;
        int countNegatives = 0;
        int countZeroes = 0;

        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.println("Enter number (enter -999 to stop): ");
        do {
            numb = sc.nextInt();
            if (numb == -999) {
                break;
            }

            if (numb == 0) {
                countZeroes++;
            }

            if (numb > 0) {
                countPositives++;
            }

            if (numb < 0) {
                countNegatives++;
            }
        } while (true);

        System.out.println("Positive numbers count: " + countPositives);
        System.out.println("Negative numbers count: " + countNegatives);
        System.out.println("Zeroes numbers count: " + countZeroes);
    }
}
