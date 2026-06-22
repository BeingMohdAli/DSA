package BinarySearch;
// ceil means smallest number greater than equal to x
public class ceilx {
    static void main() {
        int arr[] = {2,3,4,5,8,83,98,100};
        int target = 99;
        System.out.println(ceilX(arr,target));
    }
    public static int ceilX(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;

            } else if (arr[mid]>target) {
                result = mid;
                end = mid-1;
            } else if (arr[mid] <target) {
                start = mid+1;
            }
        }
        return result;
    }

}