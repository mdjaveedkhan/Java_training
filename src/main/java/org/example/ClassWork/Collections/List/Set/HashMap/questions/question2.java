package org.example.ClassWork.Collections.List.Set.HashMap.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class question2 {
    public static void main(String[] args) {
        String str = "swiss";

        // write logic to print first non-repeating character
        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The first non-repeating character is: " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeating character found.");
        }
    }
}