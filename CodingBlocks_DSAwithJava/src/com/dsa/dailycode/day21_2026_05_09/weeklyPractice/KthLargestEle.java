package com.dsa.dailycode.day21_2026_05_09.weeklyPractice;

public class KthLargestEle {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,-5};
        //int max = Integer.MIN_VALUE;
int k =2;
int n = arr.length;
        for(int i = 0; i < n-1;i++) {
            for (int j = 0; j < n - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            for(int i = 0; i < n;i++) {
            System.out.print(arr[i]+" ");
            }
              k = arr[n - k];
        System.out.println("kth largest element:" + k);
        }
    }

