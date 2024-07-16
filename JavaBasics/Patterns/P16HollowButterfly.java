/*
    *        *
    **      **
    * *    * *
    *  *  *  *
    *   **   *
    *   **   *
    *  *  *  *
    * *    * *
    **      **
    *        *
 */
package JavaBasics.Patterns;

public class P16HollowButterfly {
    public static void main(String[] args) {
        int n = 5;

        // Up
        for (int i = 1; i <= n; i++) {
            // Left Side - Up
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Middle Space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // Right Side - Up
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Down
        for (int i = n; i >= 1; i--) {
            // Left Side - Down
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Middle Space
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // Right Side - Down
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
