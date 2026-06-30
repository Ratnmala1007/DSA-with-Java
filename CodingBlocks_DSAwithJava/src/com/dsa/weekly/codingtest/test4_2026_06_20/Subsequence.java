package com.dsa.weekly.codingtest.test4_2026_06_20;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("");
        int n = s.length();
        subsequence(s,n,0,"");
    }
    public static void subsequence(String s,int n,int i,String path){
        if(i == n){
            System.out.println(path);
            return;
        }


            subsequence(s, n,i+ 1, path + s.charAt(i));
        subsequence(s, n,i+1, path);
        }
    }


