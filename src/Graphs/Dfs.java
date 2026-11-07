package Graphs;

import java.util.ArrayDeque;
import java.util.List;

public class Dfs {
    static void main() {

    }

    public static void dfsGraphs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true ;
        System.out.println(node);
        for (int neighbour : graph.get(node)){
            if(!visited[neighbour]) dfsGraphs(neighbour,graph,visited);
        }
    }
    public static void bfsGraphs(int  node ,List<List<Integer>> graph, boolean[] visited) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        visited[node] = true;
        q.add(node);
        while (!q.isEmpty()){
            int curr = q.poll();
            System.out.println(curr);
            for (var e : graph.get(curr)){
                if (!visited[e]) {
                    q.add(e);
                    visited[e] = true;
                }
            }
        }


    }
}

