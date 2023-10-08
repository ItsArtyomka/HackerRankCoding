package org.artyomka.HackerRank.thirty_days_of_code;

import java.util.Scanner;

public class D9_Recursion3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userNumber = scanner.nextInt();
        System.out.println(factorial(userNumber));
    }

    public static int factorial(int N) {
        if (N > 1 && N < 13){
            return N * factorial(N - 1);
        } else {
            return 1;
        }
    }
}
