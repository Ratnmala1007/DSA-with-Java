package com.dsa.zoho;

public class ClimbingStaire1 {
    public static void main(String[] args) {
        int n = 4;
      // ClimbingStaire1 ct = new ClimbingStaire1();
        climb(4," ");
    }

        public static void climb(int n,String s){
            if(n == 0){
                System.out.println(s+"");
                return ;
            }
            if(n < 0){
                return;
            }
            climb(n-1,s+"1");
            climb(n-2,s+"2");
        }
    }

