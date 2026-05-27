package com.dsa.dailycode.day32_2026_05_27;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n = 3;
        solve(0,0,n,"");
    }
    public static void solve(int open,int close,int n,String ans ){
        if(ans.length() == 2*n){
            System.out.println(ans);
            return;
        }
        if(open < n){
               solve(open+1,close,n,ans+"(") ;
    }
        if(close < open){
            solve(open,close+1,n,ans+")");
        }
    }


}
