package com.dsa.codingblocks.week1.day02;

public class Pattern_7 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            for(int space=n;space>row;space--){
                System.out.print("\t");
            }
            for(int star=n;star>row;star--){
                System.out.print("*\t");
            }
            System.out.println();
        }
        //lower half
        for(int row=0;row<n-1;row++){
            for(int space=0;space<=row+1;space++){
                System.out.print("\t");
            }
            for(int star=0;star<=row+1;star++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}



