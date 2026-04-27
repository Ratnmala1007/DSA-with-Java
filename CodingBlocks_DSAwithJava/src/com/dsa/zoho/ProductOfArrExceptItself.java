package com.dsa.zoho;

import java.util.Arrays;

public class ProductOfArrExceptItself {
    public static void main(String[] args) {
        int[]arr = { 2,3,4,5};
        System.out.println(Arrays.toString(product(arr)));
    }
    public static int[] product(int[]arr){
        int n = arr.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < arr.length;i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }
        int right = 1;

            for (int i = n-1; i >= 0;i--){
                result[i] = result[i] * right;
                right = right * arr[i];
            }
        return result;
    }

}
