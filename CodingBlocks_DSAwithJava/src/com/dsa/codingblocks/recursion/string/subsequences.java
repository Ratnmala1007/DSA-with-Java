package com.dsa.codingblocks.recursion.string;

public class subsequences {
//    public static void main(String[] args) {
//        subseq("","abc");
//    }
//    static void subseq(String p,String up){
//        if(up.isEmpty()){
//            System.out.print(p+" ");
//            return;
//        }
//        char ch = up.charAt(0);
//        subseq(p + ch,up.substring(1));
//        subseq(p,up.substring(1));
//    }

    private static void fun(String s,int i,int n, String output){
        //Base case
        if(i==n){
            System.out.println(output);
            return;
        }
        //take
        fun(s,i+1,n,output+s.charAt(i));
        fun(s,i+1,n,output);

    }

    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb = new StringBuilder("");
        int n=s.length();

        fun(s,0,n,"");

    }
}
