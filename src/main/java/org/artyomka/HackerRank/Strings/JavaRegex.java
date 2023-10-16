package org.artyomka.HackerRank.Strings;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        // IP Pattern
        final String IP_REGEX = "(0?[0-9]?[0-9]|1?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5[0-5])\\.(0?[0-9]?[0-9]|1?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5[0-5])\\.(0?[0-9]?[0-9]|1?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5[0-5])\\.(0?[0-9]?[0-9]|1?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5[0-5])";

        // Logic
        while (scanner.hasNext()) {
            String IP = scanner.next();
            System.out.println(IP.matches(IP_REGEX));
        }
    }
}
