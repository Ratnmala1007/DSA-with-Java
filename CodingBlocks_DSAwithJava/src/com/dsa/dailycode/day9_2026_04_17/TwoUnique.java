package com.dsa.dailycode.day9_2026_04_17;
//unique element find in arr

import java.util.HashMap;

public class TwoUnique {
    public static void main(String[] args) {
        int[] arr ={ 1,2,1,2,3,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
            }

        }
    }
}
