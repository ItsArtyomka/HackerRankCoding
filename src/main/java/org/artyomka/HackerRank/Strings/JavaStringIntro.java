package org.artyomka.HackerRank.Strings;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaStringIntro {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Input
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        // Length
        int A_Length = A.length();
        int B_Length = B.length();
        // Capitalised Letter
        String capitalisedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalisedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Output
        // Total Length
        System.out.printf("%d%n", A_Length + B_Length);
        // Lexicographical Comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // CamelCase
        System.out.printf("%s %s", capitalisedA, capitalisedB);
    }
}
