package org.artyomka.HackerRank.codingtests;

import java.util.Arrays;
import java.util.Scanner;

public class MultiSum {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        // Formatting
        String[] values = line.split(" ");

        // Creating object of the class.
        Arithmetic arithmetic = new Arithmetic();

        try {
            // Array of integers
            Integer[] integers = new Integer[values.length];

            // Adding values into the array
            for (int i = 0; i < values.length; i++) {
                integers[i] = Integer.valueOf(values[i]);
            }

            // Output of the sum of the integers in the array
            System.out.println(arithmetic.sum(integers));
        } catch (NumberFormatException exception) { // IF input is not numbers
            System.out.println(arithmetic.sum(values));
        }
    }
}

class Arithmetic {
    // Adding all the integers in the array.
    public Integer sum(Integer[] ints) {
        return Arrays.stream(ints).mapToInt(Integer::intValue).sum();
    }

    // Concatenating all the strings in the array
    public String sum(String[] strings) {
        return String.join("", strings);
    }
}
