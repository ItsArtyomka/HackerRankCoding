package org.artyomka.HackerRank.codingtests;

import java.util.Arrays;
import java.util.Scanner;

public class MultiSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");

        Arithmetic arithmetic = new Arithmetic();

        try {
            Integer[] integers = new Integer[values.length];

            for (int i = 0; i < values.length; i++) {
                integers[i] = Integer.valueOf(values[i]);
            }
            System.out.println(arithmetic.sum(integers));
        } catch (NumberFormatException exception) {
            System.out.println(arithmetic.sum(values));
        }
    }
}

class Arithmetic {
    public Integer sum(Integer[] ints) {
        return Arrays.stream(ints).mapToInt(Integer::intValue).sum();
    }

    public String sum(String[] strings) {
        return String.join("", strings);
    }
}
