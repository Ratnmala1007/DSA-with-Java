package com.dsa.dailycode.day33_2026_06_02;

public class ClimbingStaire {
    public static void main(String[] args) {
        ways(4,"");
    }
    public static void ways(int n,String s){

        if(n==0){
            System.out.println(s);
            return;
        }
        if(n < 0){
            return;
        }
        ways(n-1,s+"1");
        ways(n-2,s+"2");
        ways(n-3,s+"3");

    }
}
