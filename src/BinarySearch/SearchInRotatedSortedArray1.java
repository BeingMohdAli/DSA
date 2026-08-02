package BinarySearch;

public class SearchInRotatedSortedArray1 {

    static void main() {
        int[] arr =
                {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(findingInRotatedSortedArray(arr,target));
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

    public static int findingInRotatedSortedArray(int[] arr,int target){
        if(arr.length==1){
            if (arr[0] == target) {

                return 0;
            }else{
                return -1;
            }
        }
        int start = 0;
        int end = findMinimumIndex(arr)-1;
        if(target<=arr[end]&&target>=arr[start]){
        while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            start = mid +1 ;

        }else{
            end = mid-1;
        }
    }
}
            start =  end +1;
            end = arr.length-1;
            int ans = -1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]==target){
                 ans =mid;
                 break;
                }else if(arr[mid]<target){
                    start = mid +1 ;
                }else{
                    end = mid-1;
                }
            }
            return ans;
        }

    }

