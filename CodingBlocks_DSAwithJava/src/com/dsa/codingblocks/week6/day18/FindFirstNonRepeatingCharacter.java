package com.dsa.codingblocks.week6.day18;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s="lieletcode";

        int []freq=new int[26];
        for(int i=0;i<s.length();i++){
         freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++) {
            if (freq[s.charAt(i)-'a']== 1) {
                System.out.println(i);
                break;
            }
        }
}

}
