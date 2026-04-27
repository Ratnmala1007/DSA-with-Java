package com.dsa.dailycode.day13_2026_04_27;

import java.util.Arrays;

public class LeftRotateArr {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int k =3;
        int[] result = rotate(arr, k);

        System.out.println(Arrays.toString(result));
    }
    public static int[] rotate(int[]arr,int k){
        int n = arr.length;
         k = k % n;

        reverse(arr,0,k-1);  //3,2,1,4,5,6,7
        reverse(arr, k,n-1);       // 3,2,1,7,6,5,4
        reverse(arr, 0,n-1);   //4,5,6,7,1,2,3


        return arr;
    }
    public static void reverse(int[]arr,int start,int end){
        //start = 0;
       // end = arr.length-1;

        while (start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }
}
