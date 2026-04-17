package com.dsa.dailycode.day9_2026_04_17;

public class FindTheElementThatAppearsOnlyOnce {
    public static void main(String[] args) {
        int[] arr ={ 1,1,2,3,4,3,2};
        int result = 0;
        for(int num:arr){
            result = result ^ num;}
            System.out.println(result+" ");
    }
}
