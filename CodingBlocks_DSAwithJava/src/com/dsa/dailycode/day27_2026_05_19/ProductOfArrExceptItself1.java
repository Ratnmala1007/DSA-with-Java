package com.dsa.dailycode.day27_2026_05_19;

import java.util.Arrays;

public class ProductOfArrExceptItself1 {
        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 5};
            System.out.println(Arrays.toString(product(arr)));
        }

        public static int[] product(int[] arr) {
            int n = arr.length;
            int []result = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                int total = 1;
                for (int j = 0; j < arr.length; j++) {

                    if (i != j) {
                        total = total * arr[j];
                    }
                }
                result[i] =total;
            }
            return result;


        } }

