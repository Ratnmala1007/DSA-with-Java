package com.dsa.dailycode.day47_2026_07_04;

public class PrintLargestInArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8,3,-2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
         if(arr[i] > max){
            max = arr[i];

            } else if (arr[i] < min) {
             min = arr[i];
         }
        }
         System.out.println("max val:"+ max);
        System.out.println("min val:"+ min);

    }
}