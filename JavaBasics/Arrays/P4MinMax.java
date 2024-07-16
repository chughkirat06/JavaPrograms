/*
 * Find the maximum & minimum number in an array of integers. 
 */

package JavaBasics.Arrays;

public class P4MinMax {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 1, 78, 100, 33, 12, 16 };

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}
