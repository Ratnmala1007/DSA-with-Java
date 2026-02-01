package com.dsa.codingblocks.day03;


    public class Star3 {
        public static void main(String args[]) {
            // Your Code Here

            int n=5 ,row=0;

            while( row<=n){

                int col=0;

                while(col<=n)

                {
                    if(row==0||row==4){
                        System.out.print("* ");
                        col++;
                    }
                    else if(row==1||row==3){
                        System.out.print("* ");
                        col++;

                    }
                    else{
                        System.out.print("* ");
                        col++;

                    }
                    System.out.println(" ");
                    row++;
                }
            }
        }
    }


