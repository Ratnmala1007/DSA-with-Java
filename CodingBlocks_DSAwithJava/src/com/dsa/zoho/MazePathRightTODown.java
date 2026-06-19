package com.dsa.zoho;

public class MazePathRightTODown {
    public static void main(String[] args) {
        int n = 3,col,row;
        path(3,0,0,"");
    }
    public static void path(int n,int col,int row,String path){

        if(col == n-1 && row == n-1){
            System.out.println(path);
            return;
        }
        if(col >= n || row >= n){
            return;
        }
        path(n,row+1,col,path+"D");
        path(n,row,col+1,path+"R");
    }
}
