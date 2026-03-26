package com.dsa.codingblocks.binarysearch;
//Wednesday-4/Feb/2026
public class OrderAgnosticBS {
    public static void main(String[] args) {
       // int []arr={-10,-1,2,5,8,12,1,16,23,38,56,72,91};
        int []arr={90,90,87,78,65,45,3,2,1};
        int target= 90;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int []arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {

                    start = mid + 1;
                }
            }

           else{

            if (target > arr[mid]) {
                end = mid - 1;
            } else  {

                start = mid + 1;
            }
        }
    }
        return -1;
    }

}
