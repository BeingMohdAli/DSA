package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class LC743 {
    static void main() {

    }
    public static int networkDelayTime(int[][] times, int n, int k) {

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());          // one empty list per node (0 to n)
        }

        for (int[] t : times) {
            int u = t[0];                          // from
            int v = t[1];                          // to
            int w = t[2];                          // time
            graph.get(u).add(new int[]{v, w});     // {neighbour, weight}, same order as before
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,k});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int distance = current[0];
            int node = current[1];

            if (distance > dist[node]) continue;          // outdated entry
            for (var e : graph.get(node)) {
                int neighbour = e[0];
                int weight = e[1];
                if (distance + weight < dist[neighbour]) {        // relaxation
                    dist[neighbour] = distance + weight;
                    pq.add(new int[]{dist[neighbour], neighbour});
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {          // start at 1, index 0 is unused
            if (dist[i] == Integer.MAX_VALUE) return -1;   // unreachable node
            ans = Math.max(ans, dist[i]);
        }
        return ans;

    }
}
