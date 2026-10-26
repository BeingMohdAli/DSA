package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LC215 {
    static void main() {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargestOptiminsed(arr,4));
    }

    public static int findKthLargest(int[] nums, int k) {
        int x = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        for (int i = 0; i < k; i++) {
             x = pq.poll();
        }
        return x;
    }
    public static int findKthLargestOptiminsed(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums){
            if(pq.size()==k+1) pq.poll();
            pq.add(i);
        }
        pq.poll();
        return pq.peek();
    }

}
