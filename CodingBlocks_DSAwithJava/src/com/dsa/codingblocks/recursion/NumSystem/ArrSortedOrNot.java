package com.dsa.codingblocks.recursion.NumSystem;

public class ArrSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,1, 1, 1, 2, 34,56};

        System.out.println(sorted(arr) );
    }
    public static boolean sorted(int[]arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    }
