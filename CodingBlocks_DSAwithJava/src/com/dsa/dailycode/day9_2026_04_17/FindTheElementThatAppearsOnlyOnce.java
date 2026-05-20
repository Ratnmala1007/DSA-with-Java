package com.dsa.dailycode.day9_2026_04_17;

public class FindTheElementThatAppearsOnlyOnce {
    public static void main(String[] args) {
        int[] arr ={ 1,1,3,5,3};
        //using xor works only 1 unique in arr for more than 1 unique use hashmap
        int result = 0;
        for(int num:arr){
            result = result ^ num;}
            System.out.println(result+" ");



   }
}
