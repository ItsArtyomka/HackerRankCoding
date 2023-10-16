package org.artyomka.HackerRank.thirty_days_of_code;

import java.util.Scanner;

public class D6_LetsReview {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        // Logic
        while (T > 0) {
            String s = scanner.next();
            char[] sArr = s.toCharArray();

            // Even Index
            for (int i = 0; i < sArr.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(sArr[i]);
                }
            }

            // Gap
            System.out.print(" ");

            // Odd Index
            for (int i = 0; i < sArr.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(sArr[i]);
                }
            }
            System.out.println();
            T--;
        }
    }
}
