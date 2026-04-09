package com.dsa.practice.selfBuildLogic.array;

public class ProductOfArr {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(product(arr,1));
    }
    public static int product(int[]arr,int result) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] != arr[j])
                    result = arr[j] * arr[i];
            }
        }
            return result;
        }

}
