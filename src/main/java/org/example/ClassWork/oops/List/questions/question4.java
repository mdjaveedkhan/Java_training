package org.example.ClassWork.oops.List.questions;

import java.util.Arrays;
import java.util.LinkedList;
public class question4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("r","a","d","a","r")); // expected output = 3
        Boolean result= null;
        int left = 0;
        int right = ll.size() - 1;
        while (left < right) {
            if (!ll.get(left).equals(ll.get(right))) {
                result= false;
            }
            left++;
            right--;
        }
        result= true;
        System.out.println("Is list1 a palindrome? " + result);

    }
}
