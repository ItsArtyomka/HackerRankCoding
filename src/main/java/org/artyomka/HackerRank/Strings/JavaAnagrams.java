package org.artyomka.HackerRank.Strings;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram (String a, String b) {
        // Check if the length are the same
        if (a.length() != b.length()) {
            return false;
        }

        // To Upper Case
        String A = a.toUpperCase();
        String B = b.toUpperCase();

        for (int i = 0; i < A.length(); i++) {
            // Removes all chars in 'A' from 'B'
            B = B.replaceFirst(A.charAt(i) + "", "");
        }

        // If B is empty, that means that the input strings are anagrams
        return B.isEmpty();
    }

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        // Closing the scanner
        scanner.close();

        // Output
        boolean ans = isAnagram(a, b);
        System.out.println((ans) ? "Anagrams" : "Not Anagrams");
    }
}
