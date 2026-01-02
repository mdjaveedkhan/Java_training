package org.example.ClassWork.Collections.List.Set.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WaysToIterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "apple");
        hm.put(2, "banana");
        hm.put(3, "grapes");
        hm.put(2, "orange");

        System.out.println("for each loop on keys");
        ArrayList<Integer> arrayListofKeys = new ArrayList<>(hm.keySet());
        for (Integer key : arrayListofKeys) { // read only method of iteration
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }

        System.out.println("for each loop on entries");
        Set<Map.Entry<Integer, String>> pairsList = hm.entrySet();
        for (Map.Entry<Integer, String> pair : pairsList) { // read as well update the pair
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
            if (pair.getKey() == 3) {
                pair.setValue("kiwi");
            }
        }

        System.out.println("forEach method with lambda");
        hm.forEach((k, v) -> {
            System.out.println("Key:" + k + ", Value: " + v);
        });
    }
}
