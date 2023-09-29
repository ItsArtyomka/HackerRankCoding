package org.artyomka.HackerRank.Introduction;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaOutputFormatting {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        // Output
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int d = scanner.nextInt();;
            System.out.printf("%-15s%03d%n",str,d);
        }
        System.out.println("================================");
    }
}
