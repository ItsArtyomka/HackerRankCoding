package org.artyomka.HackerRank.Introduction;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaStdinStdout_II {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        // Output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: "+ i);
    }
}
