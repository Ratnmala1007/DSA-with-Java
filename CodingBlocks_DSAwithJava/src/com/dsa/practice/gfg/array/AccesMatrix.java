package com.dsa.practice.gfg.array;

public class AccesMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
               // {9, 10, 11, 12}};
        // Traversing over all the rows
        for (int i = 0; i < arr[0].length; i++) {
            // Traversing over all the columns of each row
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }
}