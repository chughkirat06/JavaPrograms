/*
 * Write a function that takes in the radius as input and returns the circumference of a circle.
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P10Circumference {
    public static double calculateCircumference(float radius) {
        return (double) 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double result = calculateCircumference(radius);
        System.out.println("Circumference of the circle is: " + result);
    }
}
