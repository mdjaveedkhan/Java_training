package org.example.ClassWork.oops.List.questions;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class question2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println("Before reversing:");
        printLL(ll);

        // Simple logic to reverse
        Collections.reverse(ll);

        System.out.println("After reversing:");
        printLL(ll);
    }

    public static void printLL(LinkedList<String> list) {
        System.out.println(list);
    }
}