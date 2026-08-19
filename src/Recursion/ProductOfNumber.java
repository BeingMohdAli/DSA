package Recursion;

public class ProductOfNumber {
    static void main() {
        System.out.println(productOfNumber(23722));
    }

    public static int productOfNumber(int x){
        if((x/10)==0){
            return x;
        }
        int lastDigit = x%10;
        int i = productOfNumber(x / 10);
        return i*lastDigit;

    }
}
