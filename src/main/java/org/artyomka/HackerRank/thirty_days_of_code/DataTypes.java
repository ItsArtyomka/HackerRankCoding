package org.artyomka.HackerRank.thirty_days_of_code;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        // Variables
        int i, i1;
        double d, d1;
        String s, s1;

        // Int
        i = 4;
        i1 = scanner.nextInt();

        // Double
        d = 4.0;
        d1 = scanner.nextDouble();

        // Input Reset
        scanner.nextLine();

        //String
        s = "HackerRank ";
        s1 = scanner.nextLine();

        // Output
        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + s1);
    }
}
