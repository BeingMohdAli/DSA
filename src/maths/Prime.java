package maths;

public class Prime {
    static void main() {
        int i = 40;
        int count= 0;
        for (int j = 2; j <= i; j++) {
            boolean prime = isPrime(j);
            if(prime){
                count++;
                System.out.println(j+ " " + count);
            }
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
