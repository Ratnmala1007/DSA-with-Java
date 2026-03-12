package com.dsa.codingblocks.week5.day15;

public class SortedRowColWise {
    public static void main(String[] args) {


        int[][] matrix = {{1, 3, 4, 5},
                {2, 6, 8, 9},
                {6, 10, 23, 34},
                {11, 12, 45, 56}};
        int target = 34;

        System.out.println(search(matrix, target));

    }

    static boolean search(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length - 1;

        int row = 0;
        int col = m;


        while (row < n && col >= 0) {


            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;//move left
            } else {
                row++;//move down
            }
        }

        return false;
    }
}