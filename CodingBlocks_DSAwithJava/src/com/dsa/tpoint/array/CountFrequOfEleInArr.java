package com.dsa.tpoint.array;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequOfEleInArr {
    public static void main(String[] args) {
        int[] arr = { 2,1,3,2,3};

                 count(arr);

    }
    public static void count(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int freq : arr){
          map.put(freq,map.getOrDefault(freq,0)+1) ;
        }
             for(Integer key : map.keySet()) {
                 System.out.println(key +"->"+map.get(key));
             }


        //System.out.println(map);
        }
}
