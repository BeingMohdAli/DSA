package heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC1337 {
    static void main() {

    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->
                a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);

        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int x: mat[i]) soldiers = soldiers+ x;
            pq.add(new int[]{soldiers,i});
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int[] poll = pq.poll();
            ans[i] = poll[1];
        }
     return ans;
    }
}
