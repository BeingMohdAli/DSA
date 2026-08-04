package BinarySearch;

public class SearchInRotatedArray2 {

    static void main() {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};

        System.out.println(minimumElement(arr));
    }
//    public static boolean elementInRotatedSortedArray2(int[] arr,int target){
//        if(arr.length==1){
//            return arr[0]==target;
//        }
//        int start ,end;
//        int minElement = minimumElement(arr);
//        if(minElement==0){
//            if(target>arr[minElement]){
//                start = minElement + 1;
//                 end = arr.length-1;
//            }
//        }
//        else if(target>=arr[0]&&target<=arr[minElement-1]){
//            start = 0;
//            end = minElement-1;
//
//        }else{
//            start = minElement;
//            end = arr.length-1;
//        }
//
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid]==target){
//                return true;
//            } else if (arr[mid]>target) {
//                end = mid -1;
//
//            }else{
//                start = mid + 1;
//            }
//        }
//        return false;
//    }

    public static int minimumElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[end]){
                start = mid +1;
            }else if(arr[mid]<arr[end]) {
                end = mid;
            }else{
                end --;
            }
        }
        return start ;
    }
}
