package com.dsa.codingblocks.recursion.NumSystem;

public class Print1toN {
  public static int sum(int n){
      if(n==0){
          return 0;}
      //System.out.println(n);

      return n+sum(n-1);
  }

    public static void main(String[] args) {
        sum(5);
        System.out.println(        sum(5));
    }
}
