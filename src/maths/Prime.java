package maths;

public class Prime {
    static void main() {
        int i = 25;
        for (int j = 0; j <= i; j++) {
            System.out.println(j + " " + isPrime(j));
        }

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
