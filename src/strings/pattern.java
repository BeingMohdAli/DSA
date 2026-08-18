package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class pattern {

    static void main() {
//        int rowLength = 4;
//        int colLength = 4;
//        for (int row = 1; row <=rowLength; row++) {
//            for (int col = 1; col <=colLength ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println(
//            );
//            colLength--;


//        String str = "  Hello    World   Java  ";
//
//        String[] words = str.trim().split("\\s+");
//
//        System.out.println(Arrays.toString(words));
//       int start = 0;
//       int end = words.length-1;
//       while(start<end){
//           String temp = words[start];
//           words[start] = words[end];
//           words[end] = temp;
//           start++;
//           end--;


//       }
//        System.out.println(Arrays.toString(words));
//       String s = new String(words);
//
//        String s = "Hello world";
//        String str = "";
//        for (int i = s.length()-1; i >=0 ; i--) {
//            str = s.charAt(i) + str;
//            if(s.charAt(i)==' '){
//                continue;
//            }
//
//
//        }
//
//        System.out.println(str);

//        String s = "(()())(())";
//        char[] charArray = s.toCharArray();
//        System.out.println(Arrays.toString(charArray));
//        StringBuilder sb = new StringBuilder();
//        sb.append("a");
//        sb.append("l");
//        System.out.println(sb.toString());
//        String[] arr = {"a", "b", "c"};
//
//        String join = String.join("", arr);// "abc"
//        Arrays.so
//        String s = "Hello";
//
//        s = s + " World";
//        System.out.println(s);
//Weak

//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        System.out.println(a+2);

//        System.out.println('d'-'a');


//        List<Integer> integers = List.of(1, 3);
//        System.out.println(integers);
//        List<Integer> l = new ArrayList<>();
//        l.add(1);
//        l.add(5);
//        l.add(2);
//        l.add(3);
//
//        System.out.println(sort(l));
        num(5);
//
    }
//    public static List<Integer> sort(List<Integer> l){
//
//        if(l.size()==1){
//            return l;
//        }
//
//       int removedElement = l.remove(l.size()-1);
//        sort(l);
//        for (int i = 0; i < l.size(); i++) {
//
//            if (l.get(i) <= removedElement) {
//                continue;              // keep searching
//            } else {
//                l.add(i, removedElement);
//                return l;              // we're done
//            }
//        }
//
//        l.add(removedElement);         // bigger than everything
//        return l;
//
//    }

    public static void num(int n){

        if(n==1){
            System.out.println(1);
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        num(n-1);
        System.out.println(n);

    }

}

