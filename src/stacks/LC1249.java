package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class LC1249 {
    static void main() {
String s =  "(a(b(c)d)";
        System.out.println(minRemoveToMakeValid(s));
    }

    public static String minRemoveToMakeValid(String s) {
        ArrayList<String> list = new ArrayList<>(
                Arrays.asList(s.split(""))
        );
            Stack<Integer> stack = new Stack<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("(")){
                stack.push(i);
            }else if(list.get(i).equals(")")){
                if(stack.isEmpty()){
                    hs.add(i);
                }
                else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            hs.add(stack.pop());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (hs.contains(i)) {
                list.remove(i);
            }
        }

        return String.join("",list);
    }
}
