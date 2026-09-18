package stacks;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode853 {
    static void main() {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        System.out.println(carFleet(target, position, speed)); ;
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        Integer[][] cars = new Integer[position.length][2];

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        int count = 0;
        double previousFleetTime = 0;
        for (int i = 0; i < cars.length; i++) {
            double time = (double) (target - cars[i][0]) /cars[i][1];
            if(time>previousFleetTime){
                count++;
                previousFleetTime = time;
            }
        }
        return count;



    }
}
