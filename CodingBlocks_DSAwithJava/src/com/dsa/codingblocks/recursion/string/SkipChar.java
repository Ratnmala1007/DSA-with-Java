package com.dsa.codingblocks.recursion.string;

public class SkipChar {
    public static void main(String[] args) {
       skip(" ","bacaappleecad");
    }
    static void skip(String empty,String s){
        if(s.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch = s.charAt(0);
if(ch=='a'){
        //if(s.startsWith("apple") ){
            skip(empty,s.substring(1));
        }
        else{
            skip(empty + ch,s.substring(1));
        }
    }
}
