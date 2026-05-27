package com.dsa.zoho.zoho;

public class Subsequnce {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("");
        int n = s.length();
        subsequnce(s,  n , 0,"");
    }
    public static void subsequnce(String s, int n , int i,String output){
        if(i == n){
            System.out.println(output);
            return;
        }
        subsequnce(s,n,i+1,output+s.charAt(i));
        subsequnce(s,n,i+1,output);


    }
}
