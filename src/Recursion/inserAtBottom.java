package Recursion;

import java.util.Stack;

public class inserAtBottom {
    static void main() {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println(insertBottom(s,4));
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
