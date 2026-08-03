package BinarySearch;

public class SearchInRotatedSortedArray1 {

    static void main() {
        int[] arr =
                {4,5,6,6,7,0,1,2,4,4};
        int target = 1;
        System.out.println(findMinimumIndex(arr));
    }
    public static int findMinimumIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[end]){
                start = mid +1 ;
            }else{
                end = mid ;
            }
        }
        return start;
    }

//    public static int findingInRotatedSortedArray(int[] arr,int target){
//        if(arr.length==1){
//         return  arr[0]==target ? 0:-1;
//        }
//        int start , end;
//        int pivot = findMinimumIndex(arr);
//        if(pivot==0){
//            start = 0;
//            end = arr.length -1;
//        }
//        else if(target<=arr[pivot-1]&&target>=arr[0]){
//     start = 0;
//     end = pivot -1;
//}
//        else {
//            start = pivot;
//            end = arr.length - 1;
//        }
//
//            while(start<=end){
//                int mid = start + (end-start)/2;
//                if(arr[mid]==target){
//              return mid;
//                }else if(arr[mid]<target){
//                    start = mid +1 ;
//                }else{
//                    end = mid-1;
//                }
//            }
//            return -1;
//        }

    }

