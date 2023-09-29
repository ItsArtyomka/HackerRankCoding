package org.artyomka.HackerRank.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());

        // Output
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        // Closing the Scanner
        scanner.close();
    }
}
