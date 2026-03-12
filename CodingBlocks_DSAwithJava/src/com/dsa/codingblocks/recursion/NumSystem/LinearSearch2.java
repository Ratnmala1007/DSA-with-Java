package com.dsa.codingblocks.recursion.NumSystem;

public class LinearSearch2 {
    static boolean recursiveSearch(int[] arr, int index, int target) {
        if (index == arr.length)
            return false;

        if (arr[index] == target)
            return true;

        return recursiveSearch(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[]arr = {3,1,4,5,2,7,6};
        int index = 0;
        int target = 15;
        System.out.println(recursiveSearch(arr,index,target));
    }
}
