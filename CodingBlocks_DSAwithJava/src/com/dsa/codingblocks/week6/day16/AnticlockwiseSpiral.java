package com.dsa.codingblocks.week6.day16;

import java.util.Scanner;

public class AnticlockwiseSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printClockwise(matrix, m, n);
    }
    static void printClockwise(int[][]matrix,int m,int n){
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while(top<=bottom && left<=right){
            // 1. Left column (top → bottom)

            for(int i = top;i<=bottom;i++){
                System.out.println(matrix[i][left]+",");
            }
            left++;
            // 2. Bottom row (left → right)
            if(left<=right) {
                for (int i = left; i <= right; i++) {
                    System.out.println(matrix[bottom][i] + ",");
                }
                bottom--;
            }
            // 3. Right column (bottom → top)
            if(left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.println(matrix[i][right]+",");
                    }
                    right--;
                }
            // 4. Top row (right → left)
            if(top <= bottom) {
                       for(int i=right;i>=left;i--){
                           System.out.println(matrix[top][i]+",");
                    }
                        top++;

                    }
            }
        }
    }

