package Graphs;
public class LC2316 {
    static void main() {

    }
    public long countPairs(int n, int[][] edges) {
        int[] parent = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i]= i;
        }
        int[] rank = new int[n];
        for (var e : edges) unionByRank(e[0],e[1],parent,rank);
        for (int i = 0; i < n; i++) {
            int r = findR(i, parent);
            size[r]++;
        }
        long ans = 0;
        long seen = 0;
        for (int i = 0; i < n; i++) {
            if (size[i] > 0) {          // i is a leader
                ans += size[i] * seen;  // pair this group with all earlier groups
                seen += size[i];        // now this group counts as seen
            }
        }
        return ans;


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
