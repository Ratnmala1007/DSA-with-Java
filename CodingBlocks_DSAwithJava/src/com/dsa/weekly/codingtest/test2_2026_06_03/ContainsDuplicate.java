package com.dsa.weekly.codingtest.test2_2026_06_03;
//Input:
//        arr = [1, 2, 3, 4, 2]
//
//        Output:
//        true

import java.util.HashMap;
//mocktest chatgpt rating 6.5/10 for overall test
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[ ]arr = { 1,2,3,4,2};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();

            for(int num:arr){
                if(map.containsKey(num)){
                    return true;
                }
                map.put(num,1);
                System.out.println(map);

            }
        return false;
    }

}
