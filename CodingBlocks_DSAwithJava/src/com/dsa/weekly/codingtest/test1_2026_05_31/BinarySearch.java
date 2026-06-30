package com.dsa.weekly.codingtest.test1_2026_05_31;
//Input:
//        arr = [2,5,8,12,16]
//        target = 12
//
//        Output:
//        3

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16};
        int target = 12;
        int result = binarySearch(arr, 12);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}