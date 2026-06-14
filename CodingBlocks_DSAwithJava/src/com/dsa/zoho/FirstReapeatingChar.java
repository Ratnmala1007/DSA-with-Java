package com.dsa.zoho;

import java.util.HashMap;
import java.util.HashSet;

public class FirstReapeatingChar {
    public static void main(String[] args) {
        String s = "adbdacc";
        char result = firstRepeatingChar(s);
        if (result != '\0') {
            System.out.println("First repeating char: " + result);
        } else {
            System.out.println("No repeating character");
        }
    }

    public static char firstRepeatingChar(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return c;
            }
            set.add(c);
            System.out.println(set);
        }
        return '\0';

    }}