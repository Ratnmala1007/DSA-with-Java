package com.dsa.assignment.assignment_2;

public class Gcd {
    static int gcd(int a, int b) {
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;
    }


        public static void main(String[] args)
        {
            int a = 20, b = 28;
            System.out.print(gcd(a, b));
        }
    }

//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int N1 = sc.nextInt();
//        int N2 =sc.nextInt();
//
//        int ans=1;
//
//        int n=(N1<N2)?N1:N2;
//        for(int i=2;i<=n;){
//            if(N1%i==0 && N2%i==0){
//                ans=ans*i;
//                N1=N1/i;
//                N2=N2/i;
//            }else{
//                i++;
//            }
//        }
//        System.out.print(ans);
//
//
//    }
//
//}
