package com.dsa.dailycode.day43_2026_06_26;public class
StringDivideInEqualParts {

    public static void main(String[] args) {
        String s = "Ratnmala";
        int k = 2;
        divideString(s,k);
    }
    public static void divideString(String s,int k){
      //  int len = s.length();
         if(s.length() % k !=0){
             System.out.println("Cannot divide into equal parts");

             return;
         }
         int partition = s.length()/2;

         for(int i =0; i< s.length();i += partition){
             System.out.println(s.substring(i,i+partition));
         }

    }

}
