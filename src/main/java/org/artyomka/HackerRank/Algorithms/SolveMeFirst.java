package org.artyomka.HackerRank.Algorithms;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class SolveMeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d + %d = %d", a,b,a+b);
    }
}
