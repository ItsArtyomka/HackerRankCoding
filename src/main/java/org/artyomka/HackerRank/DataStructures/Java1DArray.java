package org.artyomka.HackerRank.DataStructures;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] myArray = new int[N];
        while (scanner.hasNext()){
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = scanner.nextInt();
                System.out.println(myArray[i]);
            }
        }
    }
}
