package LinearSearch;

public class LcP {
    static void main() {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };
    int wealth = wPW(arr);
        System.out.println(wealth);

    }
    static int wPW(int[][] arr){
        int wPW =0;
        int sum ;
        for (int i = 0; i < arr.length ; i++) {
            sum =0;
            for (int j = 0; j < arr[i].length ; j++) {
                sum = sum +arr[i][j];

            }
            if(sum>wPW){
                wPW = sum;
            }
        }
        return wPW;
    }
}
