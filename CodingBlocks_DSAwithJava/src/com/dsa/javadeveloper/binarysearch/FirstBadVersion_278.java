package com.dsa.javadeveloper.binarysearch;

public class FirstBadVersion_278 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public static boolean isBadVersion(int version){
    version = Integer.MIN_VALUE;

return false;
}
        public static int firstBadVersion(int n) {
            int low = 0; int high = n;
            while(low < high){
                int mid = low+(high-low)/2;  // 1,2,3,4,5

                if(isBadVersion(mid)){
                    high = mid;
               }
                else{
                    low = mid+1;
                }

            }
            return low;
        }

}
