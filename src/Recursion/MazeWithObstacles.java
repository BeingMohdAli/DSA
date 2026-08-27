package Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacles {
    static void main() {
        System.out.println(mazeWithO("",0,0));
    }

    public static List<String> mazeWithO(String pro, int r, int c) {
        if (r == 2 && c == 2) {
            List<String> list = new ArrayList<>();
            list.add(pro);
            return list;

        }

        if(r==1 &&c==1){
            List<String> list = new ArrayList<>();
            return list;
        }


        ArrayList<String> s = new ArrayList<>();
        if (r <2) {
            List<String> s1 = mazeWithO(pro + "D", r  + 1, c);
            s.addAll(s1);
        }

        if (c < 2) {
            List<String> s2 = mazeWithO(pro + "R", r, c + 1);
            s.addAll(s2);
        }

        return s;
    }


}
