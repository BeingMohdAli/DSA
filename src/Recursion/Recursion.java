package Recursion;

public class Recursion {

    static void main() {

        System.out.println(sumDigits(142507));
    }


    public static void num(int n ){
       if(n==0){
           return;
       }
       num(n-1);
        System.out.println(n);
    }
    public static void numRev(int n){
        if(n==0){
            return;

        }
        System.out.println(n);
        numRev(n-1);


    }

    public static void printBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }

    public static int fact(int n){
     if(n==1||n==0){
         return 1;
     }
     return n* fact(n-1);
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n+sum(n-1);
    }

    public static int sumDigits(int n ){
        if(n/10<1){
            return n;

        }

        return n % 10 + sumDigits(n/10);
    }
}

