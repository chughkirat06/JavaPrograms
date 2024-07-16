package JavaBasics.BasicPrograms;

import java.util.*;

public class P3PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result;
        int i = 1;
        while (i < 11) {
            result = num * i;
            System.out.println(String.format("%s x %s = %s", num, i, result));
            i++;
        }
    }
}
