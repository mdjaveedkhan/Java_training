package org.example.ClassWork.Collections.List.arrayList.questions;
//Reverse an arrayList
import java.util.ArrayList;
public class question3 {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("Java");
        input.add("Python");
        input.add("C++");
        input.add("JavaScript");
        input.add("Ruby");
        System.out.println(input);


        // logic
        ArrayList<String> reversed = new ArrayList<>();
        for (int i = input.size() - 1; i >= 0; i--) {
            reversed.add(input.get(i));
        }
        System.out.println(reversed);
    }
}
