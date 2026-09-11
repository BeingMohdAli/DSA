package queues;

import java.util.*;

public class j {

    static void main() {

//        System.out.println(reverseString("Pratham"));
//        String[] s = new String[2];
//   int[] arr = {1,2,3,4,3,2,1};
//        s[0] = "Pratham";
//        s[1] = "Batra";
//        String join = String.join(" ", s);
//        System.out.println(peakElement(arr));
//        System.out.println(join);
//Set<Integer> s = new TreeSet<>();
//s.add(2);
//s.add(1);
//s.add(1);
//s.add(7);
////s.remove(7);
//        System.out.println(s);
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        pq.add(50);
//        pq.add(10);
//        pq.add(30);
//        pq.add(20);
//        System.out.println(pq);


    }
    public static String reverseString(String s){

        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length-1;
        char temp;
       while(start<end){
            temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
        return new String(arr);


    }
    public static int peakElement(int[] arr){

        int start = 0;
        int end = arr.length-1;
        while(start<end){

            int mid = (start + end )/2;
            if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }

        }
        return start;
    }




}
