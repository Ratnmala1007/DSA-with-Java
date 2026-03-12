package com.dsa.codingblocks.week5.day15;

//find target ele when matrix is not sorted
public class UnsortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {9, 8, 2},
                          {3, 5, 6}};
        int target = 8;

        int[] result = search(matrix, target);

        if(result[0] != -1) {
            System.out.println("Element found at row " +
                    result[0] + " and column " +
                    result[1]);
        } else {
            System.out.println("Element not found");
        }
    }



    static int[] search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                   return new int[]{i, j};
                }
                }
            }
            return new int[]{-1,-1};

    }
}