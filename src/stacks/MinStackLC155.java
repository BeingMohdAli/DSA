package stacks;

import java.util.PriorityQueue;
import java.util.Stack;

public class MinStackLC155 {
    static void main() {

    }

}

//class MinStack {
//    Stack<Integer> s ;
//    PriorityQueue<Integer> q;
//    public MinStack() {
//    this.s = new Stack<>();
//    this.q = new PriorityQueue<>();
//    }
//
//    public void push(int value) {
//    s.push(value);
//    q.add(value);
//    }
//
//
//    public void pop() {
//        Integer pop = s.pop();
//        q.remove(pop);
//    }
//
//    public int top() {
//        return s.peek();
//    }
//
//    public int getMin() {
//          return q.peek();
//    }
//}

class MinStack {
    Stack<Integer> s1 ;
    Stack<Integer> s2 ;

    public MinStack() {
        this.s1  = new Stack<>();
        this.s2  = new Stack<>();
    }

    public void push(int value) {
      if(s1.isEmpty()&&s2.isEmpty()){
          s1.push(value);
          s2.push(value);

      }
        else if(value <= s2.peek()){
            s1.push(value);
            s2.push(value);
        }else{
            s1.push(value);
            Integer peek = s2.peek();
            s2.push(peek);
        }

    }

    public void pop() {
        s1.pop();
        s2.pop();

    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();

    }
}

