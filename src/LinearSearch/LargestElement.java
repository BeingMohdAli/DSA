package LinearSearch;

public class LargestElement {
    static void main() {
        int[] arr= {-4, -3, 0, 1, -8};
        System.out.println(largestElement(arr));

    }

    static int  largestElement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}