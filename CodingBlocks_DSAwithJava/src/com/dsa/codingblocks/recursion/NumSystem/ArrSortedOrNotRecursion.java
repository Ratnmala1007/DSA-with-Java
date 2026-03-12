package com.dsa.codingblocks.recursion.NumSystem;

public class ArrSortedOrNotRecursion {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,4,6,7,8};
        int index=0;
        System.out.println(isSorted(arr, index));
    }
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;

        if (arr[index] > arr[index + 1])
            return false;

        return isSorted(arr, index + 1);
    }
}
