package com.dsa.dailycode.day48_2026_07_06;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,7,9,8,10,3, -2};
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max; //0,1,2,3,4,7,8,9
                max = arr[i];        //1,2,3,4,7,9,10

            } else if (arr[i] > secondLargest && arr[i]!= max) {
               secondLargest =  arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}