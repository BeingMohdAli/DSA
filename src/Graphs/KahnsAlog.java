package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class KahnsAlog {
    static void main() {
        int n = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        boolean[] arr = new boolean[n];
        int[][] edges = {{0,3}, {0,2}, {2,3}, {2,1}, {3,1}, {5,1}, {5,4}, {1,4}};
        for (int[] e : edges) graph.get(e[0]).add(e[1]);
        System.out.println(kahns(graph));
    }

    public static List<Integer> kahns(List<List<Integer>> graph){
        int size = graph.size();
        int[] indegree = new int[size];
        for (int u = 0; u < size; u++) {
            for (int v : graph.get(u)) {
                indegree[v]++;
            }
        }
        List<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i <indegree.length; i++) {
            if (indegree[i]==0) {
                q.add(i);
            }
        }
       while (!q.isEmpty()){
           int curr = q.poll();
           list.add(curr);
           for (var e : graph.get(curr)){
                   indegree[e]--;
                   if (indegree[e]==0) q.add(e);

           }
       }
       if (list.size()!=size) return new ArrayList<>();
       return list;
  }
}
