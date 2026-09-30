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
        return insertBottom(s, pop);

    }
    public static Stack<Integer> insertBottom(Stack<Integer> stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return stack;
        }
        Integer pop = stack.pop();
        Stack<Integer> stack1 = insertBottom(stack, element);
        stack1.push(pop);
        return stack1;

    }




}
