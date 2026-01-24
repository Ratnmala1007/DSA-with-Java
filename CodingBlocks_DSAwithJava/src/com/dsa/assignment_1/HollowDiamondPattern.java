package com.dsa.assignment_1;

import java.util.Scanner;

//        * * * * *
//        * *   * *
//        *       *
//        * *   * *
//        * * * * *
public class HollowDiamondPattern {

    public static void main(String args[]) {
        // Your Code Here

//                int row = 0;
//
//                while (row < 5) {
//                    int col = 0;
//
//                    while (col < 5) {
//
//                        if (row == 0 || row == 4) {
//                            System.out.print("* ");
//                        }
//                        else if (row == 1 || row == 3) {
//                            if (col == 2) {
//                                System.out.print("  ");
//                            } else {
//                                System.out.print("* ");
//                            }
//                        }
//                        else if (row == 2) {
//                            if (col == 0 || col == 4) {
//                                System.out.print("* ");
//                            } else {
//                                System.out.print("  ");
//                            }
//                        }
//
//                        col++;
//                    }
//                    System.out.println();
//                    row++;
//                }
//



                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

//        if (n < 3 || n % 2 == 0) {
//            return;
//        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // first and last row
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                }
                // second and second-last row
                else if (i == 1 || i == n - 2) {
                    if (j == 0 || j == 1 || j == n - 2 || j == n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                // middle rows
                else {
                    if (j == 0 || j == n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
                }
            }
        }



