// print sum of natural numbers
package JavaBasics.BasicPrograms;

import java.util.*;

public class P5SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= numb; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
