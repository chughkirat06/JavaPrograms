/*
 * Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P14Power {
    public static double calculatePower(int x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter power value: ");
        int n = sc.nextInt();

        double result = calculatePower(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);

    }
}
