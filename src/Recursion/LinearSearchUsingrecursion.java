package Recursion;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearchUsingrecursion {
    static void main() {
        List<Integer> l = new ArrayList<>(Arrays.asList(3,2,1,9,8));
        System.out.println(ls(l,2));
    }

    public static boolean ls(List<Integer> l, int target){
        if(l.isEmpty()){
            return false;
        }
        Integer i = l.removeLast();
        boolean bl = ls(l,target);
        if(bl){
            return true;
        }
        if(i== target){
            return true;
        }
        return false;
    }
}

