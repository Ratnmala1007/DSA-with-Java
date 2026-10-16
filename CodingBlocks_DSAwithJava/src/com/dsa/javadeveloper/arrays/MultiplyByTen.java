package com.dsa.javadeveloper.arrays;

import java.util.Arrays;

public class MultiplyByTen {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(multiplyByTen(arr)));

    }
    static int[] multiplyByTen(int[]arr){
        int[]ele = new int[arr.length];
        for(int i =0;i< arr.length;i++){// 1 2 3 4
           int element= arr[i]*10; // 10 20 30 40
            ele[i] = element;     // 10 20 30 40
        }
        return ele;
    }
}