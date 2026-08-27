package Recursion;

import java.util.ArrayList;
import java.util.List;

public class EveryPathToReachEnd {

    static void main() {
        System.out.println(allTheWaysToReachEnd("",0,0));
    }

    public static List<String> allTheWaysToReachEnd(String pro, int r, int c){
        if (r == 2 && c == 2) {
            List<String> list = new ArrayList<>();
            list.add(pro);
            return list;

        }

        if(r==0&&c==0){
            List<String> list = new ArrayList<>();
            return list;
        }

        ArrayList<String> s = new ArrayList<>();
        if (r <2) {
            List<String> s1 = allTheWaysToReachEnd(pro + "D", r  + 1, c);
            s.addAll(s1);
        }

        if (c < 2) {
            List<String> s2 = allTheWaysToReachEnd(pro + "R", r, c + 1);
            s.addAll(s2);
        }

        if(r>0) {
            List<String> s3 = allTheWaysToReachEnd(pro + "U", r-1, c );
            s.addAll(s3);
        }
        if(c>0) {
            List<String> s4 = allTheWaysToReachEnd(pro + "L", r, c-1 );
            s.addAll(s4);
        }
        return s;






}
}
