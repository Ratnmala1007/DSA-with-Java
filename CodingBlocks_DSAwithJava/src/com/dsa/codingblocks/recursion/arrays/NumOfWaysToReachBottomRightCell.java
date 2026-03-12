package com.dsa.codingblocks.recursion.arrays;

public class NumOfWaysToReachBottomRightCell {
    private static int solve(int row,int col,int n,int m){
        //base case

        if(row>n || col>m)
            return 0;

        if(row==n-1 && col==m-1)
            return 1;
        int right = solve(row,col+1,n,m);
        int down = solve(row+1,col,n,m);
        return right+down;
    }

    public static void main(String[] args) {
        int n = 3;int m = 3;
        System.out.println(solve(0,0,n,m));
    }
}
