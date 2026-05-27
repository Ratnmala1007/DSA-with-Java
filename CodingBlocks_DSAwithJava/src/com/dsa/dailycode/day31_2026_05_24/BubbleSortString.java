package com.dsa.dailycode.day31_2026_05_24;

public class BubbleSortString {
    public static void main(String[] args) {
        String r = "ratn";
        char[] arr = r.toCharArray();
        bubbleSort(arr);
    }

    public static void bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }
}