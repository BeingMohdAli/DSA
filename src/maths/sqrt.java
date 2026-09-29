package maths;

public class sqrt {
    static void main() {

        System.out.println(sqrtOfX(49));
    }

    public static int sqrtOfX(int x){
        int start = 0;
        int end = x;
        while(start<=end){
            int mid = (start + end)/2;
            if(mid*mid==x){
                return mid;
            }
            else if((mid*mid)>x){
                end = mid - 1;
            } else if ((mid*mid)<x) {
                start = mid +1;
            }
        }
        return -1;
    }
}
