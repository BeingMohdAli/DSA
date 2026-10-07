package Recursion;

import java.util.ArrayList;
import java.util.List;

public class f {


    public static int bSR(ArrayList<Integer> a, int target, int start, int end) {
        if (start > end) {
            return -1;                      // base case: empty range, not found
        }

        int mid = start + (end - start) / 2;

        if (a.get(mid) == target) {
            return mid;                     // my work: found it
        }
        if (a.get(mid) < target) {
            return bSR(a, target, mid + 1, end);   // faith: search right half
        }
        return bSR(a, target, start, mid - 1);     // faith: search left half
    }

    public static int lsR(ArrayList<Integer> arr,  int target,int start,int end) {
        if (start>end) {
            return -1;
        }
        int element = arr.get(start);
        if (element == target) {
            return start;
        }
        return lsR(arr,  target,start +1,end);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        System.out.println(lsR(list,  10,0,list.size()-1));
    }
}