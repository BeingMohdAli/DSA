package Graphs;

import java.util.PriorityQueue;

public class KruskalsAlgo {
    static void main() {
        int[][] edges = {{0,1,1},{1,2,2},{0,2,3},{2,3,4}};
        System.out.println(kA(4, edges));
    }
    static int[] parent;
    static boolean union(int a, int b) {
        int ra = find(a), rb = find(b);
        if (ra == rb) return false;   // already connected: this edge would form a cycle
        parent[ra] = rb;
        return true;
    }
    static int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]); // path compression
        return parent[x];
    }
    public static int kA(int n , int[][] edges){
        int ans = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        for (var e : edges) q.add(e);
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int count = 0;
         while (!q.isEmpty()&&count<n-1){
             int[] e = q.poll();
             if (union(e[0],e[1])){
                ans = ans + e[2];
                 count++;
             }
         }
        return ans;
    }
}
