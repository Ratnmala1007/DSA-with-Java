package com.dsa.zoho;

import java.util.Arrays;

public class ProductOfArrExceptItself {
    public static void main(String[] args) {
        int[]arr = { 2,3,4,5 };
        System.out.println(Arrays.toString(product(arr)));
    }
    public static int[] product(int[]arr){
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < arr.length;i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1]; //1,2,6,24
        }

        int arr1 = 1;

            for (int i = n-1; i >= 0;i--){   //2,3,4,5
                prefix[i] = prefix[i] * arr1;  //1,2,6,24
                arr1 = arr1 * arr[i];  // 1,5,20,60    24,30,40,60  60,40,30,24
            }
        return prefix;
    }

}
