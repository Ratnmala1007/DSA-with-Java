package com.dsa.codingblocks.week1.day02;

public class Pattern_8 {
        public static void main(String[] args) {
            int n = 5;

            // Upper part
            for (int row = 5; row >= 1; row--) {
                // spaces
                for (int space = 1; space <= row; space++) {
                    System.out.print("\t");
                }
                // stars
                for (int star = 1; star <= row ; star++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }

            // Lower part
            for (int row = 1; row <= n - 1; row++) {
                // spaces
                for (int space = 1; space <= row+1; space++) {
                    System.out.print("\t");
                }
                // stars
                for (int star = 1; star <= row + 1; star++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
