package Graphs;
import java.util.Arrays;

public class DSU {
    static void main() {
        int[] parent = {0,0,2,2};
        System.out.println(Arrays.toString(union(1,3,parent)));


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
}
