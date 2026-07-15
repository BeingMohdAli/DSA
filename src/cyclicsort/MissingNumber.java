package cyclicsort;

import java.util.Arrays;

public class MissingNumber {
    static void main() {
        int [] arr = {0,1,2,4};
        int i = missingNumber(arr);
        System.out.println(i);
    }

    public static int missingNumber(int[] arr){

        int i = 0;
        while(i < arr.length){
            if(arr[i]!=i && arr[i]<arr.length){
                int correctIndex = arr[i];
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                i++;
            }

        }
        i = 0;
        while(i < arr.length){
            if(arr[i]!=i){
                break;
            }else{
                i++;
            }
        }

        return i;
    }

}
