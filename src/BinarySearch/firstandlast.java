package BinarySearch;

import java.util.Arrays;

public class firstandlast {
    static void main() {
int[] arr  = {5, 7, 7, 8, 8, 10};
int target = 8;
        int[] fandl = fandl(arr, target);
        String string = Arrays.toString(fandl);
        System.out.println(string);


    }
    public static int[] fandl(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int f = -1;
        int l = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                f = mid ;
                end = mid -1;
            }
            else if(target<arr[mid]){
                end = mid -1;

            }else {
                start = mid+1;
            }
        }
        start = 0;
        end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                l = mid ;
                start = mid +1;
            }
            else if(target<arr[mid]){
                end = mid -1;

            }else {
                start = mid+1;
            }
        }

        return new int[]{f,l};
    }


}
