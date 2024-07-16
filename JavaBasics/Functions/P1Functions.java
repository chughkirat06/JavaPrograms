package JavaBasics.Functions;

import java.util.Scanner;

public class P1Functions {
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printName(name);
    }

}
