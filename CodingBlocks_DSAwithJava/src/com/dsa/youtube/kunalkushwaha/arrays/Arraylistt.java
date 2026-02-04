package com.dsa.youtube.kunalkushwaha.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistt {
    public static void main(String[] args) {

Scanner in =new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
//        list.add(11);
//        list.add(20);
//        list.add(30);
//        list.add(111);
//        list.add(210);
//        list.add(320);
//        list.add(101);
//        list.add(208);
//        list.add(390);
//
//        System.out.println(list);
//        list.set(1,34);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here,list[index] syntax will not work here
        }

    }
}