package com.dsa.zoho;

import java.util.HashMap;

public class FirstNonReapeatingChar {
    public static void main(String[] args) {
        String s = "aabbd";

        HashMap<Character, Integer> map = new HashMap();
        boolean found = false;


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                System.out.println(ch);
                found = true;
                break;
            }
        }
            if(!found){
                System.out.println( "not found");}

    }
}