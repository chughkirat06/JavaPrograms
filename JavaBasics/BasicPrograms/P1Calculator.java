/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
*   1 : + (Addition) a + b
*   2 : - (Subtraction) a - b
*   3 : * (Multiplication) a * b
*   4 : / (Division) a / b
*   5 : % (Modulo or remainder) a % b
*   Calculate the result according to the operation given and display it to the user.
 */

package JavaBasics.BasicPrograms;

import java.util.*;

public class P1Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operation (+, -, *, /, %): ");
        String op = sc.next();
        int result = 0;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Invalid division");
                } else {
                    result = a / b;
                }
                break;
            case "%":
                if (b == 0) {
                    System.out.println("Invalid division");
                } else {
                    result = a % b;
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
        System.out.println(result);
    }
}
