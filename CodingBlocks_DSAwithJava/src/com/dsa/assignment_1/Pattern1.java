package com.dsa.assignment_1;

public class Pattern1 {

    public static void main(String args[]) {
        // Your Code Here

                int row = 0;

                while (row < 5) {
                    int col = 0;

                    while (col < 5) {

                        if (row == 0 || row == 4) {
                            System.out.print("* ");
                        }
                        else if (row == 1 || row == 3) {
                            if (col == 2) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        else if (row == 2) {
                            if (col == 0 || col == 4) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }

                        col++;
                    }
                    System.out.println();
                    row++;
                }
            }
        }
