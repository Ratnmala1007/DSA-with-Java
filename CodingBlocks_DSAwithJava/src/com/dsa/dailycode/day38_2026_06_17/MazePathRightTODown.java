package com.dsa.dailycode.day38_2026_06_17;

public class MazePathRightTODown {
    public static void main(String[] args) {
        int n = 3,col,row;
        path(3,0,0,"");
    }
    public static void path(int n,int row,int col,String path){

        if(row == n-1 && col == n-1){
            System.out.println(path);
            return;
        }
        if(row >= n || col >= n){
            return;
        }
        path(n,row+1,col,path+"D");
        path(n,row,col+1,path+"R");
    }
}
