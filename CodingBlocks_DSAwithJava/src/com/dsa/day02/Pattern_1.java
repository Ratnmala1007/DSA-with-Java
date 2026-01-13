package com.dsa.day02;
//				        *
//					*	*
//				*	*	*
//			*	*	*	*
//		*	*	*	*	*
public class Pattern_1 {
    public static void main(String[] args) {


        int n = 5;
        for (int row = 0; row < n; row++) {
for(int space=0;space<=n-row;space++){
    System.out.print("\t");

}
for(int star=0;star<=row;star++){
            System.out.print("*\t");
        }
        System.out.println();
    }
}}