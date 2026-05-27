package com.dsa.zoho.zoho;

public class CoinToss {
    public static void main(String[] args) {
toss(2,"");
    }
    public static void toss(int n, String output){
        if(n==0){
            System.out.println(output);
            return;
        }
        toss(n-1,output+"H");
        toss(n-1,output+"T");

    }
}
