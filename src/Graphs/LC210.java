package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC210 {
    static void main() {
        int[][] nums = {

                {0,1}

        };
        System.out.println(Arrays.toString(findOrder(2,nums)));

    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (var e : prerequisites) {
            graph.get(e[1]).add(e[0]);
        }
        int[] ind = new int[graph.size()];
        for (int i = 0; i < graph.size(); i++) {
            for (var e : graph.get(i)) {
                ind[e]++;
            }
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] == 0) q.add(i);
        }
        int[] arr =  new int[numCourses];
        int idx = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            arr[idx++] = curr;
            for (var neighbour : graph.get(curr)) {
                ind[neighbour]--;
                if (ind[neighbour] == 0) q.add(neighbour);
            }
        }
        if (idx!= graph.size()) return new int[]{};
        return arr;


    }
}

