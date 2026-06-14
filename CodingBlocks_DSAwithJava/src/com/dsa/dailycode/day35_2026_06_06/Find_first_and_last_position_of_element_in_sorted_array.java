package com.dsa.dailycode.day35_2026_06_06;

public class Find_first_and_last_position_of_element_in_sorted_array {
    public static void main(String[] args) {
        int[] arr = {4,5,5,6,6,6,7};
        int target = 6;
       int first = firstPos(arr,target);
     int last =   lastPos(arr,target);
        System.out.println(first+" "+last);

    }
    public static int firstPos(int[]arr,int target){
      int start =0;
      int end = arr.length-1;
      int ans = -1;
      while (start <= end){
          int mid = start + (end - start)/2;
          if(target < arr[mid]){
              end = mid-1;
          }
          else if (target > arr[mid]){
              start = mid+1;
          }
          else {
              ans = mid;
             end = mid-1;
          }
      }
        return ans;

    }
    public static int lastPos(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else {
                ans = mid;
               start = mid+1;
            }
        }
        return ans;

    }
}
