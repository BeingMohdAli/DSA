package heaps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionInHeaps {
    static void main() {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(7,8,15,4,98,76)
        );
//        System.out.println(insertionInHeap(list,40));
//        System.out.println(deletionInHeap(list));
        System.out.println(heapSort(list));
    }
    public static List<Integer> insertionInHeap(List<Integer> list, int element){
        list.add(element);
        int i = list.size()-1;
        while (i>=1){
            int parent = (i-1)/2;
            if(list.get(parent)<list.get(i)){
                int temp = list.get(parent);
                list.set(parent,list.get(i));
                list.set(i,temp);
                i = parent;
            }else {
                break;
            }
        }
            return list;
    }
    public static int deletionInHeap(List<Integer> list){
        if(list.isEmpty())  throw new RuntimeException("List is Empty");
        int x , i , j;
        x = list.getFirst();
        int last = list.removeLast();
        if (list.isEmpty()) return x;
        list.set(0, last);
        i = 0;
        j = 2*i+1;
        while (j < list.size()) {
            if (j+1< list.size() && list.get(j + 1) > list.get(j)) {
                j = j + 1;
            }

            if (list.get(i) < list.get(j)) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i = j;
                j = 2 * i + 1;
            } else {
                break;
            }
        }
        return x;
    }
    public static List<Integer> heapSortWhenTheListIsMaxHeap(List<Integer> list){
        ArrayList<Integer> l = new ArrayList<>();
        while (!list.isEmpty()){
            int i = deletionInHeap(list);
            l.add(i);
        }
//        Collections.reverse(l);
        return l;
    }
    public static List<Integer> heapSort(List<Integer> list){
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            insertionInHeap(l,list.get(i));
        }
       return heapSortWhenTheListIsMaxHeap(l);

    }

}
