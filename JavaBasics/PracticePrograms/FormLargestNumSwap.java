/*
 * Given an integer, the goal is to create the largest possible number by swapping adjacent digits that have the same parity (both odd or both even).
 * 
 */

class LargestNumberBySwapping {
    public static int getLargestNumber(int number) {
        // Convert the input number to a charcater array
        char[] numStr = Integer.toString(number).toCharArray();
        boolean swapFlag;

        do {
            swapFlag = false;
            for (int i = 0; i < numStr.length - 1; i++) {
                if (canSwap(numStr[i], numStr[i + 1]) && numStr[i] < numStr[i + 1]) {
                    char temp = numStr[i];
                    numStr[i] = numStr[i + 1];
                    numStr[i + 1] = temp;
                    swapFlag = true;
                }
            }
        } while (swapFlag);

        return Integer.parseInt(new String(numStr));
    }

    private static boolean canSwap(char a, char b) {
        return (isOdd(a) && isOdd(b)) || (isEven(a) && isEven(b));
    }

    private static boolean isOdd(char c) {
        int digit = c - '0';
        return digit % 2 != 0;
    }

    private static boolean isEven(char c) {
        int digit = c - '0';
        return digit % 2 == 0;
    }
}

public class FormLargestNumSwap {
    public static void main(String[] args) {
        int input = 597683;
        int largestNumber = LargestNumberBySwapping.getLargestNumber(input);
        System.out.println(largestNumber);
    }
}
