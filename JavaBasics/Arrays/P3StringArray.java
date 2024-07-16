/*
 * Take an array of names as input from the user and print them on the screen.
 */

package JavaBasics.Arrays;

import java.util.Scanner;

public class P3StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter names here: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
