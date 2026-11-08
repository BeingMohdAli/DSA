package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortUsingDfs {
    static void main() {

int x = 4;
//int a = x--;
int b = --x;
//        System.out.println(a);
        System.out.println(b);
    }
    public static void TopoUsingDfs(int node, List<List<Integer>> graph, boolean[] visited, Stack<Integer> s) {
        visited[node] = true ;
        for (int neighbour : graph.get(node)){
            if(!visited[neighbour]) TopoUsingDfs(neighbour,graph,visited,s);
        }
        s.push(node);
    }
}
