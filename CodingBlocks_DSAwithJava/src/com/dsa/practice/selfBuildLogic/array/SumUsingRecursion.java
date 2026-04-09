package com.dsa.practice.selfBuildLogic.array;

public class SumUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sum(arr,0));
    }
    public static int sum(int[]arr,int index) {
        if(index==arr.length ){
             return 0;
        }
        int smallAns = sum(arr, index + 1); // step 1
       return arr[index] + smallAns; // step 2
    }
    }

