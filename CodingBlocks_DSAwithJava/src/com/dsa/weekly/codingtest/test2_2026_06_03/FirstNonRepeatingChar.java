package com.dsa.weekly.codingtest.test2_2026_06_03;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
         String s = "aabccdef";
         char ch = firstNonRepeating(s);

        System.out.println(ch);
    }
    public static char firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0)+1);


        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';

    }
}


