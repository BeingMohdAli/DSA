package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIsSortedOrNot {
    static void main() {
//        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2));
//
//        boolean sort = sort(l);
//
//        System.out.println(sort);
    }

    public static boolean sort(List<Integer> l, int index) {
//        if(l.size()==1){
//            return true;
//        }
//        int lastELement = l.removeLast();
//        boolean sort = sort(l);
//        if(!sort){
//            return false;
//        }
//
//        if(l.get(l.size()-1)<lastELement){
//            return true;


//
//        }
//        return false;
//    }


        if (index == l.size() - 1) {
            return true;
        }
        if (l.get(index) < l.get(index + 1)) {


        return sort(l, index + 1);
    }
}
