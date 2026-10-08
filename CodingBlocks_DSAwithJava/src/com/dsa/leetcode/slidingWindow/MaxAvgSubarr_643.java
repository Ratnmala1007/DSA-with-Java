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
                sum+=nums[i];//-4
            }
                int left =0;
        int max =sum;

                for(int right =k;right<nums.length;right++) {//1,-5,-3,40
                    sum = sum - nums[left] + nums[right];//(-4-1+-3=-8 )(-8-(-5)+40=37)
                    left++;                              //1 ,-5,-3


                    max = Math.max(sum, max);  // (-4,-8)(-4,37)
                }

            return (double)max/k;//37/2=18.5
        }

}
