package stacks;

import java.util.*;

public class DailyTemperaturesLC739 {
    static void main() {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dT(arr)));
    }

//    public static int[] dT(int[] arr){
//        List<Integer>  l = new ArrayList<>();
//        int flag ;
//        for (int i = 0; i < arr.length-1; i++) {
//            flag = 0;
//            int t = arr[i];
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[j]>arr[i]){
//                    flag = 1;
//                    l.add(j-i);
//                    break;
//                }
//            }
//            if(flag==0){
//                l.add(0);
//            }
//        }
//        l.add(0);
//
//
//        return l.stream()
//                .mapToInt(x -> x)
//                .toArray();
//
//
//    }

    public static int[] dT(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                result[i] = 0;
            } else {
                result[i] = s.peek()-i;
            }
            s.push(i);
        }

        return result;


    }
}
