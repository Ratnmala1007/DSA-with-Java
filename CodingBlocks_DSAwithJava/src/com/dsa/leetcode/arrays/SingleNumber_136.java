package com.dsa.leetcode.arrays;

import java.util.HashMap;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1,3,5,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                 return (num);
            }
        }
        return 0;
    }
}