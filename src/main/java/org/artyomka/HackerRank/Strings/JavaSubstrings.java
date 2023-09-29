package org.artyomka.HackerRank.Strings;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@SuppressWarnings("ConstantValue")
@Author("Artyomka")
public class JavaSubstrings {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        // Constrains
        boolean regex = s.matches("[a-zA-Z]+");
        final byte MAX_STRING_LENGTH = 100;
        final byte MIN_STRING_LENGTH = 1;
        final boolean STRING_LENGTH_RANGE = s.length() >= MIN_STRING_LENGTH && s.length() <= MAX_STRING_LENGTH;

        // Logic && Output
        if(regex && STRING_LENGTH_RANGE) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            System.out.printf("%s",s.substring(start,end));
        }

        // Closing the Scanner
        scanner.close();
    }
}
