package com.dsa.zoho;

import java.util.HashMap;

public class FirstReapeatingChar {
    public static void main(String[] args) {
        String s = "addbcc";
        char result = firstRepeatingChar(s);
        if (result != '\0') {
            System.out.println("First repeating char: " + result);
        } else {
            System.out.println("No repeating character");
        }
    }

    public static char firstRepeatingChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (map.get(c) > 1) {
                //System.out.println(c);
               // break;
                return c;
            }
        }

        return '\0'; // not found

    }
}
