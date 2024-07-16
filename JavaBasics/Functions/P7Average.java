/*
 * Enter 3 numbers from the user & make a function to print their average.
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P7Average {
    public static float calculateAvg(int num1, int num2, int num3) {
        return (float) (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float avg = calculateAvg(num1, num2, num3);
        System.out.println("The average is: " + avg);
    }
}
