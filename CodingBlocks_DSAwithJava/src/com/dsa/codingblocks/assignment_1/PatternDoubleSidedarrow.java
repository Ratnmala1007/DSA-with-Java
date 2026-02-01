package com.dsa.codingblocks.assignment_1;

public class PatternDoubleSidedarrow {
        public static void main(String[] args) {

            int n = 4;
            int totalRows = 2 * n - 1;

            for (int i = 1; i <= totalRows; i++) {

                int row;
                if (i <= n) {
                    row = i;
                } else {
                    row = totalRows - i + 1;
                }

                // leading spaces
                for (int s = 0; s < (n - row) * 4; s++) {
                    System.out.print(" ");
                }

                // left numbers (row → 1)
                for (int j = row; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                // middle spaces
                for (int s = 0; s < (row - 1) * 6; s++) {
                    System.out.print(" ");
                }

                // right numbers (1 → row)
                if (row != 1) {
                    for (int j = 1; j <= row; j++) {
                        System.out.print(j + " ");
                    }
                }

                System.out.println();
            }
        }
    }


