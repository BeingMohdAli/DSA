package Recursion;

public class Recursion {

    static void main() {
        num(5);

    }

    public static void num(int n ){
       if(n==0){
           return;
       }
       num(n-1);
        System.out.println(n);
    }

}

