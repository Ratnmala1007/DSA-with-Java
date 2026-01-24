package com.dsa.leetcode;

public class TwoSum_1 {
    public static void main(String[] args) {

        int[] arr = {2, 11, 7, 11, 15};
        int target = 9;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}