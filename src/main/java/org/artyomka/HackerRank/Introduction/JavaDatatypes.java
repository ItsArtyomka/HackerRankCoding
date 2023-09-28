package org.artyomka.HackerRank.Introduction;

import org.artyomka.Annotations.Author;

import java.util.Scanner;

@Author("Artyomka")
public class JavaDatatypes {
    // Byte
    private static final byte MAX_BYTE = Byte.MAX_VALUE;
    private static final byte MIN_BYTE = Byte.MIN_VALUE;

    // Short
    private static final short MAX_SHORT = Short.MAX_VALUE;
    private static final short MIN_SHORT = Short.MIN_VALUE;

    // Int
    private static final int MAX_INT = Integer.MAX_VALUE;
    private static final int MIN_INT = Integer.MIN_VALUE;

    // Long
    private static final long MAX_LONG = Long.MAX_VALUE;
    private static final long MIN_LONG = Long.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte T = scanner.nextByte();
        for (int i = 0; i < T; i++) {
            try {
                long testNumber = scanner.nextLong();
                System.out.printf("%s can be fitted in: %n",testNumber);
                if (testNumber >= MIN_BYTE && testNumber <= MAX_BYTE){
                    System.out.println("* byte");
                }
                if (testNumber >= MIN_SHORT && testNumber <= MAX_SHORT){
                    System.out.println("* short");
                }
                if (testNumber >= MIN_INT && testNumber <= MAX_INT){
                    System.out.println("* int");
                }
                if (testNumber >= MIN_LONG && testNumber <= MAX_LONG){
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.printf("%s can't be fitted anywhere.%n",scanner.next());
            }
        }
    }
}
