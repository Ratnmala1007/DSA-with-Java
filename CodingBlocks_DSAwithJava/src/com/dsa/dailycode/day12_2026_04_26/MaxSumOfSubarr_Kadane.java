package com.dsa.dailycode.day12_2026_04_26;

public class MaxSumOfSubarr_Kadane {
    public static void main(String[] args) {
        int[] arr = {-2,-1,-4,-3};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[]arr){
        int curruntSum = 0;
        int maxSum = arr[0];

        for (int i = 1; i < arr.length;i++){
            curruntSum =arr[i]+curruntSum;
            maxSum = Math.max(curruntSum,maxSum);


        }
        return maxSum;
    }
}
