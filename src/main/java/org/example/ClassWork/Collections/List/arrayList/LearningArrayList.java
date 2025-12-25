package org.example.ClassWork.Collections.List.arrayList;

import java.util.ArrayList;

public class LearningArrayList {
    public static void main(String[] args) {

        // ArrayList of type Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // ---- 1: add method ----
        numbers.add(1);   // index 0
        numbers.add(2);   // index 1

        // ---- 2: get method ----
        System.out.println("Element at 2nd index: " + numbers.get(1));

        numbers.add(20);
        numbers.add(30);

        // ---- 3: add method with index ----
        numbers.add(1, 60); // shifts elements to the right
        System.out.println("Element at 1st index: " + numbers.get(1));
        System.out.println("Element at 2nd index: " + numbers.get(2));

        // ---- 4: set method ----
        numbers.set(1, 100); // replaces element, no shifting
        System.out.println("Element at 1st index after set: " + numbers.get(1));

        // ---- 5: remove method ----
        numbers.remove(1); // removes element at index 1

        // ---- 6: size method ----
        System.out.println("Size of ArrayList: " + numbers.size());

        // ---- 7: indexOf method ----
        System.out.println("Index of 30: " + numbers.indexOf(30));

        // ---- 8: lastIndexOf method ----
        numbers.add(30);
        System.out.println("Last index of 30: " + numbers.lastIndexOf(30));

        // ---- 9: isEmpty method ----
        System.out.println("Is ArrayList empty: " + numbers.isEmpty());

        // ---- 10: contains method ----
        System.out.println("Does ArrayList contain 20: " + numbers.contains(20));

        // ---- 11: clear method ----
        numbers.clear();
        System.out.println("Size after clear(): " + numbers.size());

        // ----------------------------------------------------

        // ArrayList of type String
        ArrayList<String> array = new ArrayList<>();
        array.add("First");
        array.add("Second");
        array.add(null);

        // ---- 12: toArray method (CORRECT WAY) ----
        String[] myArr = array.toArray(new String[0]);

        // Printing array elements
        System.out.println("Array elements after toArray():");
        for (String s : myArr) {
            System.out.println(s);
        }
    }
}
