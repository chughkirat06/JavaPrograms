/*
 * Write a function which takes in 2 numbers and returns the greater of those two.
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P9Greater {
    public static int getGreater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("First and second number both are equal.");
        } else {
            int greater = getGreater(num1, num2);
            System.out.println("The greater number is: " + greater);
        }
    }
}
