package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC17 {
    static void main() {
        System.out.println(combination("23",0,""));
    }

    public static List<String> combination(String digit,int index,String pro){
        Map<Character,String> map = new HashMap<>();
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        if (index == digit.length()) {
            List<String> l = new ArrayList<>();
            l.add(pro);
            return l;
        }
        char c = digit.charAt(index);
        String s = map.get(c);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            List<String> combination = combination(digit, index + 1, pro + s.charAt(i));
            l.addAll(combination);

        }

    return l;

    }
}
