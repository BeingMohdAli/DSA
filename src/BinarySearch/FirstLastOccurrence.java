package BinarySearch;

import java.util.Arrays;

public class FirstLastOccurrence {

    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 11;

        int first = search(arr, target, true);
        int last = search(arr, target, false);

        int[] ansarray = {first,last};
        System.out.println(Arrays.toString(ansarray));
    }

    static int search(int[] nums, int target, boolean findStart) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;


        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            }
            else if(target > nums[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;

                if(findStart) {
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right
                }
            }
        }

        return ans;
    }
}