package com.dsa.dailycode.day27_2026_05_19;

import java.util.Arrays;

public class ProductOfArrExceptItself {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(Arrays.toString(product(arr)));
    }

    public static int[] product(int[] arr) {
        int n = arr.length;
        int total = 1;
        for (int num : arr) {
            total = total * num;
        }
        int[] result = new int[n];

        for (int i = 0; i < arr.length; i++) {


            result[i] =total / arr[i];
        }
        return result;


    } }