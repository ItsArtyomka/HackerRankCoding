package org.artyomka.HackerRank.Introduction;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaLoops_II {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        // Logic
        for (int i = 0; i < queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum = sum + (int) (Math.pow(2, j)) * b;
                System.out.printf("%d ",sum);
            }
            System.out.printf("%n");
        }
    }
}
