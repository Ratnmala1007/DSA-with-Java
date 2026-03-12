package com.dsa.assignment.assignment_3;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        for(int i=0;i<arr.length;i++) {
            arr[i] = arr[i] * arr[i];
            System.out.print(arr[i]+" ");
        }
        for (int i = 1; i < arr.length-1; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // print
        for (int x : arr) {
            System.out.print(x + " ");
                }
            }


        }
