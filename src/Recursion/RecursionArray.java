package Recursion;

public class RecursionArray {
    static void main() {
    int[] arr =
            {2,3,9,5};
        System.out.println(sorted(arr));
    }

    public static boolean sorted(int[] arr){

        if(arr.length==1){
            return true;
        }
        return helper3(arr,0);
    }

    private static boolean helper3(int[] arr, int i) {
       if(i ==arr.length-1){
           return true;
       }
        return arr[i]<arr[i+1] && helper3(arr,i+1);
    }
}
