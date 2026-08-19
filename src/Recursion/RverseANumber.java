package Recursion;

public class RverseANumber {
    static void main() {
        System.out.println(reverse(-2345));
    }

    public static int reverse(int x) {
        if ((x / 10) == 0) {
            return x;
        }
        if(x<0){
          return -reverse(-x);
        }


        int lastDigit = x % 10;
        int i = reverse(x / 10);
        String s1 = "" + lastDigit + i;
        return Integer.parseInt(s1);

    }
}
