package com.dsa.youtube.kunalkushwaha.searching;
/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
saturday-07/Feb/2026
 */
public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,9,9,9,9,10};
        int target=9;
        int first = firstPos( nums,  target);
        int last = lastPos( nums,target);
   //int ans=(first,last);
        System.out.println(first + " " +last);

    }

    static int firstPos(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans=-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {

               ans= mid;
                end= mid-1;
            }
        }
        return ans;
    }
    static int lastPos(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans=-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                ans= mid;
                start=mid+1;
            }
        }
        return ans;
    }

}


