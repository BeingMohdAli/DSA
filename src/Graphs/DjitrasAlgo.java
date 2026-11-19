package Graphs;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DjitrasAlgo {
    static void main() {

    }
    public static int[] minDistanceDjitra(int n, List<List<int[]>> graph, int source){
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,source});
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
        return dist;








    }
}
