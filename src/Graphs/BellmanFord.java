package Graphs;
import java.util.Arrays;


public class BellmanFord {
    static void main() {

    }
    public static int[] bellmanFord(int n, int[][] edges, int src){
        int[] distance = new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src] = 0;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (var e : edges){
                int u = e[0];
                int v = e[1];
                int weight = e[2];
                if (distance[u]==Integer.MAX_VALUE) continue;
                if (distance[u]+weight<distance[v]){
                    distance[v] = distance[u]+weight;
                    flag = true;
                }
            }
            if (!flag){
                return distance;
            }

        }
        for ( var e : edges){
            int u = e[0];
            int v = e[1];
            int weight = e[2];
            if (distance[u]!=Integer.MAX_VALUE&&distance[u] + weight < distance[v]){
            return null;
            }
        }
        return distance;
    }
}
