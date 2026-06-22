package BinarySearch;

public class searchelementinrotatedarray {
    static void main() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        System.out.println(bs(arr, target));


    }


    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start != end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
               end = mid;
            }
        }
        return start;
    }
    
    static int bs(int[] nums, int target) {
        int start = 0;
        int end = pivot(nums)-1;

        while (start<= end) {
            int mid = start + (end-start)/2;
            if (nums[mid]==target) {
                return mid;
            } else if (nums[mid]<target) {
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
          return bss(nums,target);

    }

    static int bss(int[] arr, int target) {
        int start = pivot(arr);
        int end = arr.length-1;
        while (start<= end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                return mid;
            } else if (arr[mid]<target) {
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

}