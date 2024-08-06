/*
 * Problem Explanation
 * You have two arrays of integers, arrayA and arrayB, which are of the same length. You also have a startFlag that indicates whether to start comparing elements from odd or even indices. The
 * task is to compute the sum of differences between elements of arrayA and arrayB at the specified indices. The result determines the winner:
 * 
 * If the sum is greater than 0, arrayA wins.
 * If the sum is less than 0, arrayB wins.
 * If the sum is 0, it is a tie.
 * 
 * Example
 * Consider the following inputs:
 * 
 * A = [2, 2, 3]
 * B = [3, 1, 4]
 * startFlag = "odd"
 * Since the startFlag is "odd", you start comparing elements at odd indices (1st, 3rd, etc.):
 * 
 * Compare elements at indices 1 (0-based) and 3 (0-based):
 * (2-3) + (3-4) = -2
 * The sum is -2, so arrayB wins.
 * 
 */

class Result {
    public static String compareArrays(int[] arrayA, int[] arrayB, String startFlag) {

        int sum = 0;

        // Determine start index
        int startIndex = startFlag.equalsIgnoreCase("odd") ? 0 : 1;

        // Iterate over the arrays and calculate sum
        for (int i = startIndex; i < arrayA.length; i += 2) {
            sum += (arrayA[i] - arrayB[i]);
        }

        // Determine the winner
        if (sum > 0) {
            return "A";
        } else if (sum < 0) {
            return "B";
        } else {
            return "Tie";
        }
    }
}

public class StartFlagProgram {
    public static void main(String[] args) {
        int[] A = { 2, 2, 3 };
        int[] B = { 3, 1, 4 };

        String startFlag = "odd";

        String result = Result.compareArrays(A, B, startFlag);

        System.out.println(result);
    }
}
