package org.example.ClassWork.Collections.List.arrayList.questions;

import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(4);
        input.add(9);
        input.add(1);
        input.add(7);
        input.add(9);
        int largest = input.get(0);
        int secondLargest = -1;
        for (int num : input) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}