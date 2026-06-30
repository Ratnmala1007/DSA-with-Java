package com.dsa.dailycode.day42_2026_06_22;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World of Java ";
       // s = s.toLowerCase();
        int count = 0;
        s = s.trim();
        for(int i =s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if( ch != ' ' ){
              count++;
            }
            else{
                break ;
            }
        }

        System.out.println(count);

    }
}
