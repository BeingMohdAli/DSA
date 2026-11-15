package Graphs;

import java.util.HashMap;

public class LC1319 {
    static void main() {
//
    }
    public static int makeConnected(int n, int[][] connections) {
        if (connections.length<n-1) return -1;
        int[] parent = new int[n];
        int[] rank = new int[n];
        int k = n;
        for (int i = 0; i < parent.length; i++) parent[i] = i;
        for (var e : connections)
            if (unionByRank(e[0], e[1], parent, rank)) k--;
        return k-1;
    }

    public static int findR(int x, int[] parent){
        if (x == parent[x]){
            return x;
        }
        parent[x] = findR(parent[x], parent);
        return parent[x];
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
}
