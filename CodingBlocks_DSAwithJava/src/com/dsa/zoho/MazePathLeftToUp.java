package com.dsa.zoho;

public class MazePathLeftToUp {
    public static void main(String[] args) {
int row =2, col= 2,n = 0;
mazePath(0,2,2,"");
    }
    public static void mazePath(int n,int row ,int col,String path){
        if(row == 0 && col == 0 ){
            System.out.println(path);
            return;
        }

        if(row < 0 || col < 0){
            return;
        }
        mazePath(0,row-1,col,path+"u");
        mazePath(0,row,col-1,path+"l");

    }
}
