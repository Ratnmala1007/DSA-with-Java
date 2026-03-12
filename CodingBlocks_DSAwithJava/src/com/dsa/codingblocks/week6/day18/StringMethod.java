package com.dsa.codingblocks.week6.day18;

public class StringMethod {
    public static void main(String[] args) {
        String s="Hello";
        String s1="hello";
        System.out.println(s.length());//length of string is 5
        System.out.println(s.charAt(2));//return the char at a given index at 2 position is l
        System.out.println(s.substring(1,4));//it returns the substring which is start from 1 and n-1 ell
        System.out.println(s.indexOf('l'));//here returns the first occuraance of substring index and when not present char it returns -1
        System.out.println(s.indexOf("hello"));//it returns string index
        System.out.println(s.lastIndexOf('l'));//here returns the last occurance of substring index and when not present char it returns -1
        System.out.println(s.equals(s1));//compares 2 string for equality
        System.out.println(s.equalsIgnoreCase(s1));//ignore case sensitive
        System.out.println(s==s1);
        System.out.println(s.compareTo(s1));//compare lexiographically rteurns <0 if 1st<2nd ,0 when equals 1st>2nd
    }
}
