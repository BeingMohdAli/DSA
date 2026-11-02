package Graphs;

import java.util.HashMap;
import java.util.Map;

public class LC997 {
    static void main() {
        int[] arr = {1,2,3};
        for (int c : arr) System.out.println(c);
    }
    public int findJudge(int n, int[][] trust) {
       int[] in = new int[n+1];
       int[] out = new int[n+1];

       for ( var e : trust) {
           out[e[0]]++;
           in[e[1]]++;
       }
        for (int i = 1; i <= n ; i++) {
            if(out[i]==0 && in[i]==n-1) return i;
        }
        return -1;

    }
}
