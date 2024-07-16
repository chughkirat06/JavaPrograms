/*
 * Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

 */
package JavaBasics.Arrays;

import java.util.Scanner;

public class P5ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input
        System.out.println("Enter array value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if it is ascending
        boolean isAscending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is in ascending order.");
        } else {
            System.out.println("Array is in descending order.");
        }
    }
}
