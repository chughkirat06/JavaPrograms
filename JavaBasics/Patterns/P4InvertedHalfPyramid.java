/*
    ****
    ***
    **
    *
 */
package JavaBasics.Patterns;

public class P4InvertedHalfPyramid {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
