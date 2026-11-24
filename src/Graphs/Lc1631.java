package Graphs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Lc1631 {
    static void main() {

    }
    public static int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] dirs = {{0,1},{0,-1},{-1,0},{1,0}};
        int[][] dist = new int[rows][cols];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        dist[0][0] = 0;
        q.add(new int[]{0,0,0});
        while (!q.isEmpty()){
            int[] poll = q.poll();
            int effort = poll[0];
            int x = poll[1];
            int y = poll[2];
            if (effort>dist[x][y]) continue;
            for (var e : dirs){
                int nx = x  + e[0];
                int ny = y  + e[1];
                if (nx>=0&&ny>=0&&nx<rows&&ny<cols){
                   int step =  Math.abs(heights[x][y]-heights[nx][ny]);
                   int newEffort = Math.max(effort,step);
                   if (newEffort<dist[nx][ny]){
                       dist[nx][ny] = newEffort;
                       q.add(new int[]{newEffort,nx,ny});
                   }
                }
            }
        }

return dist[rows-1][cols-1];

    }
}
