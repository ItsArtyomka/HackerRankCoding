package org.artyomka.HackerRank.Introduction;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaStdinStdout_I {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();

        // Output
        System.out.println(myInt);
        System.out.println(myInt1);
        System.out.println(myInt2);
    }
}
