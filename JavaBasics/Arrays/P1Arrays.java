package JavaBasics.Arrays;

import java.util.*;

public class P1Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];

        // Input
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // Output
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}
