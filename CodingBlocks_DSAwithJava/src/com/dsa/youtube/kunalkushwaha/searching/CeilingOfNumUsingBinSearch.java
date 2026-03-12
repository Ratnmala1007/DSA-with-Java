//Thursday-5/Feb/2026
package com.dsa.youtube.kunalkushwaha.searching;

//num is smaller in arr and greater than or equal to target numS
public class CeilingOfNumUsingBinSearch {
        public static void main(String[] args) {
            int []arr={2,5,8,12,14,16,23,38,56,72,91};

            int target= 92;
            int ans=binSearch(arr,target);
            System.out.println(ans);
        }
        static int binSearch(int []arr,int target){
            int start = 0;
            int end = arr.length-1;


            while(start <= end){
                int mid = start + (end-start)/2;
                if(target > arr[arr.length-1]){
                    return -1;
                }

              else if(target <= arr[mid]){
                     end=mid-1;// end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            return arr[start];
        }
    }


