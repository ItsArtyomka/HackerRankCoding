package org.artyomka.HackerRank.thirty_days_of_code;

import java.util.Scanner;

public class D6_LetsReview {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        // Tests Constraints
        for (int tests = 0; tests < t; tests++) {
            String string = scanner.nextLine();

            // Even Index
            for (int i = 0; i < string.length(); i++) {
                if (i % 2 == 0)
                    System.out.print(string.charAt(i));
            }
            System.out.print(" ");

            // Odd Index
            for (int j = 0; j < string.length(); j++) {
                if (j % 2 != 0)
                    System.out.print(string.charAt(j));
            }
            System.out.println();
        }
    }
}
