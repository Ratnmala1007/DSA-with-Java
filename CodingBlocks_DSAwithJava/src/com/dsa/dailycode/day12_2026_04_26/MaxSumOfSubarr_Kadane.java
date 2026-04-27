package com.dsa.dailycode.day12_2026_04_26;

public class MaxSumOfSubarr_Kadane {
    public static void main(String[] args) {
        int[] arr = {-2,1,3,-4,5,-3};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[]arr){
        int curruntSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length;i++){
            curruntSum+= arr[i];
            maxSum = Math.max(curruntSum,maxSum);

            if(curruntSum < 0){
                curruntSum = 0;
            }
        }
        return maxSum;
    }
}
