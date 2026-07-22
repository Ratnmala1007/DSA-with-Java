package com.dsa.dailycode.day49_2026_07_18;

public class LongestCommanPrefix {
    public static void main(String[] args) {
String[]strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String firstString = strs[0];

        for(int i =0; i < firstString.length();i++) {

            for (int j = 1; j < strs.length; j++) {
if(i == strs[j].length()){
    return firstString.substring(0,i);
}if (firstString.charAt(i) != strs[j].charAt(i)) {
                    return firstString.substring(0, i);
                }
            }}
        return firstString;


    }
}