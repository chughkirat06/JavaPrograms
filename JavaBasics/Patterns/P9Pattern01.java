/*
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */
package JavaBasics.Patterns;

public class P9Pattern01 {
    public static void main(String[] args) {
        int r;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    r = 1;
                } else {
                    r = 0;
                }
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }

}
