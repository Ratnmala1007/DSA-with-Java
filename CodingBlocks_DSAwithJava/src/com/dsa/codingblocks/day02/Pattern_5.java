package com.dsa.codingblocks.day02;
//         *
//        * *
//       * * *
//      * * * *
public class Pattern_5 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row < n; row++) {
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for (int star = 0; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
