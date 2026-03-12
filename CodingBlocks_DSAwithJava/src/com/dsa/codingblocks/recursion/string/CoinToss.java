package com.dsa.codingblocks.recursion.string;

public class CoinToss {
    public static void main(String[] args) {
        int n = 2;
        print("",0,n);
    }
    static void print(String p,int i,int n){
        if(i==n){
            System.out.print(p+" ");
            return;
        }
        //Head
        if(p.isEmpty() || p.charAt(p.length()-1)!='H' )
        print(p + 'H',i + 1,n);
        //Tail
        print(p + 'T',i + 1,n);
    }
}


