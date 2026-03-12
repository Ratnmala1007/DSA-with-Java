package com.dsa.codingblocks.week1.day02;
//             *
//           * * *
//          * * * * *
//         * * * * * * *
//       * * * * * * * * *
public class Pattern_6 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        for (row = 1; row <=n; row++) {

            for (int space = 0; space < n - row; space++) {

                System.out.print("  ");
            }
            for (int star = 0; star < 2 * row - 1; star++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}