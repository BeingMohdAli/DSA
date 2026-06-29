package cyclicsort;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int[] arr = {2,4,3,1,5};
        System.out.println(cyclicsort(arr));

    }

    public static String cyclicsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]!=i+1){
               int temp = arr[i];
               arr[i] = arr[arr[i]-1];
               arr[arr[i]-1] = temp;
           }
        }
        return Arrays.toString(arr);
    }
}
