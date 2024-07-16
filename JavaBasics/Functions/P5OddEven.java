package JavaBasics.Functions;

import java.util.Scanner;

public class P5OddEven {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isEven = isEven(n);

        if (isEven) {
            System.out.println(String.format("%s is Even Number", n));
        } else {
            System.out.println(String.format("%s is Odd Number", n));
        }
    }
}
