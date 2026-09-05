package LinearSearch;

import java.util.Arrays;

public class TwoSum {
    static void main() {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }


        public static int[] twoSum(int[] nums, int target) {

            for(int i = 0; i< nums.length-1;i++){
                for (int j = i+1; j < nums.length; j++) {
                    int sum = nums[i] + nums[j];
                    if(sum==target){
                        return new int[]{i,j};
                    }
                }



            }
            return new int[]{};
        }


}
