
//Thursday-5/Feb/2026
package com.dsa.codingblocks.binarysearch;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 23, 35, 47, 59, 65, 85, 96, 223};
        int target = 23;
        int ans = BinSearch(arr, target);
        System.out.println(ans);
    }

    static int BinSearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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

