package BubbleSort;

import static java.lang.IO.print;

public class BubbleSort {
    static void main() {
   int[] arr = {23,56,42,21};
   bs(arr);
    }

    static void bs(int[] arr){

        boolean flag ;

        for (int i = 0; i < arr.length-1; i++) {
            flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;

                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }

        for(int x:arr){
            System.out.println(x);
        }
    }

}
