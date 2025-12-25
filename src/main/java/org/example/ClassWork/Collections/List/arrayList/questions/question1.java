package org.example.ClassWork.Collections.List.arrayList.questions;

import java.util.ArrayList;

public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(10);
        input.add(30);
        input.add(20);
        ArrayList<Integer> newarraylist = new ArrayList<>();

        for (Integer num : input){
            if (!newarraylist.contains(num)) {
                newarraylist.add(num);
            }
        }

        System.out.println(newarraylist);
    }

    public static void printArrayList(ArrayList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}