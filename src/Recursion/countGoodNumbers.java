package Recursion;

import java.util.HashMap;

public class countGoodNumbers {
    static void main() {
        System.out.println(goodNumbers(3));

    }

    public static int goodNumbers(long n){
       long evenPosition = (n+1)/2;
        long oddPosition = n/2;

        long l = myPow(5, evenPosition) * myPow(4, oddPosition);
        long l1 = l % 1_000_000_007;
        return (int)l1;

    }

    public static long myPow(long x, long position) {
        if(position==0){
            return 1;
        }

        if(position%2==0){
            return myPow(x*x,position/2);
        }

        return x*myPow(x*x,position/2);
    }
}
