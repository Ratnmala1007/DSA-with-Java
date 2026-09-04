package com.dsa.dailycode.day55_2026_07_31;

public class LongestPalidromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        int n= s.length();
//        int left ;
//        int right;
//        int max=0;
//        int start=0,end=0;
        //System.out.println(validPalindrome(s,0,n-1));
        System.out.println( longestString(s,0,0,0));
    }
public static String longestString(String s,int max,int start,int end) {
   for(int i=0;i<s.length();i++) {
       for (int j = 1; j < s.length(); j++) {
           if (validPalindrome(s, i, j) == true) {

               if ((j - i + 1) > max) {
                   max = j - i + 1;
                   start = i;
                   end = j;
               }
           }
       }
   }
       return s.substring(start,end+1);
}
    public static boolean validPalindrome(String s,int left,int right) {
            while (left < right) {
                if(s.charAt(left)!= s.charAt(right)){
                    return false;
                }

            left++;
            right--;
        }
        return true;
    }

}