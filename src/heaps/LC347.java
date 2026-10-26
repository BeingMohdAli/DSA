package heaps;

import java.util.*;

public class LC347 {
    static void main() {
        int[] arr =
                {1};
        int k = 1 ;
        System.out.println(Arrays.toString(topKFrequent(arr,k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for (int i : nums) hm.put(i,hm.getOrDefault(i,0)+1);
        for ( var e : hm.entrySet()){
            pq.add(new int[]{e.getKey(),e.getValue()});
            if (pq.size()>k) pq.poll();
        }
        int[] arr = new int[k];
        for (int i = 0; i <k; i++) {
            arr[i] = pq.poll()[0];
        }
        return arr;
    }
}
