package Graphs;

public class LC990 {
    static void main() {
        String[] e = {"a==b","b==a"};
        System.out.println(equationsPossible(e));
    }
    public static boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        int[] rank = new int[26];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        for ( var e : equations){
            if (e.charAt(1)=='='){
                unionByRank(e.charAt(0)-'a',e.charAt(3)-'a',parent,rank);
            }
        }
        for (var e : equations){
            if (e.charAt(1)=='!'){
                int r = findR(e.charAt(0), parent);
                int r1 = findR(e.charAt(3), parent);
                if (r==r1) return false;
            }
        }
        return true;
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
