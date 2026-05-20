package com.dsa.dailycode.day23_2026_05_11.weeklyPractice;
//        Start count = 1
//        Compare current char with next char
//        If same → count++
//        Else → print char + count and reset count

public class StringCompression {
    public static void main(String[] args) {
        String s = "abbdccc";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++){
        if (i < s.length()-1 && s.charAt(i)==s.charAt(i+1)){
            count++;
            }

            else{
                    sb.append(s.charAt(i));
           if(count > 1) {

                sb .append(count);
           }

            count = 1;
        }

        }
        System.out.println(sb);
    }
}
