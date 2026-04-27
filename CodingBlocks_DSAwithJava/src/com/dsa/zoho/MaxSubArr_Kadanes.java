package com.dsa.zoho;

public class MaxSubArr_Kadanes {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4,1,2};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currunt = 0;
        for (int i = 0; i < arr.length; i++) {
            currunt += arr[i];
            maxSum = Math.max(currunt, maxSum);

            if (currunt < 0) {
                currunt = 0;
            }
        }
        return maxSum;

    }
}