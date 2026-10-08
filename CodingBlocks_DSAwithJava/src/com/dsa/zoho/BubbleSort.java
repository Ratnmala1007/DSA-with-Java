package com.dsa.zoho;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4};
        bubbleSort(arr);
            System.out.print(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
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
    }
}
