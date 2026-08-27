package Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacles {
    static void main() {
        boolean[][] grid = {
                {true, true, true},
                {true, true, false},
                {true, true, true}
        };
        System.out.println(mazeWithObstacles("",0,0,grid));

    }

    public static List<String> mazeWithObstacles(String p,int r, int c, boolean[][] arr){

        if(!arr[r][c]){
            List<String> l = new ArrayList<>();
            return l;
        }
        if(r==arr.length-1&&c==arr[0].length-1){
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r<arr.length-1){
             ans.addAll(mazeWithObstacles(p + "D", r + 1, c, arr));
        }

        if(c<arr[0].length-1){
            ans.addAll(mazeWithObstacles(p + "R", r , c+1, arr));
        }
            return ans;

    }

}
