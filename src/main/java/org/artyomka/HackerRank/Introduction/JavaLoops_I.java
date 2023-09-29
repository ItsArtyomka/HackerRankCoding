package org.artyomka.HackerRank.Introduction;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaLoops_I {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Logic
        for (int i = 1; i < 11; i++) {
            int sum = N * i;
            System.out.printf("%1d%s%d%s%d%n",N, " x ", i, " = ", sum);
        }
    }
}
