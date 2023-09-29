package org.artyomka.HackerRank.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("deprecation")
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        // Output
        // US Currency
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));

        // Indian Currency
        NumberFormat currencyIN = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.println("India: " + currencyIN.format(payment));

        // Chinese Currency
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));

        // French Currency
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

        // Closing the Scanner
        scanner.close();
    }
}
