/*
 * Write a function that calculates the Greatest Common Divisor of 2 numbers. 
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P15Divisor {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swap, if a < b
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int gcd = findGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
    }
}
