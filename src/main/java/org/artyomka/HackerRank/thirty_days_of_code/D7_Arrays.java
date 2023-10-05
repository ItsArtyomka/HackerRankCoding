package org.artyomka.HackerRank.thirty_days_of_code;

import java.util.Scanner;

public class D7_Arrays {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        // Array Input
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Reversing the Array
        for (int j = N - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
    }
}
