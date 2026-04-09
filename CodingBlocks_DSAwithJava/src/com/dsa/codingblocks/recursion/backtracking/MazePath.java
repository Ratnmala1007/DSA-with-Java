package com.dsa.codingblocks.recursion.backtracking;

public class MazePath {

        public static void main(String[] args) {
            int n = 3, m = 3;
            printPaths(0, 0, n, m, "");
        }

        public static void printPaths(int row, int col, int n, int m, String path) {

            // reached destination
            if (row == n - 1 && col == m - 1) {
                System.out.print(path+" ");
                return;
            }

            // out of bounds
            if (row >= n || col >= m) {
                return;
            }

            // horizontal
            printPaths(row, col + 1, n, m, path + "H");

            // vertical
            printPaths(row + 1, col, n, m, path + "V");

            // diagonal
            printPaths(row + 1, col + 1, n, m, path + "D");
        }
    }

