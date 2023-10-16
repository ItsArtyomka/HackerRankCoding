package org.artyomka.HackerRank.Strings;

import java.util.Scanner;

public class JavaValidUsernameRegularExpression {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            // Username Checking
            String username = scanner.nextLine();
            if (username.matches(UsernameValidator.usernameRegEx)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
class UsernameValidator {
    // RegEx for the Username
    public static final String usernameRegEx = "^(?=[a-zA-Z])\\w{8,30}$";
}
