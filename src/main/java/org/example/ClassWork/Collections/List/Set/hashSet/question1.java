package org.example.ClassWork.Collections.List.Set.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));

        // Logic to print duplicate elements
        HashSet<Integer> nums = new HashSet<>();
        System.out.println("Duplicate elements are:");
        for (Integer num : input) {
            if (!nums.add(num)) {
                System.out.print(num+" ");
            }
        }
    }
}