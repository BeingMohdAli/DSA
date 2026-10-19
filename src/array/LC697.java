package array;

import java.util.HashMap;

public class LC697 {
    static void main() {
        int[] arr = {1,1,2,2,3,3,3,2};
        System.out.println(elementsCount(arr));
    }

    public static int elementsCount(int[] arr){
        int degree = 0 , length = Integer.MAX_VALUE;
        HashMap<Integer,Integer> count = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count.put(arr[i],count.getOrDefault(arr[i],0)+1);
            first.putIfAbsent(arr[i],i);
            last.put(arr[i],i);
        }
        for (var e : count.entrySet()){
            if(e.getValue()>degree) degree = e.getValue();
        }
        for (var e : count.entrySet()){
            if(e.getValue()==degree){
                if(length>last.get(e.getKey())- first.get(e.getKey())+1) length = last.get(e.getKey())- first.get(e.getKey())+1;
            }
        }

        return length;
    }
}
