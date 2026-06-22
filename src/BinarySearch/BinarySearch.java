package BinarySearch;

public class BinarySearch {
    static void main() {
        int target = 46;
        int[] arr = {34,38,42,44,45,46,78,98};
        System.out.println(binarySearch(target,arr));
    }
    static int binarySearch(int target, int[] arr){
    int start = 0;
    int end = arr.length-1;

    while(start<=end){
        int mid = start + (end - start)/2;
        if(arr[mid]==target){
            return mid;
        } else if (arr[mid]<target) {
            start = mid +1;
        } else{
            end = mid -1;
        }
    }
    return -1;
    }
}
