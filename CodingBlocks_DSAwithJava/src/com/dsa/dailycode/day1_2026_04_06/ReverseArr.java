package com.dsa.dailycode.day1_2026_04_06;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
       reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    private static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
     while(left < right){
         int temp= arr[right];
    arr[right]=arr[left];
         arr[left]=temp;
    left++;
    right--;
        }
    }
}