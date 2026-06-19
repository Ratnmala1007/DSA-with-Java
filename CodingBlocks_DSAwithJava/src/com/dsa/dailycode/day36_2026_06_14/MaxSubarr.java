package com.dsa.dailycode.day36_2026_06_14;

public class MaxSubarr {
    public static void main(String[] args) {
        int[] nums = {-4,-10,-2};
        System.out.println(maxSum(nums));
    }
    public static int maxSum(int[]nums) {
        int currentSum =nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {


                currentSum = Math.max(nums[i], nums[i] + currentSum);

                maxSum = Math.max(currentSum, maxSum);
            }

        return maxSum;
    }
}
