package org.artyomka.HackerRank.Introduction;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaIntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= -100 && n <= 100) {
            System.out.println("Good Job");
        } else {
            System.out.println("Wrong Answer");
        }
    }
}
