package com.dsa.dailycode.day31_2026_05_24;

public class SelectionSortString {
    public static void main(String[] args) {
        String r = "ratn";
       char[] arr= r.toCharArray();

        for(int i = 0;i< arr.length;i++){
            for(int j=i+1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i = 0;i< arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
