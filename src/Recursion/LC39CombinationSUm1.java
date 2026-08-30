package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC39CombinationSUm1 {
    static void main() {
        int[] arr = {2,3,6,7};
        List<Integer> l  =  new ArrayList<>();
        System.out.println(lC39(0,7,arr,l));
    }

    public static List<List<Integer>> lC39(int index,int target, int[] candidates,List<Integer> list ){

        if(target==0){
            List<List<Integer>> l = new ArrayList<>();
            l.add(list);
            return l;
        }
        if(index == candidates.length){
            List<List<Integer>> l = new ArrayList<>();
            return l;
        }

        if(target<0){

            List<List<Integer>> l = new ArrayList<>();
            return l;
        }
        List<List<Integer>> l = new ArrayList<>();
        int candidate =candidates[index];
        List<Integer> li = new ArrayList<>(list);
        li.add(candidate);
       l.addAll(lC39(index, target - candidate, candidates, li));

        l.addAll(lC39(index+1,target,candidates,list));
        return l;

    }
}
