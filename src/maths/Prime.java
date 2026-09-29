package maths;

public class Prime {
    static void main() {
        System.out.println(isPrime(17));

    }
    public static boolean isPrime(int x){
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
