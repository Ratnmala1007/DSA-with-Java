package com.dsa.practice.gfg.array;

public class SqureMatrix {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},{13,14,15,16}

        };
        int i=arr.length;
        int j=arr[0].length;
if( i==j){
    System.out.println("square matrix");
}
else{
    System.out.println("not square matrix");
}
    }
}