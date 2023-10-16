package org.artyomka.HackerRank.DataStructures;

import java.util.ArrayList;

public class JavaGenerics {
    public static void main(String[] args) {
        // Arrays
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        // Adding to the Arrays
        intList.add(1);
        intList.add(2);
        intList.add(3);
        strList.add("Hello");
        strList.add("World");

        // Integer Output
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        // String Output
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
