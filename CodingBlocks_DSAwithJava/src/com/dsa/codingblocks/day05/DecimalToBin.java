package com.dsa.codingblocks.day05;

public class DecimalToBin {
    public static void main(String[] args) {
    //*****Method1********
//        int n = 9;
//        int bin = 0;
//        int mul = 1;
//        while (n > 0) {
//            int rem = n % 2;
//            bin = rem * mul + bin;
//            mul *= 10;
//            n /= 2;
//        }
//
//        System.out.println(bin);
//    }
//****************method2*********/
//        int n=8;
//        int bin=0;
//        int place=1;
//        while(n>0){
//            int rem =n%2;
//            bin =bin+rem*place;
//            place=place*10;
//            n/=2;
//
//        }
//        System.out.println(bin);
//    }
        //*********method 3************
        int n=2;
        String bin="";
        while(n>0){
            bin=(n%2)+bin;
            n/=2;
        }
        System.out.println(bin);


}

}
