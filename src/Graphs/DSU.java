package Graphs;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;

public class DSU {
    static void main() {
        int[][] edges = {
                {1, 5},
                {1, 7},
                {1, 2},
                {1, 4},
                {3, 7},
                {4, 7},
                {3, 5},
                {0, 6},
                {0, 1},
                {0, 4},
                {2, 6},
                {0, 3},
                {0, 2}
        };
        int[] parent = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] rank = new int[parent.length] ;
        for (var e : edges) unionByRank(e[0],e[1],parent,rank);
        System.out.println(Arrays.toString(parent));


    }

    public static int find(int x, int[] parent){
        while(parent[x]!=x){
            x = parent[x];
        }
        return x;
    }
    public static int findR(int x, int[] parent){
        if (x == parent[x]){
            return x;
        }
        parent[x] = find(parent[x], parent);
        return parent[x];
    }
    public static int[] union(int x,int y,int[] parent){
        int l1 = findR(x,parent);
        int l2 = findR(y,parent);
        if (l1!=l2){
            parent[l2] = l1;
        }
        return parent;
    }
    public static boolean unionByRank(int x,int y,int[] parent,int[] rank){
        int l1 = findR(x,parent);
        int l2 = findR(y,parent);
        if (l1==l2) return false;
        if (rank[l1]<rank[l2]){
            parent[l1] = l2;
        } else if (rank[l1]>rank[l2]) {
            parent[l2] = l1;
        }
        else {
            parent[l2] = l1;
            rank[l1]++;
        }
        return true;
    }

    public static boolean cycleDetectionUsingUnion(List<List<Integer>> graph , int[] parent, int[] rank,boolean[] visited){
        for (int i = 0; i < graph.size(); i++) {
            for (var e : graph.get(i)){
                if (e<i) continue;
                if (!unionByRank(e,i,parent,rank)){
                    return true;
                }
            }
        }
        return false;
    }

}
