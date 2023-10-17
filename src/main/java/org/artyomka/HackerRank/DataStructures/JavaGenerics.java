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
        for (Integer integer : intList) {
            System.out.println(integer);
        }

        // String Output
        for (String s : strList) {
            System.out.println(s);
        }
    }
}
