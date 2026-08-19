package Recursion;

public class sumOfDigits {
    static void main() {
        int sumofdigits = sumofdigits(765);
        System.out.println(sumofdigits);
    }
    public static int sumofdigits(int n){
        if((n/10)==0){
           return n;
        }
        int lastdigit = n%10;
        int i = sumofdigits(n / 10);
        return i + lastdigit;
    }
}
