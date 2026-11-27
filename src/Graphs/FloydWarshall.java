package Graphs;

import java.util.Arrays;

public class FloydWarshall {
    static void main() {

    }
    public static int[][] floydW(int n , int[][] edges){
        int[][] distance = new int[n][n];
        for (var e : distance) Arrays.fill(e,Integer.MAX_VALUE);
        for (var e : edges){
            int i = e[0];
            int j = e[1];
            distance[i][j] = e[2];
        }
        for (int i = 0; i < n; i++) {
            distance[i][i] = 0;
        }
        for (int k = 0; k<n;k++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (distance[i][k]!=Integer.MAX_VALUE){
                        distance[i][j] = Math.min(distance[i][j],distance[i][k]+distance[k][j]);
                    }
                }
            }
        }
        return distance;
    }
}


