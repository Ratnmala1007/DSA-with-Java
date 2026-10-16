package com.dsa.javadeveloper.arrays;

public class MaxNum {
    public static void main(String[] args) {
        int[]arr = { 2,1,8,4,9};
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        int max = arr[0];
        for (int i =0;i<arr.length;i++) {
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
