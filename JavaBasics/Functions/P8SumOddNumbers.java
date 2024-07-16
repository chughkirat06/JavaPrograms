/*
 * Write a function to print the sum of all odd numbers from 1 to n.
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P8SumOddNumbers {
    public static int sumOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of odd numbers is: " + sumOddNumbers(n));
    }
}
