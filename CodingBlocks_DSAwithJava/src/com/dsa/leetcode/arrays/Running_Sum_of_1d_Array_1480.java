package com.dsa.leetcode.arrays;

import java.util.Arrays;

public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }        public static int[] runningSum(int[] nums) {

            for(int i =1;i<nums.length;i++){
                nums[i]= nums[i]+nums[i-1];   // 1 3 6 10
            }
            return nums;

    }
}
