package com.dsa.javadeveloper.hashmap;

import java.util.HashSet;

public class LongestConecutive {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        //Output: 9
        System.out.println(longestConsecutive(nums));
    }


    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxConsecutive = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxConsecutive = Math.max(maxConsecutive, currentLength);
            }
        }

        return maxConsecutive;
    }
}