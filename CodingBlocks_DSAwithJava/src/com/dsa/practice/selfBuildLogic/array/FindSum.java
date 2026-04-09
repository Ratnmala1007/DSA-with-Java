package com.dsa.practice.selfBuildLogic.array;

public class FindSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        System.out.println(sum(arr));
    }
    public static int sum(int[]arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }
}
