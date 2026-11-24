package Graphs;

import java.util.*;

public class Lc1514 {
    static void main() {

    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] prob = new double[n];
        Arrays.fill(prob,0);
        prob[start_node] = 1;
        PriorityQueue<double[]> q = new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        List<List<double[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            double p = succProb[i];
            graph.get(u).add(new double[]{v, p});
            graph.get(v).add(new double[]{u, p});
        }
        q.add(new double[]{1.0,start_node});
        while (!q.isEmpty()){
            double[] poll = q.poll();
            double probability = poll[0];
            int node = (int)poll[1];
            if (probability<prob[node]) continue;
            for (var e : graph.get(node)){
                double v = e[0];
                double v1 = e[1];
                if (prob[(int) v]<probability*v1){
                    prob[(int) v] = probability*v1;
                    q.add(new double[]{probability*v1,v});
                }
            }
        }
        return prob[end_node];
    }

}
