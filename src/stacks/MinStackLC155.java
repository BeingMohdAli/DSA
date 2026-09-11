package stacks;

import java.util.PriorityQueue;
import java.util.Stack;

public class MinStackLC155 {
    static void main() {

    }

}

class MinStack {
    Stack<Integer> s ;
    PriorityQueue<Integer> q;
    public MinStack() {
    this.s = new Stack<>();
    this.q = new PriorityQueue<>();
    }

    public void push(int value) {
    s.push(value);
    q.add(value);
    }


    public void pop() {
        Integer pop = s.pop();
        q.remove(pop);
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
          return q.peek();
    }
}