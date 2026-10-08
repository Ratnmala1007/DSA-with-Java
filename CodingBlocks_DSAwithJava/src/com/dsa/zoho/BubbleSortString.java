package com.dsa.zoho;

import java.util.Arrays;

public class BubbleSortString {
    public static void main(String[] args) {
        String r = "ratn";
      char[] arr = r.toCharArray();
     bubbleSort(arr);
        System.out.println(arr);
    }

    public static void bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = true;
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
            if(!swap){
              break;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "");
       // }

    }
}