package org.artyomka.HackerRank.Introduction;

import java.util.Scanner;

@SuppressWarnings("ReassignedVariable")
public class JavaEOF {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        // Line number
        int line = 1;

        // Logic and Output
        while(scanner.hasNext()) {
            System.out.println(line + " " + scanner.nextLine());
            line += 1;
        }

        // Closing the Scanner
        scanner.close();
    }
}
