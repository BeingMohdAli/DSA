package Recursion;

import java.util.ArrayList;
import java.util.List;

public class EveryPathToReachEnd {

    static void main() {

        boolean[][] grid = {
                {true, true},
                {true, true}
        };
        System.out.println(allPaths("",0,0,grid));
    }

    public static List<String> allPaths(String p, int r, int c, boolean[][] arr) {

        // Current cell is already visited
        if (!arr[r][c]) {
            return new ArrayList<>();
        }

        // Reached destination
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> ans = new ArrayList<>();

        // Mark current cell as visited
        arr[r][c] = false;

        // Down
        if (r < arr.length - 1) {
            ans.addAll(allPaths(p + "D", r + 1, c, arr));
        }

        // Right
        if (c < arr[0].length - 1) {
            ans.addAll(allPaths(p + "R", r, c + 1, arr));
        }

        // Up
        if (r > 0) {
            ans.addAll(allPaths(p + "U", r - 1, c, arr));
        }

        // Left
        if (c > 0) {
            ans.addAll(allPaths(p + "L", r, c - 1, arr));
        }

        // Backtrack: make it available again
        arr[r][c] = true;

        return ans;
    }
}
