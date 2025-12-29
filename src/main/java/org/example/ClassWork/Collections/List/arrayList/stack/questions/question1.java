package org.example.ClassWork.Collections.List.arrayList.stack.questions;

import java.util.Stack;

public class question1 {
    public static void main(String[] args) {
        String str = "{[()]}";

        Stack<Integer> stack = new Stack<>();

        // logic to check Valid Parentheses
        boolean isValid = true;


        // print result
        if(isValid) {
            System.out.println("The parentheses are valid.");
        } else {
            System.out.println("The parentheses are not valid.");
        }
    }
}