package BinarySearch;

public class PeakMountainInAnArrayusinglinearsearch {
    static void main() {
        int[] arr = {1,2,3,2};
        System.out.println(Element(arr));
    }
    static int Element(int[] arr){
        int i = 1;
        int ans =-1;
        while(arr[i]>arr[i-1]){
            i++;
        }
        return ans = i-1;
    }
}
