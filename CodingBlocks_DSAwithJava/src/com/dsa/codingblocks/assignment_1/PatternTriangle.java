package com.dsa.codingblocks.assignment_1;
//                   1
//                 2 3 2
//               3 4 5 4 3
//             4 5 6 7 6 5 4


public class PatternTriangle {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // decreasing numbers
            num = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
//        int n=5;
//        int row=1;
//        for(row=1;row<=n;row++) {
//
//                for(int space=1;space<=n-row;space++) {
//
//                    System.out.print("  ");
//                   }
//                for(int star=1;star<=2*row-1;star++){
//                 System.out.print(star+" ");
//
//               }
//
//
//            System.out.println();
//        }}
    }
    }

