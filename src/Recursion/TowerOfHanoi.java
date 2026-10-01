package Recursion;

public class TowerOfHanoi {
    static void main() {
     towerHanoi(2,'A','B','C');
    }

    public static void towerHanoi(int n, char source, char helper, char dest){
        if(n==0){
            return;
        }

        towerHanoi(n-1,source,dest,helper);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        towerHanoi(n-1,helper,source,dest);

    }
}
