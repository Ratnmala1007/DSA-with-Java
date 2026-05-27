package com.dsa.zoho.zoho;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        //int[]arr = {0,1,2,2,3,0,4,2};
        int[]arr = {3,2,2,3};
        int val = 3;
        int k = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != val){
               arr[k] = arr[i];
               k++;
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(arr));
    }
}
