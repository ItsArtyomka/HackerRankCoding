package org.artyomka.HackerRank.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        BigInteger integer = new BigInteger(num);

        // Output
        if (integer.isProbablePrime(1)) { // Check if prime with probability of 1 (certain).
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
