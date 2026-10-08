package com.dsa.javadeveloper.arrays;

public class CountValidPair {
    public static void main(String[] args) {
        int arr[] = {2,2,2,2};
        int target = 4;
        System.out.println(count(arr, target));
    }

    public static int count(int[] arr, int target) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] + arr[j] == target && i < j) {
                    count++;
                }
            }
        }
        return count;

    }
}