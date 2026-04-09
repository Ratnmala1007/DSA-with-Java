package com.dsa.codingblocks.recursion.backtracking;

public class MazePathCount {

        public static void main(String[] args) {
            int n = 3;
            int m = 3;

            // Part (a): Count ways
            int totalWays = countWays(0, 0, n, m);
            //System.out.println("Total Ways: " + totalWays);
            System.out.println(totalWays);

            // Part (b): Print all paths
            //System.out.println("Paths:");
            printPaths(0, 0, n, m, "");
        }

        // Function to count total ways
        public static int countWays(int row, int col, int n, int m) {

            // reached destination
            if (row == n - 1 && col == m - 1) {
                return 1;
            }

            // out of bounds
            if (row >= n || col >= m) {
                return 0;
            }

            int h = countWays(row, col + 1, n, m);      // Horizontal
            int v = countWays(row + 1, col, n, m);      // Vertical
            int d = countWays(row + 1, col + 1, n, m);  // Diagonal

            return h + v + d;
        }

        // Function to print all paths
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

            // Horizontal
            printPaths(row, col + 1, n, m, path + "H");

            // Vertical
            printPaths(row + 1, col, n, m, path + "V");

            // Diagonal
            printPaths(row + 1, col + 1, n, m, path + "D");
        }
    }

