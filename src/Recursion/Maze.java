package Recursion;

public class Maze {
    static void main() {
        System.out.println(paths(3,3));
    }
    public static int paths(int r , int c){
        if(r==1||c==1){
            return  1 ;
        }

        int paths = paths(r - 1, c);

        int paths1 = paths(r, c - 1);
        return paths1 + paths;

    }
}
