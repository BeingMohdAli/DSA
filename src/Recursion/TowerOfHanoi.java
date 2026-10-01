package Recursion;

public class TowerOfHanoi {
    static void main() {
        System.out.println(towerHanoi(3,'A','B','C'));
    }

    public static int towerHanoi(int n, char source, char helper, char dest){
        if(n==0){
            return 0;
        }

        int count = towerHanoi(n - 1, source, dest, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        count++;
        count+= towerHanoi(n - 1, helper, source, dest);
        return count;

    }
}
