package com.dsa.dailycode.day40_2026_06_19;

import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {
        String s = "ratnmala";
        HashMap<Character,Integer> map = new HashMap<>();
int count = 0;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            count++;
        }
        for(char c : s.toCharArray()){
            System.out.println(c + "->"+map.get(c));
        }
        System.out.println(map);
        System.out.println(count);
    }
}
