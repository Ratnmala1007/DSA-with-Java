package com.dsa.zoho;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        System.out.println( fact(n));
    }
//        int factorial =1;
//        for(int i =1;i<= n;i++){
//            factorial*=i;
//
//        }
//        System.out.println(factorial);
//    }
   public static int fact(int n) {
        if(n==0 || n==1){
            return 1;
        }
      return  n* fact(n-1);
   }

}
