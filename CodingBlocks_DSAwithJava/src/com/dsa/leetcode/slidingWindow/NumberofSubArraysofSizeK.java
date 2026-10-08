package com.dsa.leetcode.slidingWindow;

public class NumberofSubArraysofSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int sum = 0;
        int count = 0;
        for (int right = 0; right < arr.length; right++) {
            sum = sum + arr[right];

            if (right-left+1==k) {
                double avg = (double) sum / k;

                if (avg >= threshold) {
                    count++;
                }
                sum -= arr[left];
                left++;
            }

        }
        return count;

    }
}

