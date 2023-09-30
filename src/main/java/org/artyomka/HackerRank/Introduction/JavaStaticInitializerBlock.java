package org.artyomka.HackerRank.Introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        int H = scanner.nextInt();
        int B = scanner.nextInt();

        // Logic and Output
        if (H <= 0 || B <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(H * B);
        }

        // Closing the Scanner
        scanner.close();
    }
}
