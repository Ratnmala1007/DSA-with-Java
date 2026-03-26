package com.dsa.codingblocks.recursion.string;

import java.sql.SQLOutput;

public class CountSubsequences {
    private static void fun(String s,int i,int n, String output) {
    }
    private static int subCount(String s,int i,int n, String output){

        //Base case
        if(i==n){
            System.out.println(output);
            return 1;
        }
        //take
        int take=subCount(s,i+1,n,output+s.charAt(i));
       int notTake= subCount(s,i+1,n,output);
return take+notTake;
    }

    public static void main(String[] args) {
        String s="abc";
        int n=s.length();

        fun(s,0,n,"");
        System.out.println(subCount(s,0,n,""));
    }

}
