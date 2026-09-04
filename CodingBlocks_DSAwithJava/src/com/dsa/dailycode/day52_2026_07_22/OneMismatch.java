package com.dsa.dailycode.day52_2026_07_22;


import java.util.ArrayList;
import java.util.List;

public class OneMismatch {
    public static void main(String[] args) {
        String[] strs = {"bana", "bananza", "banaba" };
        String match = "banana";
        System.out.println(str(strs,match));
    }
    public static List<String> str(String[]strs, String match){
        List<String> result = new ArrayList<>();
        for(int i =0;i<strs.length;i++){
            int count = 0;

            String word = strs[i];

            if (word.length() != match.length()) {
                continue;
            }
            for(int j =0;j<match.length();j++){

                if(word.charAt(j)!=match.charAt(j)){
    count+=1;
                }
            }
if(count ==1){
 result.add(word);
}}

return result;
    }
}
