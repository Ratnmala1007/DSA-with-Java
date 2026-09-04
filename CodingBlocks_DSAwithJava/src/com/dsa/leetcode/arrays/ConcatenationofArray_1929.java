package com.dsa.leetcode.arrays;

//import java.lang.reflect.Array;

import java.util.Arrays;

public class ConcatenationofArray_1929 {
    public static void main(String[] args) {
        Integer value = 1098;

        System.out.println(value.hashCode());
        int[] nums = {1, 2, 3};
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i+nums.length]=nums[i];

        }
            System.out.print(Arrays.toString(arr) + "");
    }

}