package com.dsa.dailycode.day32_2026_05_27;

public class SearchInRoatatedSortedArr {
    public static void main(String[] args) {
        int[]nums = {4,5,6,7,0,1,2};
       SearchInRoatatedSortedArr arr= new SearchInRoatatedSortedArr();
       arr.search(nums,7);

        System.out.println( arr.search(nums,7));
    }
        public int search(int[] nums, int target) {

            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                // target found
                if (nums[mid] == target) {
                    return mid;
                }

                // LEFT HALF SORTED
                if (nums[start] <= nums[mid]) {

                    // target inside left half
                    if (target >= nums[start] &&
                            target < nums[mid]) {

                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }

                // RIGHT HALF SORTED
                else {

                    // target inside right half
                    if (target > nums[mid] &&
                            target <= nums[end]) {

                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
            }

            return -1;
        }
    }
