package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LC378 {
    static void main() {

    }
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] arr : matrix) {
            for ( int i : arr) {
                pq.add(i);
                if(pq.size()>k) pq.poll();
            }

        }
        return pq.peek();
    }
}
