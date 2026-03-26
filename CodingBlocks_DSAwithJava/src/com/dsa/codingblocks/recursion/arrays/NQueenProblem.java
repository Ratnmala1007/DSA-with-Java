package com.dsa.codingblocks.recursion.arrays;

public class NQueenProblem {

    static void display(char[][] mat,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + ",");
            }
            System.out.println();
        }
    }
    static void solve(int col,int n,char[][]mat) {
        if (col == n) {
            display(mat, n);
            return;
        }
        for (int row = 0; row<n;row++){
            if (isSafe( row, col,mat, n)) {
                 mat[row][col]='Q';
                solve(col+1,n,mat);
                mat[row][col] ='.';
            }
        }
    }
    static boolean isSafe(int row,int col,char[][] mat,int n) {

        // check left row
        for(int j=0;j<col;j++){
            if(mat[row][j]=='Q')
                return false;
        }

        // check upper-left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(mat[i][j]=='Q')
                return false;
        }

        // check lower-left diagonal
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(mat[i][j]=='Q')
                return false;
        }

        return true;
    }
        public static void main(String[] args){
            char[][] mat ={
                    {'.','.','.','.'},
                    {'.','.','.','.'},
                    {'.','.','.','.'},
                    {'.','.','.','.'}

            };
            int n = mat.length;
            solve(0,n,mat);
        }
    }

