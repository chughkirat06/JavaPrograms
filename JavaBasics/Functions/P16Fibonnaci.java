/*
 * Write a program to print Fibonacci series of n terms where n is input by user 
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P16Fibonnaci {
    public static void fibonnaci(int n) {
        int a = 0, b = 1;

        if (n >= 1 || n == 0) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms in fibonacci series: ");
        int n = sc.nextInt();
        fibonnaci(n);
    }
}
