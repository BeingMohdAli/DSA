package Graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class MinimumPathUsingBFS {

    static void main() {

    }

    public static int[] shortestPathUsingBfs(int n, List<List<Integer>> graph, int source) {
        int[] distance = new int[n];
        Arrays.fill(distance, -1);
        Queue<Integer> q = new ArrayDeque<>();
        distance[source] = 0;
        q.add(source);
        while (!q.isEmpty()) {
            int poll = q.poll();
            for (var e : graph.get(poll)) {
                if (distance[e] == -1) {
                    distance[e] = distance[poll] + 1;
                    q.add(e);
                }
            }
        }

        return distance;
    }
}