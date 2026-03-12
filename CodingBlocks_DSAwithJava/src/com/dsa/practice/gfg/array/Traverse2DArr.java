package com.dsa.practice.gfg.array;

public class Traverse2DArr {
    public static void main(String[] args) {

        int[][] arr ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        int m=arr.length;
        int n=arr[0].length;
        int[][]transpose = new int[n][m];
        //Accessing elements f matrix
        //System.out.println(arr[0][1]);//row 0 col 1 ele is 2
                // Traversing over all the rows
        for(int i=0; i< m;i++) {
            // Traversing over all the columns of each row

            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");

                transpose[j][i] = arr[i][j];

                }
            System.out.println();

        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
    }

