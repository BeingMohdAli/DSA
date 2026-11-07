package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Cycle {
    static void main() {
        // Test 1: disconnected graph, cycle only in the second component (3-4-5 triangle)
        int n1 = 5;
        int[][] edges1 = {{1, 2}, {3, 4}, {4, 5}, {5, 3}};
        List<List<Integer>> g1 = buildGraph(n1, edges1);
        System.out.println(hasCycle(n1, g1) ? "Cycle is found!" : "Cycle not found");
        // Cycle is found!

        // Test 2: a tree, no cycle
        int n2 = 5;
        int[][] edges2 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}};
        List<List<Integer>> g2 = buildGraph(n2, edges2);
        System.out.println(hasCycle(n2, g2) ? "Cycle is found!" : "Cycle not found");
        // Cycle not found

        // Test 3: disconnected, no cycle anywhere
        int n3 = 6;
        int[][] edges3 = {{1, 2}, {3, 4}, {4, 5}};
        List<List<Integer>> g3 = buildGraph(n3, edges3);
        System.out.println(hasCycle(n3, g3) ? "Cycle is found!" : "Cycle not found");
    }

    public static boolean cycleInAnUnDirectedGraph(int node, List<List<Integer>> graph,boolean[] visited,int parent){
        visited[node] = true;
        for (var e : graph.get(node)){
            if (!visited[e]){
              if (cycleInAnUnDirectedGraph(e,graph,visited,node)){
                  return true;
              }
            }
            else if (e!=parent){
               return true;
            }
        }
        return false;
    }
    public static boolean hasCycle(int n, List<List<Integer>> graph) {
        boolean[] visited = new boolean[n + 1];   // created once, shared by all searches

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                if (cycleInAnUnDirectedGraph(i, graph, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] ed : edges) {
            graph.get(ed[0]).add(ed[1]);
            graph.get(ed[1]).add(ed[0]);      // undirected: add both directions
        }
        return graph;
    }
    public static boolean cycleDetectionInDirectedGraph(int node, List<List<Integer>> graph,boolean[] visited,boolean[] onPath){
        visited[node] = true;
        onPath[node] = true;
        for (var e : graph.get(node)){
            if (!visited[e]){
                if (cycleDetectionInDirectedGraph(e,graph,visited,onPath)){
                    return true;
            }
            } else if (onPath[e]) {
                return true;
            }
        }
        onPath[node] = false;
        return false;
    }

    public boolean hasCycleInDisconnectedGraph(int numberOfNodes ,List<List<Integer>> graph){
        boolean[] visited = new boolean[numberOfNodes+1];
        boolean[] onPath = new boolean[numberOfNodes+1];
        for (int i = 1 ; i <= numberOfNodes; i++) {
            if (!visited[i]){
                if (cycleDetectionInDirectedGraph(i,graph,visited,onPath)){
                    return true;
                };
            }
        }
        return false;
    }
}

