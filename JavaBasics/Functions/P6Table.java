package JavaBasics.Functions;

import java.util.Scanner;

public class P6Table {
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(String.format("%s x %s = %s", n, i, product));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
    }
}
