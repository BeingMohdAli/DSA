package LinearSearch;

public class MinimumElement {
    static void main() {
    int[] nums = {1,76,-99,-74,98,-1093,1022,-2000};
    int result = minimumElement(nums);
        System.out.println(result);
    }
    static int minimumElement(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[0]){
                min = arr[i];
            }

        }
        return min;
    }
}
