package selectionsort;

import java.util.Arrays;

public class selectionsort {
    static void main() {
        int arr[]  = {8,6,3,2,5,4};

        System.out.println(selectionSort(arr));

    }
    public static  String selectionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int k =i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[k]){
                    k = j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
        }
        return Arrays.toString(arr);
    }
}
