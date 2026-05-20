package com.dsa.dailycode.day22_2026_05_10.weeklyPractice;

import java.util.HashMap;

public class TwoUnique {
    public static void main(String[] args) {
        int[] arr = { 1,2,1,2,3,7,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        int count = 0;
        for (int num:arr){
            if(map.get(num)==1){
                System.out.print(num+" ");
                count++;

            }
            if(count==2){
                break;
            }
            }
    }
}
