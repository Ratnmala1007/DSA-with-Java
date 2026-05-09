package com.dsa.dailycode.day20_2026_05_08;

import java.util.HashMap;
//        Start count = 1
//        Compare current char with next char
//        If same → count++
//        Else → print char + count and reset count

public class StringCompression {
    public static void main(String[] args) {
        String s = "abbcccd";

        StringBuilder result = new StringBuilder();

        int count = 1;
            for (int i = 0; i <s.length()-1; i++) {
             if(i < s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                 count++;
             }
             else{
                 result.append(s.charAt(i));
                 result.append(count);

                 count = 1;
             }
            }

        System.out.println(result);
    }


            }




