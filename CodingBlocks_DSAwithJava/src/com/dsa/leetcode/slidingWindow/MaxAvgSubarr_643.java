package com.dsa.leetcode.slidingWindow;

public class MaxAvgSubarr_643 {
    public static void main(String[] args) {
int nums[]={1,-5,-3,40};
      int  k = 2;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
            int sum=0;
            for(int i =0;i < k;i++){
                sum+=nums[i];//2
            }
                int left =0;
        int max =sum;

                for(int right =k;right<nums.length;right++) {
                    sum = sum - nums[left] + nums[right];//2-1+51=51  51-12+3=42
                    left++;                              //1 2


                    max = Math.max(sum, max);  // (51,0)=51 (42,52) 51
                }

            return (double)max/k;//51/4=12.75
        }

}
