package com.dsa.dailycode.day32_2026_05_27;

public class FindMaxInRotatedSortedArr {

        public static void main(String[] args) {
            int[] arr = {3,4,5,7,0,1,2,-9};
            System.out.println(maxRotatedArr(arr));
        }
        public static int maxRotatedArr(int[]arr){
            int start = 0;
            int end = arr.length-1;

            while (start < end) {
                int mid = start+(end-start)/2;
                if(arr[mid] < arr[end]){
                    start = mid+1;
                }
                else {
                    end = mid;
                }
            }
            return arr[end];
        }
    }


