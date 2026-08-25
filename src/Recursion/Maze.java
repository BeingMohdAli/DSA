package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    static void main() {
        System.out.println(pathToReachTheEndOf3by3grid("",3,3));
//        System.out.println(paths(3,3));
//        System.out.println(pathToReachTheEndOf3by3grid("",3,3));
    }

    //    public static int paths(int r , int c){
//        if(r==1||c==1){
//            return  1 ;
//        }
//
//        int paths = paths(r - 1, c);
//
//        int paths1 = paths(r, c - 1);
//        return paths1 + paths;

//
//    }
//    public static List<String> pathToReachTheEndOf3by3grid(String pro, int r, int c) {
//        if (r == 1 && c == 1) {
//            List<String> list = new ArrayList<>();
//            list.add(pro);
//            return list;
//
//        }
//        ArrayList<String> s = new ArrayList<>();
//        if (r > 1) {
//            List<String> s1 = pathToReachTheEndOf3by3grid(pro + "D", r - 1, c);
//            s.addAll(s1);
//        }
//        if (c > 1) {
//            List<String> s2 = pathToReachTheEndOf3by3grid(pro + "R", r, c - 1);
//            s.addAll(s2);
//        }
//
//        return s;
//    }
        public static List<String> pathToReachTheEndOf3by3grid(String pro, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(pro);
            return list;



        }
        ArrayList<String> s = new ArrayList<>();
        if (r > 1) {
            List<String> s1 = pathToReachTheEndOf3by3grid(pro + "D", r - 1, c);
            s.addAll(s1);
        }
        if(r>1&&c>1){
            List<String> s3 = pathToReachTheEndOf3by3grid(pro + "S", r - 1, c-1);
            s.addAll(s3);
        }
        if (c > 1) {
            List<String> s2 = pathToReachTheEndOf3by3grid(pro + "R", r, c - 1);
            s.addAll(s2);
        }

        return s;
    }



}
