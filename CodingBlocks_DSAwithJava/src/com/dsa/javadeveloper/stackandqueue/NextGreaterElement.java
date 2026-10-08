package com.dsa.javadeveloper.stackandqueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[]result= new int[nums1.length];
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = -1;      //[-1]
                    for (int k = j + 1; k < nums2.length; k++) {

                        if (nums2[k] > nums2[j]) {   //
                            result[i] = nums2[k];
                            break;

                        }

                    }
                    break;
                }
            }
        }
        return result;
    }
}