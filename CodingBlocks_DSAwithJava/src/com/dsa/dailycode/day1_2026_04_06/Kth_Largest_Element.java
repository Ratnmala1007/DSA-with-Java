package com.dsa.dailycode.day1_2026_04_06;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 4, 2};
        //Kth_Largest_Element.kth_Largest(arr);

        // System.out.println(kth_Largest(arr));


       // private static void kth_Largest ( int[] arr){
            int n = arr.length ;
            int k = 2;       //2nd largest element in arr
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j+1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }

                }
            //print swap arr
        for (int i= 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
            }
        //find kth element
         int kth =arr[n-k];
        System.out.println('\n'+"Kth element is :"+kth);
        }
    }
