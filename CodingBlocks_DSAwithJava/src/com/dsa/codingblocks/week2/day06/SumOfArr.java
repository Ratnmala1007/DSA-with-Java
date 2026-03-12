package com.dsa.codingblocks.week2.day06;

public class SumOfArr {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,1};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
