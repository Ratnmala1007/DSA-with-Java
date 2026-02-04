package com.dsa.assignment.assignment_1;

import java.util.Scanner;
//           1
//         2 3 2
//       3 4 5 4 3
//      5 6 7 6 5 4
//        3 4 5 4 3
//          2 3 2
//            1
public class PatternRhombusDiamond {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();   // n = 3 for your example

            // upper half (including middle)
            for (int i = 1; i <= n; i++) {

                // spaces
                for (int s = n; s > i; s--) {
                    System.out.print("  ");
                }

                // increasing numbers
                int num = i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }

                // decreasing numbers
                num -= 2;
                for (int j = 1; j < i; j++) {
                    System.out.print(num + " ");
                    num--;
                }

                System.out.println();
            }

            // lower half
            for (int i = n - 1; i >= 1; i--) {

                // spaces
                for (int s = n; s > i; s--) {
                    System.out.print("  ");
                }

                // increasing numbers
                int num = i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }

                // decreasing numbers
                num -= 2;
                for (int j = 1; j < i; j++) {
                    System.out.print(num + " ");
                    num--;
                }

                System.out.println();
            }
        }
    }


