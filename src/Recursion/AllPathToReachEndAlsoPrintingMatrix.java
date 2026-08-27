package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathToReachEndAlsoPrintingMatrix {
    static void main() {
        boolean[][] grid = {
                {true, true,true},
                {true, true,true},
                {true, true,true}
        };
        int[][] array = {
                {0, 0,0},
                {0, 0,0},
                {0, 0,0}
        };
      allPaths("",0,0,grid,array,1);
    }

    public static void allPaths(String p, int r, int c, boolean[][] arr,int[][] array,int step) {

        // Current cell is already visited
        if (!arr[r][c]) {
           return ;
        }

        // Reached destination
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            System.out.println(p);
            array[r][c]=step;
            for (int[] row : array) {
                System.out.println(Arrays.toString(row));
            };
            System.out.println();
            return;
        }
        array[r][c] = step;

        // Mark current cell as visited
        arr[r][c] = false;


        // Down
        if (r < arr.length - 1) {
           allPaths(p + "D", r + 1, c, arr,array,step+1);
        }

        // Right
        if (c < arr[0].length - 1) {
            allPaths(p + "R", r, c + 1, arr,array,step+1);
        }

        // Up
        if (r > 0) {
         allPaths(p + "U", r - 1, c, arr,array,step+1);
        }

        // Left
        if (c > 0) {
          allPaths(p + "L", r, c - 1, arr,array,step+1);
        }

        // Backtrack: make it available again
        arr[r][c] = true;
        array[r][c] = 0;


    }
}
