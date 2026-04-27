package com.dsa.zoho;

import java.util.Arrays;
/*In right rotation, last k elements move to front.
        In left rotation, first k elements move to end.
        We normalize k using k % n to handle large values.” */
public class RotateArr {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int k =3;
        int[] result = rotate(arr, k);

        System.out.println(Arrays.toString(result));
    }
    public static int[] rotate(int[]arr,int k){
        int n = arr.length;
         k = k % n;

        reverse(arr, 0,n-1);
        reverse(arr,0,k-1);
        reverse(arr, k,n-1);

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
