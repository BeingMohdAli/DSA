package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionInHeaps {
    static void main() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(30, 20, 15, 5,10,12,6)
        );
        System.out.println(insertionInHeap(list,40));
    }
    public static List<Integer> insertionInHeap(List<Integer> list, int element){
        list.add(element);
        int i = list.size()-1;
        while (i>=1){
            if(list.get((i-1)/2)<list.get(i)){
                int temp = list.get((i-1)/2);
                list.set((i-1)/2,list.get(i));
                list.set(i,temp);
                i = i/2;
            }else {
                break;
            }
        }
return list;
    }
}
