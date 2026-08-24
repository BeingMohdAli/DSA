package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateSubsetsLC {
    static void main() {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {1,2,2};
        List<Integer> l = new ArrayList<>();
        List<Integer> d = ds(0, nums, l);
       ans.add(d);
        System.out.println(ans);


    }
    public static List<Integer> ds(int p ,int[] nums,List<Integer> l){
        if(nums.length==0){
          l.add(p);
          return l;
        }
        int num = nums[0];

        List<Integer> l1 = ds(p, Arrays.copyOf(nums, nums.length - 1), l);
        List<Integer> l2 = ds(p + num, Arrays.copyOfRange(nums, 1, nums.length), l);
         l1.addAll(l2);
         return l1;

    }
}
