package Graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class LC1091 {
    static void main() {

    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] distance = new int[grid.length][grid[0].length];
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        for (int[] row : distance) Arrays.fill(row, -1);
        Queue<int[]> q = new ArrayDeque<>();
        distance[0][0] = 1;
        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int x = poll[0];
            int y = poll[1];
            for (int[] d : dirs) {
                int nr = x + d[0];    // new row
                int nc = y + d[1];    // new column
                if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length) {
                    if (grid[nr][nc] == 0 && distance[nr][nc] == -1) {
                        distance[nr][nc] = distance[x][y] + 1;
                        q.add(new int[]{nr, nc});
                    }
                }
            }

        }
        return distance[grid.length - 1][grid[0].length - 1];

    }
}
