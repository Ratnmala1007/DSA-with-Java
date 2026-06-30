package com.dsa.zoho;

import java.util.HashSet;

public class RemoveDuplicate_num {
    public static void main(String[] args) {
        int[] nums = { 11,2,3,2,3,5};
//        HashSet<Integer> set = new HashSet<>();
//        for(int num : arr){
//            set.add(num);
//
//        }
//        System.out.println(set);
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        // map.put(nums[i],1);

        System.out.println(set);

        return nums.length;
    }

}
