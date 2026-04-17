package com.dsa.dailycode.day3_2026_04_08;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1,3};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
    }
}