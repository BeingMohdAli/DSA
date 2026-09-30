package Recursion;

import java.util.Stack;

public class ReverseAStack {
    static void main() {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println(reverseStackEfficiently(s));
    }
    public static Stack<Integer> reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return stack;
        }
        int pop = stack.pop();
        Stack<Integer> s = reverseStack(stack);
        s.add(0,pop);
        return s;
    }
    public static Stack<Integer> reverseStackEfficiently(Stack<Integer> stack){
        if(stack.isEmpty()){
            return stack;
        }
        int pop = stack.pop();
        Stack<Integer> s = reverseStackEfficiently(stack);
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()){
            temp.push(s.pop());
        }
        s.push(pop);
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }

        return s;

    }




}
