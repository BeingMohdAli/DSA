package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main() {
    int[][] arr = {
            {1,2,3},
            {23,4,1},
            {78,99,34,50},
            {18,12,3,9}
    };

    int[] result = searchIn2DArray(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchIn2DArray(int[][]arr){
        int max =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                   max = arr[i][j];
                }

            }
        }

        return new int[]{max};
    }
}
