/*
 * Take an array as input from user. Search for a given number x and print the index at which the number occurs.
 * (Linear search)
 */
package JavaBasics.Arrays;

import java.util.Scanner;

public class P2FindNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = sc.nextInt();

        // Declare array
        int[] arr = new int[size];

        // Input array values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        System.out.print("Enter the value which you want to find: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println(x + " is at " + i + " index.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(x + " is not present in the array.");
        }
    }
}
