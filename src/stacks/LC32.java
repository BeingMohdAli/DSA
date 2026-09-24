package stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LC32 {
    static void main() {
String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    int currentLength = i - stack.peek();
                    maxlength = Math.max(currentLength,maxlength);
                }
            }
        }
return maxlength;
    }
}
