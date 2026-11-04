package Graphs;

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
}

