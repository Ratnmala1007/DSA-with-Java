package com.dsa.zoho.zoho;

import java.util.HashSet;

public class RemoveDuplicate_char {
    public static void main(String[] args) {
        String s = "aabcdccbefafsgh";

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