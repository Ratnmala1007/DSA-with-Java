package com.dsa.codingblocks.day02;
//                           *	*	*	*	*
//                              *	*	*	*	*
//                                  *	*	*	*	*
//                                      *	*	*	*	*
public class Pattern_3 {
    public static void main(String[] args) {
int n=4;
for(int row=0;row<n;row++){
    for(int space=0;space<=row-1;space++){
        System.out.print("\t");
    }
    for(int star=0;star<=n;star++){
        System.out.print("*\t");
    }
    System.out.println();
}
    }
}
