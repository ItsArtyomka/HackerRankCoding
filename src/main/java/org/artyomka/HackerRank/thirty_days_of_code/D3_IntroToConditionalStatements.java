package org.artyomka.HackerRank.thirty_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings({"DuplicatedCode", "ConstantValue"})
public class D3_IntroToConditionalStatements {
    public static void main(String[] args) throws IOException {
        // Input With Try-with-resources
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            // Input
            int N = Integer.parseInt(bufferedReader.readLine().trim());

            // Logic
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && (N > 2 && N < 6)) {
                System.out.println("Not Weird");
            } else if (N % 2 == 0 && (N > 6 && N < 21)) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && (N > 20)) {
                System.out.println("Not Weird");
            }
        }
    }
}
