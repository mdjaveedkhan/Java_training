package org.example.ClassWork.Collections.List.Set.HashMap.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class question3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 9;

        // Map to store: Key = Number, Value = Index
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for (int i = 0; i < arr.size(); i++) {
            int currentNum = arr.get(i);
            int complement = target - currentNum;
            if (map.containsKey(complement)) {
                System.out.println("[" + map.get(complement) + ", " + i + "]");
                found = true;
                break;
            }
            map.put(currentNum, i);
        }
        if (!found) {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
