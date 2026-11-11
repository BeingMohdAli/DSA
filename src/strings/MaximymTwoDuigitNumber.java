package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximymTwoDuigitNumber {
    static void main() {
        char c = '1';
        int i = c - '0';
        System.out.println(i);
    }
    public static int max2(String s ){
        List<String> l = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length-1; i++) {
            char c = charArray[i];
            char c1 = charArray[i + 1];
            l.add(c + "" + c1);

        }
       List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            l1.add(Integer.parseInt(l.get(i)));
        }
int min = Integer.MIN_VALUE;
        for (var e : l1){
            if (e>min){
                min = e;
            }
        }
return min;
    }
    public static int secondMax(int[] arr) {
       return -1;
    }
}
