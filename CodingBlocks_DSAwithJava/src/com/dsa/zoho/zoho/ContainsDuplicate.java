package com.dsa.zoho.zoho;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6,1};
        System.out.println(duplicate(arr));
    }

    public static boolean duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;

    }
}
