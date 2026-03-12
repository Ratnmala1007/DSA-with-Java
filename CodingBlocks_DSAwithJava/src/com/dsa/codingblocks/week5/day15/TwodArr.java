package com.dsa.codingblocks.week5.day15;

public class TwodArr {
    public static void main(String[] args) {
        int[][] arr = {
                //{1, 5, 9},{ 13, 14, 10},{ 6, 2, 3},{ 7, 11, 15},{ 4, 8, 12, 16}
                {1,2,3},{4,5,6}
        };

        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr[i].length; j++) {   // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
