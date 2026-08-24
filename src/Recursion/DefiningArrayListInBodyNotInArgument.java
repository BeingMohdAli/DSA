package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DefiningArrayListInBodyNotInArgument {
    static void main() {
//        int[] arr = {1,2,3,4,4,5};
//        int target = 4;
//
//        System.out.println(LinearSearch(arr,target,0));
//        List<List<Integer>> list = new ArrayList<>();
//        System.out.println(list);
    }
    public static List<Integer> LinearSearch(int[] arr,int target,int index){
        if(index==arr.length){
            ArrayList<Integer> l = new ArrayList<>();
            return l;
        }

        ArrayList<Integer> list = new ArrayList<>();
        if(arr[index]==target){
            list.add(index);
        }

        List<Integer> integers = LinearSearch(arr, target, index + 1);
        list.addAll(integers);
        return list;

    }
}
