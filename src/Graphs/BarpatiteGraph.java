package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BarpatiteGraph {
    static void main() {
        int[][] triangle = {{0, 1}, {1, 2}, {2, 0}};
        System.out.println(isBipartite(3, buildGraph(3, triangle)));   // false

        int[][] square = {{0, 1}, {1, 2}, {2, 3}, {3, 0}};
        System.out.println(isBipartite(4, buildGraph(4, square)));     // tr
        }


    public static  boolean biPartite(int node, List<List<Integer>> graph,int[] colour,int currColour) {

        colour[node] = currColour;
        for (var e : graph.get(node)){
            if (colour[e]==-1){
                if (!biPartite(e,graph,colour,1-currColour)){
                    return false;
                }
            } else if (colour[e]==colour[node]) {
                return false;
            }
        }
        return true;


    }
    public static boolean isBipartite(int n, List<List<Integer>> graph) {   // labels 0..n-1
        int[] colour = new int[n];
        Arrays.fill(colour, -1);                         // once, before any call

        for (int i = 0; i < n; i++) {                    // covers disconnected graphs
            if (colour[i] == -1) {
                if (!biPartite(i, graph, colour, 0)) return false;
            }
        }
        return true;
    }

    static List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] ed : edges) {
            graph.get(ed[0]).add(ed[1]);
            graph.get(ed[1]).add(ed[0]);
        }
        return graph;
    }
}