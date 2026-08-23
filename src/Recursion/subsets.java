package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {
    static void main() {
        List<String> l = new ArrayList<>();
//        subsetsOfString("abc","",l);
//        System.out.println(l);
        subSets("","abc",l);
        System.out.println(l);
    }
//    public static void subsetsOfString(String input, String output, List<String> l){
//        if(input.isEmpty()){
//          l.add(output);
//            return;
//        }
//        char c = input.charAt(0);
//        subsetsOfString(input.substring(1),output+c,l);
//        subsetsOfString(input.substring(1),output,l);
//
//    }

    public static void subSets(String p , String up, List<String> l) {
        if (up.isBlank()) {
            l.add(p);
            return;

        }
        char c = up.charAt(0);


        subSets(p + c, up.substring(1), l);
        subSets(p , up.substring(1), l);

    }
    }