package heaps;

import maths.Prime;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LC1167 {
    static void main() {
        int[] arr  = {2, 4, 3};
        System.out.println(minimumCost(arr));
    }

    public static int minimumCost(int[] sticks){
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for ( int e : sticks) pq.add(e);
        while (pq.size()>1){
           int x =  pq.poll();
           int y =  pq.poll();
            sum +=  x+y;
           pq.add(x+y);
        }
        return sum;
    }
}
