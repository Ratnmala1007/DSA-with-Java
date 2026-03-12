package com.dsa.codingblocks.week6.day18;
//21-Feb-2026
//leetcode_125

public class PalindromeStr {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String str =sc.nextLine();
       //String str = "A man, a plan, a canal: Panama";
        String str = "45rac*,ecar,";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {

        str = str.toLowerCase();



        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {

                left++;
            }
         while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {

                right--;
            }
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}