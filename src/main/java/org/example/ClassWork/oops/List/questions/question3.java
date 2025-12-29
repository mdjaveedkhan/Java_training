package org.example.ClassWork.oops.List.questions;

import java.util.Arrays;
import java.util.LinkedList;

public class question3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5)); // expected output = 3
        int middleIndex = ll.size() / 2;
        if (ll.size() % 2 == 0) {
            System.out.println("Middle elements : "+ ll.get(middleIndex - 1) + " and " + ll.get(middleIndex));
            return;
        }
        System.out.println("Middle element: " + ll.get(middleIndex));

    }
}