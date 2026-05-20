package com.dsa.dailycode.day3_2026_04_08;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
           // if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num,0) + 1);
//}
//            else {
//                map.put(num, 1);
//                count++;
//            }
        }
        //System.out.println(count);
        System.out.println(map);
    }
}
