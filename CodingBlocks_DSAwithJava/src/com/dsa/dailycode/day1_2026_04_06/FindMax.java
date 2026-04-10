package com.dsa.dailycode.day1_2026_04_06;

public class FindMax {
    public static void main(String[] args) {
        int[]arr={-2,-1,-12};

        int max = arr[0];

        for(int num:arr) {

            if (num > max)
            {
                max = num;
            }
        }
        System.out.println(max);

    }

}
