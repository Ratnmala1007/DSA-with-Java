package com.dsa.dailycode.day10_2026_04_15;

public class Hashmapcls {
    public static void main(String[] args) {
        String name = "Ratn";
        Integer num = 345678;
        int code1 = name.hashCode();
        int code2= num.hashCode();
        System.out.println(code1+"  "+'\n'+code2);
    }
}
