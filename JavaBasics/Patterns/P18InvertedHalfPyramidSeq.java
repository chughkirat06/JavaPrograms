/*
    11111
    222
    33
    4

 */
package JavaBasics.Patterns;

public class P18InvertedHalfPyramidSeq {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
