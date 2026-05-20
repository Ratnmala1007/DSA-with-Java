package com.dsa.dailycode.day24_2026_05_13;

import java.util.HashSet;

public class RemoveDuplicate_char {
    public static void main(String[] args) {
        String s = "aabcdccb";

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println(set);

    }
}