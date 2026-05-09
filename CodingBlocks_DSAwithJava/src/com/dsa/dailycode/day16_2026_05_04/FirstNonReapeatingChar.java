package com.dsa.dailycode.day16_2026_05_04;

import java.util.HashMap;

public class FirstNonReapeatingChar {
    public static void main(String[] args) {
        String s = "aabbd";

        HashMap<Character, Integer> map = new HashMap<>();
        boolean found = false;


        for (char ch : s.toCharArray()) {
           map.put(ch, map.getOrDefault(ch,0) + 1);

        }

//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) + 1);
//            } else {
//                map.put(ch, 1);
//            }


        for (char ch : s.toCharArray()) {
            //char ch = s.charAt(i);
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