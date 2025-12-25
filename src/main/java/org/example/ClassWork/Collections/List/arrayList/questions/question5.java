package org.example.ClassWork.Collections.List.arrayList.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class question5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Input: " + list);

        // Remove all even numbers using removeIf
        list.removeIf(n -> n % 2 == 0);

        System.out.println("Output: " + list);
    }
}
