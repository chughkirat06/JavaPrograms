package JavaBasics.Functions;

import java.util.Scanner;

public class P2NumberOperations {
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = addNumbers(num1, num2);
        System.out.println(String.format("Sum of %s and %s is: %s", num1, num2, sum));

        int product = multiplyNumbers(num1, num2);
        System.out.println(String.format("Product of %s and %s is: %s", num1, num2, product));
    }
}
