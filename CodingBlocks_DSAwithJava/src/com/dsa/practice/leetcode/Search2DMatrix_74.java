package com.dsa.practice.leetcode;

public class Search2DMatrix_74 {
    public static void main(String[] args) {
        int[][] matrix ={
                {1, 3, 5, 7}, {10, 11, 16, 20},{23, 30, 34, 60}
    };
    int target = 3;
  boolean ans = searchMatrix(matrix,target);
            System.out.println(ans);

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = m*n - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            int val = matrix[mid/n][mid%n];  // convert 1D index to 2D

            if (val == target) return true;
            else if (val < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
        }

    }

