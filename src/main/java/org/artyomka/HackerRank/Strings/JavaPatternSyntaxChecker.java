package org.artyomka.HackerRank.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPatternSyntaxChecker {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        // Logic
        for (int i = 0; i < N; i++) {
            // Pattern Input
            String pattern = sc.nextLine();

            // Null Pattern Check
            if (pattern == null) {
                System.out.println("Invalid");
            }

            // Pattern Process
            try {
                if (pattern != null) {
                    Pattern.compile(pattern);
                }
                System.out.println("Valid");
            } catch(PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
