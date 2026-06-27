package Recursion;

import java.util.ArrayList;

public class LinearSearchRecursion {
     static void main() {
        int[] arr = {2,3,9,5,5,6};
        ArrayList<Integer> arrayList = new ArrayList<>();

         ArrayList<Integer> arrayList1 = allIndexOfElement(arr, 5, arrayList, 0);
         System.out.println(arrayList1);
     }



    public static int lsR(int[] arr, int target) {

        return helper4(arr, target, 0);
    }

    private static int helper4(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return helper4(arr, target, index + 1);


    }

    public static ArrayList<Integer> allIndexOfElement(int[] arr, int target, ArrayList<Integer> arrayList, int index){
        if(index == arr.length){
            return arrayList;
        }

        if (arr[index] == target) {
             arrayList.add(index);
        }

        return allIndexOfElement(arr, target, arrayList,index+1);

    }


}
