package org.artyomka.HackerRank.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();

        // Closing the Scanner
        scan.close();

        // Variable
        List<String> stringsList = new ArrayList<>();

        // Generates all the possible substrings
        // -k+1 ensures that iteration doesn't go beyond last valid index
        for (int i = 0; i < s.length() - k + 1; i++) {
            // Generating substring
            String sub = s.substring(i, i + k); // i + k creates a substring of k
            stringsList.add(sub); // Adding to stringsList
        }

        // Sorting in dictionary order.
        Collections.sort(stringsList);


        // .get(0) gets smallest lexicographical string
        String smallest = stringsList.get(0);
        //.get(s.length() - k) is used to calculate the last index position in the lexicographical ordered list
        String largest = stringsList.get(s.length() - k);

        // Output
        System.out.println(smallest);
        System.out.println(largest);
    }
}
