package com.dsa.zoho.zoho;

public class RemoveDuplicateFromSortedArr {
    public static void main(String[] args) {
        int[] nums = { 3,4,4,6};
        RemoveDuplicateFromSortedArr remove = new RemoveDuplicateFromSortedArr();

        System.out.print("\n"+ remove.removeDuplicates(nums));
    }
        public int removeDuplicates(int[] nums) {
            if(nums.length == 0){
                return 0;
            }
            int j = 0;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] != nums[j]){
                    j++;
                    nums[j]=nums[i];
                }
            }

            for(int i =0; i < nums.length; i++){
                System.out.print(nums[i]+" ");
            }
            return j+1;

        }
    }


