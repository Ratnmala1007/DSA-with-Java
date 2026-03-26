package com.dsa.codingblocks.binarysearch;
/*https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
Saturday-7/Feb/2026 */
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
     char []letters ={'c','f' ,'j'};

        char target= 'h';
        char ans=charSearch(letters,target);
        System.out.println(ans);
    }
    static char charSearch(char []letters,int target){
        int start = 0;
        int end = letters.length-1;


        while(start <= end){
            int mid = start + (end-start)/2;


        if (target < letters[mid]){
                end=mid-1;// end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
}






