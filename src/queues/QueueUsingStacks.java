package queues;

import java.util.Stack;

public class QueueUsingStacks {
    static void main() {
        MyQueue q = new MyQueue();
//        q.push(23);
//        q.push(27);
        System.out.println(q.pop());
//        System.out.println(q.peek());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
    }


}

class MyQueue {
    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;


    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x) {
    stack1.push(x);
    }


    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }
    public boolean empty() {
        return stack1.empty()&&stack2.empty();
    }


}


