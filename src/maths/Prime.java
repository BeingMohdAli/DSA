package maths;

public class Prime {
    static void main() {
        System.out.println(isPrime(1));

    }
    public static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
