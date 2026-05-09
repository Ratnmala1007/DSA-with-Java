package com.dsa.dailycode.day21_2026_05_09.weeklyPractice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,2,3,42,5,5};
        int secondLargest = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if (num > max){
                secondLargest = max;
            max = num;
            } else if (num > secondLargest && num != max) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);

    }
}
