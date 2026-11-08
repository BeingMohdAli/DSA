package Graphs;

import java.util.ArrayList;
import java.util.List;

public class LC547 {
    static void main() {
        int[][] arr = {{1,0,0},
                {0,1,0},
                {0,0,1}};
        System.out.println(findCircleNum(arr));
    }

    public static int findCircleNum(int[][] isConnected) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < isConnected.length; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < isConnected.length ; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (i==j) continue;
               if (isConnected[i][j]==1){
                   graph.get(i).add(j);
               }
            }
        }
        int count = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]){
                count++;
                dfsInDisconnectedGraph(i,graph,visited);
            }
        }
        return count;
    }

    private static void dfsInDisconnectedGraph(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        for (int neighbour : graph.get(node)){
            if(!visited[neighbour]) dfsInDisconnectedGraph(neighbour,graph,visited);
        }
    }


}
