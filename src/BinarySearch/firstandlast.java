package BinarySearch;

public class firstandlast {
    static void main() {
int[] arr  = {5, 7, 7, 8, 8, 10};
int target = 8;
        System.out.println(f(arr,target));
        System.out.println(l(arr,target));

    }
    public static int f(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                ans = mid ;
                end = mid -1;
            }
            else if(target<arr[mid]){
                end = mid -1;

            }else {
                start = mid+1;
            }
        }
        return ans;

    }


    public static int l(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                ans = mid ;
                start = mid +1;
            }
            else if(target<arr[mid]){
                end = mid -1;

            }else {
                start = mid+1;
            }
        }
        return ans;

    }



}
