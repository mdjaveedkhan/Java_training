package org.example.ClassWork.oops.List.questions;

import java.util.Arrays;
import java.util.LinkedList;
public class question1 {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>(Arrays.asList(1, 2, 1, 3, 2));
        LinkedList<Integer> noDup = new LinkedList<>();
        for (Integer ele : obj) {
            if (!noDup.contains(ele)) {
                noDup.add(ele);
            }
        }
        System.out.println(obj);
        System.out.println(noDup);
    }
}
