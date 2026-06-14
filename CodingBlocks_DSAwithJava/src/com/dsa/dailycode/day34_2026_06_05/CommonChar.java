package com.dsa.dailycode.day34_2026_06_05;

import java.util.HashMap;

public class CommonChar {
    public static void main(String[] args) {
        String s1 = "program";
        String s2 = "anagramm";
        comman(s1,s2);
    }
    public static void comman(String s1,String s2){
        char[] c= new char[26];
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch,1);
        }

        for (char ch : s2.toCharArray()) {
            if (map.containsKey(ch)) {
                System.out.print(ch+" ");
                //map.remove(ch);
            }
            //System.out.print(ch);

        }
    }

}
