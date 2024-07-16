/*
 * Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
 */
package JavaBasics.Functions;

import java.util.Scanner;

public class P11VoteEligibility {
    public static boolean canVote(int age) {
        if (age > 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age for vote eligibility: ");
        int age = sc.nextInt();
        boolean canVote = canVote(age);
        if (canVote) {
            System.out.println("You can vote.");
        } else {
            System.out.println("Sorry may be next year.");
        }
    }
}
