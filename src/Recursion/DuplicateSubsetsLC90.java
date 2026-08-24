package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DuplicateSubsetsLC90 {
    static void main() {
        int[] arr = {1,2,2};

        List<Integer> l = new ArrayList<>();


        System.out.println(subSetsII(l,arr,0));

    }
    public static List<List<Integer>> subSetsII(
            List<Integer> l, int[] arr, int index) {

        if (index == arr.length) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(l);
            return list;
        }

        // Don't take arr[index]
        List<List<Integer>> notTake =
                subSetsII(l, arr, index + 1);

        // Take arr[index]
        List<Integer> newList = new ArrayList<>(l);
        newList.add(arr[index]);

        List<List<Integer>> take =
                subSetsII(newList, arr, index + 1);

        notTake.addAll(take);

        return notTake;
    }
    }

