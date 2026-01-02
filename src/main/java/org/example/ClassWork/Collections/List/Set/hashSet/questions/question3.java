package org.example.ClassWork.Collections.List.Set.hashSet.questions;

import java.util.HashSet;

public class question3{
    public static void main(String[] args) {
        String input = "abcabcabb";
        HashSet<Character> seen = new HashSet<>();
        StringBuilder current = new StringBuilder();
        System.out.println("Substrings with unique characters:");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (seen.contains(c)) {
                System.out.println(current);
                current.setLength(0);
                seen.clear();
            }
            current.append(c);
            seen.add(c);
        }
        if (current.length() > 0) {
            System.out.println(current);
        }
    }
}