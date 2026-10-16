package com.dsa.javadeveloper.arrays;

public class MaximumAlternativSumOfSquare {
    public static void main(String[] args) {
        int[]nums = { 1, 2,3};
        System.out.println(maxAlternatingSum(nums));
    }
        public static long maxAlternatingSum(int[] nums) {
            int rearrange = 0;int max =0;
            for(int i =0;i< nums.length;i++){

                if(nums[i]%i==0){

                    rearrange = nums[i-1]*nums[i-1]-nums[i]*nums[i];
                }
                else{
                    rearrange = nums[i-1]*nums[i-1]+nums[i]*nums[i];

                }
            }
            return rearrange;
        }
    }

