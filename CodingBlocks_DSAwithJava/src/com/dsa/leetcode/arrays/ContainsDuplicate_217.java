package com.dsa.leetcode.arrays;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {


        int[] nums = {1, 5, 1};
        int[] nums1 = {1, 2, 3, 4, 1};

        System.out.println(containsDuplicate(nums));
       // System.out.println(containsDuplicateNum(nums1));
    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
            }
        return false;

    }
//    public static boolean containsDuplicateNum(int[] nums1) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int j : nums1) {
//            if (set.contains(j)) {
//                return true;
//            }
//       set.add(nums1[j]);
//        }
//        return false;
//    }
    }