package com.dsa.dailycode.sorting.algoritham;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = { 4,3,6,8,1};

     sort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static boolean sort(int[]arr){
for(int i =0 ;i < arr.length-1;i++) {
    boolean swap = false;
    for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            swap = true;
        }
    }

    if (!swap){
        break;

    }
}
return true;
    }
}
