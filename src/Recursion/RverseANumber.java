package Recursion;

public class RverseANumber {
    static void main() {
        System.out.println(reverse(2345));
    }

    public static int reverse(int x) {
        if ((x / 10) == 0) {
            return x;
        }

        String s = "";
        int lastDigit = x % 10;
        int i = reverse(x / 10);
        String s1 = s + lastDigit + i;
        return Integer.parseInt(s1);

    }
}
