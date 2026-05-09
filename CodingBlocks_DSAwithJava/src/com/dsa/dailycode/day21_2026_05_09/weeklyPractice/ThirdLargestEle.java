package com.dsa.dailycode.day21_2026_05_09.weeklyPractice;

public class ThirdLargestEle {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                thirdLargest = secondLargest;
                secondLargest = max;
                max = num;
            } else if (num > secondLargest && num != max) {

                thirdLargest = secondLargest;
                secondLargest = num;

            } else if (num > thirdLargest &&
                    num != secondLargest &&
                    num != max) {

                thirdLargest = num;
            }

        }
        System.out.println(thirdLargest);

    }
}
