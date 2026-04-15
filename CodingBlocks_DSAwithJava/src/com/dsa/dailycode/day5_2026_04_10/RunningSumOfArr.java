package com.dsa.dailycode.day5_2026_04_10;
//sum of arr element using prefix
public class RunningSumOfArr {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};

        for(int i = 1; i < arr.length; i++){
           arr[i] = arr[i]+arr[i-1];
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
