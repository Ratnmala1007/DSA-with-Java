package com.dsa.codingblocks.week5.day13;

public class FindMinInRotatedSortedarr_154 {
        static int findMin(int[] nums) {
            int low = 0, high = nums.length - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] < nums[high]) {
                    high = mid;
                }
                else if (nums[mid] > nums[high]) {
                    low = mid + 1;
                }
                else {
                    high--; // handle duplicates
                }
            }
            return nums[low];
        }



    public static void main(String[] args) {
            int nums[]={2,2,2,4,3,0,1};
            int ans=findMin(nums);
        System.out.println(ans);

    }

}
