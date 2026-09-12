package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DailyTemperaturesLC739 {
    static void main() {
        int[] arr = {30,40,50,60};
        System.out.println(dT(arr));
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

    public static List<Integer> dT(int[] arr) {

        Stack<Integer>  s = new Stack<>();
        List<Integer> l = new ArrayList<>();

        for (int i = arr.length-1; i >=0; i--) {
            if(s.isEmpty()){
               s.push(i);
               l.add(0);
            }

            else if(arr[i]>s.peek()){
                l.add(0);
                s.pop();
            }else{
                s.push(i);
                l.add(s.peek()-i);

            }
        }
        return l;

    }



}
