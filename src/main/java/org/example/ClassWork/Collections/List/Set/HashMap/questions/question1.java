package org.example.ClassWork.Collections.List.Set.HashMap.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4));

        // write logic print frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        System.out.println("Element Frequencies:");
        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " = " + frequencyMap.get(key) );
        }
    }
}