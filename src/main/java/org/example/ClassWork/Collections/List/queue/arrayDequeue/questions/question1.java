package org.example.ClassWork.Collections.List.queue.arrayDequeue.questions;

import java.util.ArrayDeque;
import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        // declaration with intialization of ArrayDeque
        ArrayDeque<Integer> input = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 3;
        // logic - print first k elements
        int count = 0;
        for (Integer element : input) {
            if (count < k) {
                System.out.print(element + " ");
                count++;
            } else {
                break;
            }
        }
    }
}