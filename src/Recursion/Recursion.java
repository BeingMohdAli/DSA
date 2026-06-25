package Recursion;

public class Recursion {

    static void main() {

        System.out.println(countZeros(188800023));
    }


    public static void num(int n) {
        if (n == 0) {
            return;
        }
        num(n - 1);
        System.out.println(n);
    }

    public static void numRev(int n) {
        if (n == 0) {
            return;

        }
        System.out.println(n);
        numRev(n - 1);


    }

    public static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

    public static int sumDigits(int n) {
        if (n / 10 < 1) {
            return n;

        }

        return n % 10 + sumDigits(n / 10);
    }

//    public static int printingReverseNum(int n){
//        if(n==0){
//            return 0;
//        }
//        System.out.print(n%10);
//        return reverseNum(n/10) ;
//    }

    public static int revNum(int n) {

        int digit = ((int) Math.log10(n)) + 1;
        return helper(n, digit);

    }

    private static int helper(int n, int digit) {
        if ((n / 10) < 1) {
            return n;
        }
        return (n % 10) * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }

    public static boolean palindrome(int n) {
        return n == revNum(n);


    }


   public  static int countZeros(int n) {
        if (n == 0) return 0;
        int rem = n % 10;
        int contribution = (rem == 0) ? 1 : 0;
        return contribution + countZeros(n / 10);
    }

}

