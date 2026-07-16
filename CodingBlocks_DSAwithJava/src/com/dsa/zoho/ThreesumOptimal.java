package com.dsa.zoho;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreesumOptimal {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 1, -1};
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            if (!swap) {
                break;
            }
        }
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
    }
}