package LinearSearch;

public class LinearSearch {
    public static void main() {
     int result = elementFinder(78, new int[]{23, 45, 87, 98, 78});
        System.out.println(result);

    }
    static int elementFinder(int target,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }



}
