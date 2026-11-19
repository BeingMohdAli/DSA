package Graphs;

import java.util.*;

public class DjitrasAlgo {
    static void main() {
//Set<Integer> s0 = new HashSet<>();
//Set<Integer> s1 = new LinkedHashSet<>();
//Set<Integer> s2 = new TreeSet<>();
//        s0.add(10);
//        s0.add(9);
//        s0.add(8);
//        s1.add(10);
//        s1.add(9);
//        s1.add(8);
//        s2.add(10);
//        s2.add(9);
//        s2.add(8);
//
//        System.out.println(s0);
//        System.out.println(s1);
//        System.out.println(s2);
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
    public static int[] minDistanceDjitraUsingSet(int n, List<List<int[]>> graph, int source){
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source] = 0;
        TreeSet<int[]> t = new TreeSet<>((a,b)->a[0]!=b[0]?  Integer.compare(a[0],b[0]): Integer.compare(a[1],b[1]));
        t .add(new int[]{0,source});
        while (!t.isEmpty()) {
            int[] current = t.pollFirst();
            int distance = current[0];
            int node = current[1];
            for (var e : graph.get(node)) {
                int neighbour = e[0];
                int weight = e[1];
                if (distance + weight < dist[neighbour]) {
                    t.remove(new int[]{dist[neighbour], neighbour});// relaxation
                    dist[neighbour] = distance + weight;
                    t.add(new int[]{dist[neighbour], neighbour});
                }
            }
        }
        return dist;
    }
}
