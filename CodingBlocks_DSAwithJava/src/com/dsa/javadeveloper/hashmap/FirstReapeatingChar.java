package com.dsa.javadeveloper.hashmap;

import java.util.HashSet;
import java.util.Set;

public class FirstReapeatingChar {
    public static void main(String[] args) {


        //String s = "programming";
        String s = "abcd";
        System.out.println(firstReapeatingChar(s));
    }
    public static Character firstReapeatingChar(String s){
        Set<Character> seen = new HashSet<>();

        // Write your logic here
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (seen.contains(ch)) {
                return ch;
            }
            seen.add(ch);
        }
        return null;
    }
}