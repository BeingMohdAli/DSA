package Recursion;

public class Recursion {

    static void main() {
        printBoth(5);

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

}

