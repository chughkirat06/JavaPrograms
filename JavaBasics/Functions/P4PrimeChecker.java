package JavaBasics.Functions;

import java.util.Scanner;

public class P4PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        if (isPrime) {
            System.out.println(String.format("%s is a Prime Number", n));
        } else {
            System.out.println(String.format("%s is not a Prime Number", n));
        }
    }
}
