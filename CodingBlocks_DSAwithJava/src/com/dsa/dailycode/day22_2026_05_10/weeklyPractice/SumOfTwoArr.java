package com.dsa.dailycode.day22_2026_05_10.weeklyPractice;

import java.util.Arrays;

public class SumOfTwoArr {
    public static void main(String[] args) {
        int[] arr = {1, 4,3};
        int[] arr1 = {1, 4};
        int min = Math.min(arr.length, arr1.length);

        int []total = new int [arr.length];
        for (int i = 0; i <min; i++) {
            total[i] =   arr[i]+arr1[i];

        }
        System.out.println(Arrays.toString(total));
    }
}