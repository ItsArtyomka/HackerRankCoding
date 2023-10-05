package org.artyomka.HackerRank.thirty_days_of_code;

import java.util.Scanner;

public class D5_Loops {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Logic
        for (int i = 1; i < 11; i++) {
            int sum = N * i;
            System.out.println(N + " x " + i + " = " + sum);
        }
    }
}
