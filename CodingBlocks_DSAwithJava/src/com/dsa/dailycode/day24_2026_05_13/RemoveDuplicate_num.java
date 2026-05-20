package com.dsa.dailycode.day24_2026_05_13;

import java.util.HashSet;

public class RemoveDuplicate_num {
    public static void main(String[] args) {
        int[] arr = { 11,2,3,2,3,5};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);

        }
        System.out.println(set);
    }
}
