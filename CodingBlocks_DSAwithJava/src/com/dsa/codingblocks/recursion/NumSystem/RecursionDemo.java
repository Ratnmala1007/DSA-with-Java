package com.dsa.codingblocks.recursion.NumSystem;

public class RecursionDemo {

  static  int count = 0;
    static void  fun(){



        if(count==10){
            return;
        }
            System.out.println(count);
            count++;

fun();
    }

    public static void main(String[] args) {
fun();
    }
}