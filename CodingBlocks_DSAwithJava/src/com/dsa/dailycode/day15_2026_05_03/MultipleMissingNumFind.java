package com.dsa.dailycode.day15_2026_05_03;

public class MultipleMissingNumFind {
    public static void main(String[] args) {
        int[]arr = {4,5,7};
        System.out.println(findMissing(arr,3));

    }
    public static boolean findMissing(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];

        for (int num : arr) {
            if (num <= n) {
                present[num] = true;
            }
        }

        for (int i = 0; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }

        return false;
    }
}
