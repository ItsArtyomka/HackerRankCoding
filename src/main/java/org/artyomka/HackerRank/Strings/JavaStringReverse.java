package org.artyomka.HackerRank.Strings;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        // Input
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        // Reversing a String A
        stringBuilder.append(A);
        String reversedA = String.valueOf(stringBuilder.reverse());

        // Logic to check if a string is a palindrome.
        if (A.equals(reversedA)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Closing the Scanner
        scanner.close();
    }
}
