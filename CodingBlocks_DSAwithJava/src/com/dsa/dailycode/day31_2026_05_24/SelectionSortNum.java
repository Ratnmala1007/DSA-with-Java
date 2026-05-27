package com.dsa.dailycode.day31_2026_05_24;

public class SelectionSortNum {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,2};
        selectionSort(arr);
    }
    public static void selectionSort(int[]arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        }

}
