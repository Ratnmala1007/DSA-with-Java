package com.dsa.practice.selfBuildLogic.array;

public class MajorityEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 2,3,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }}
            count = 0;
            for (int num : arr) {
                if (num == candidate) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                return candidate;
            }

            return -1; // no majority element
        }

    }

