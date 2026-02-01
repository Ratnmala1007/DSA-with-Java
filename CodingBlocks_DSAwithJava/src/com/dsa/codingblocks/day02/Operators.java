package com.dsa.codingblocks.day02;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator
        int a=20;
        int b=10;
        int sum=a+b;
        int diff=a-b;
        int div=a/b;
        int product= a*b;
        int mod=a%b;


        System.out.println(sum);
        System.out.println(diff);
        System.out.println(div);
        System.out.println(product);
        System.out.println(mod);

//Relational operator
boolean flag = a>b;
        System.out.println(flag);


      //  unary operator
int x=10;
     int postincrement = x++;
     int preincrement = ++x;

        System.out.println("postincrement:"+postincrement);

        System.out.println("preincrement:"+preincrement);

        //Logical operator

        int a1=10;
        int a2=20;
        System.out.println(!(a1>10 && a2<10));
        System.out.println(a1>10|| a2>10);
        //System.out.println(a1!=10);


        //Assignement operator

        int n=10;
        System.out.println(n+=5);
        System.out.println(n-=2);
        System.out.println(n*=4);
        System.out.println(n/=3);
        System.out.println(n%=4);
    }

}
