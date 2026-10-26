package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LC1962 {
    static void main() {
 int[] arr = {5,4,9};
 int k = 2;
        System.out.println(minStoneSum(arr,k));

    }
    public static int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < piles.length; i++) {
            pq.add(piles[i]);
        }
        for (int i = 0; i < k; i++) {
            int maxElement = pq.poll();
            maxElement = maxElement - maxElement/2;
            pq.add(maxElement);
        }
        while (!pq.isEmpty()){
            sum = sum + pq.poll();
        }
        return sum;
    }
}

