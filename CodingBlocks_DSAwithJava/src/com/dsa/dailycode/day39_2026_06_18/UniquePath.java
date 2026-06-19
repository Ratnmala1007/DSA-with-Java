package com.dsa.dailycode.day39_2026_06_18;

public class UniquePath {
    public static void main(String[] args) {
        int n =3; int m =7;
        System.out.println(uniquePath(n,m,0,0));
    }
   public static int uniquePath(int n,int m ,int row,int col){
        if(row == n-1&& col == m-1){
           // System.out.println(path);
            return 1;
        }
        if(row >=n || col >=m){
            return 0;
        }
      int down = uniquePath( n, m , row+1, col);
      int right =uniquePath( n, m , row, col+1);

      return down+right;

   }
}
