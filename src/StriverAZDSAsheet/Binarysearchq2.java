package StriverAZDSAsheet;

public class Binarysearchq2 {
//    Given a sorted array of nums and an integer x, write a program to find the lower bound of x.
//
//    The lower bound algorithm finds the first and smallest index in a sorted array where the value at that index
//    is greater than or equal to a given key i.e. x.
//
//    If no such index is found, return the size of the array.
//
//
//            Example 1
//
//    Input : nums= [1,2,2,3], x = 2
//
//    Output:1
//
//    Explanation:
//
//    Index 1 is the smallest index such that arr[1] >= x.
//    class Solution {
//        public int lowerBound(int[] nums, int x) {
//            int start = 0;
//            int end = nums.length -1 ;
//            int ans = -1;
//            if(nums[end]<x){
//                return nums.length;
//            }
//            while(start<=end){
//                int mid =( start + end )/2;
//                if(nums[mid]<x){
//                    start = mid +1;
//                }
//                else{
//                    ans = mid ;
//                    end = mid - 1;
//                }
//            }
//            return ans;
//        }
//    }

}
